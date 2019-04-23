package com.hbt.semillero.servicios.ejb;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.hbt.semillero.servicios.interfaces.IConsultasRestaurante;

import com.hbt.semillero.dto.PlatoDTO;
import com.hbt.semillero.dto.ResultadoDTO;
import com.hbt.semillero.dto.BebidaDTO;
import com.hbt.semillero.dto.ClienteDTO;
import com.hbt.semillero.dto.FacturaDTO;
import com.hbt.semillero.dto.FacturaDetalleDTO;

import com.hbt.semillero.entidades.Plato;
import com.hbt.semillero.entidades.Bebida;
import com.hbt.semillero.entidades.Cliente;
import com.hbt.semillero.entidades.Factura;
import com.hbt.semillero.entidades.FacturaDetalle;

/**
 * EJB con las consultas del restaurante
 * @author Gustavo Gaviria
 *
 */

@Stateless
public class ConsultasRestaurante implements IConsultasRestaurante {
	
	@PersistenceContext
	private EntityManager em;

	/**
	 * M�todo que nos sirve para retornar todos los platos disponibles en el sistema
	 * @author Gustavo Gaviria
	 * {@link com.hbt.semillero.servicios.interfaces.IConsultasRestaurante#consultarPlatos()}
	 */
	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<PlatoDTO> consultarPlatos() {
		List<Plato> platos = em.createQuery("Select pl from PLATO pl").getResultList();
		List<PlatoDTO> retornoPlatos = new ArrayList<>();
		for (Plato plato : platos) {
			PlatoDTO platoDto = construirPlatoDTO(plato);
			retornoPlatos.add(platoDto);
		}
		return retornoPlatos;
	}
	
	
	/**
	 * M�todo que nos sirve para retornar todos las bebidas disponibles en el sistema
	 * @author Gustavo Gaviria
	 * {@link com.hbt.semillero.servicios.interfaces.IConsultasRestaurante#consultarBebidas()}
	 */
	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<BebidaDTO> consultarBebidas() {
		List<Bebida> bebidas = em.createQuery("Select be from BEBIDA be").getResultList();
		List<BebidaDTO> retornoBebidas = new ArrayList<>();
		for (Bebida bebida : bebidas) {
			BebidaDTO bebidaDto = construirBebidaDTO(bebida);
			retornoBebidas.add(bebidaDto);
		}
		return retornoBebidas;
	}
	
	
	/**
	 * m�todo que almacena el pedido como factura en el sistema
	 * {@link com.hbt.semillero.servicios.interfaces.IConsultasRestaurante#crearPedido(PedidoDTO)}
	 */
	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public ResultadoDTO crearPedido(FacturaDTO facturaDTO) {
		try {
			//if (facturaDTO.getFecha() <= (Date) Calendar.getInstance()) {
				Factura factura = new Factura();
				Cliente cliente = new Cliente();
				Plato plato = new Plato();
				Bebida bebida =  new Bebida();
				
				ClienteDTO clienteDTO = new ClienteDTO();
				PlatoDTO platoDTO = new PlatoDTO();
				BebidaDTO bebidaDTO = new BebidaDTO();
				
				factura.setCliente(cliente);
				
				FacturaDetalle detalle =  new FacturaDetalle();
				detalle.setPlato(plato);
				detalle.setBebida(bebida);
				detalle.setPrecio_unitario(detalle.getPrecio_unitario()+platoDTO.getPrecio());
				detalle.setPrecio_unitario(detalle.getPrecio_unitario()+bebidaDTO.getPrecio());
				detalle.setFactura(factura);
				
				factura.setIva((platoDTO.getPrecio()*100/5)+(bebidaDTO.getPrecio()*100/5));
				factura.setTotal(platoDTO.getPrecio()+bebidaDTO.getPrecio()+factura.getIva());
				
				em.persist(factura);
				em.persist(detalle);
			/*}else{
				return new ResultadoDTO(false, "La fecha de facturaci�n debe ser igual o menor a la fecha actual");
			}*/
		} catch (Exception e) {
			return new ResultadoDTO(false, e.getMessage());
		}

		return new ResultadoDTO(true, "Creado de forma exitosa");
	}
	
	
	
	/**
	 * Construye un DTO de PlatoDTO
	 * 
	 * @param plato
	 * @return
	 */
	private PlatoDTO construirPlatoDTO(Plato plato) {
		PlatoDTO platoDto = new PlatoDTO();
		platoDto.setIdPlato(plato.getIdPlato());
		platoDto.setNombre(plato.getNombre());
		platoDto.setDescripcion(plato.getDescripcion());
		platoDto.setPrecio(plato.getPrecio());
		return platoDto;
	}
	
	
	/**
	 * Construye un DTO de BebidaDTO
	 * 
	 * @param bebida
	 * @return
	 */
	private BebidaDTO construirBebidaDTO(Bebida bebida) {
		BebidaDTO bebidaDto = new BebidaDTO();
		bebidaDto.setIdBebida(bebida.getIdBebida());
		bebidaDto.setNombre(bebida.getNombre());
		bebidaDto.setPrecio(bebida.getPrecio());
		return bebidaDto;
	}
	
	
	/**
	 * Asigna los atributos de un pedido(Factura)
	 * 
	 * @param plato
	 * @param bebida
	 * @param cliente
	 */
	private Factura asignarAtributosBasicosFactura(PlatoDTO platoDTO,BebidaDTO bebidaDTO,ClienteDTO clienteDTO) {
		Factura factura = new Factura();
		Cliente cliente = new Cliente();
		Plato plato = new Plato();
		Bebida bebida = new Bebida();
		
		factura.setCliente(cliente);
		
		FacturaDetalle detalle =  new FacturaDetalle();
		detalle.setPlato(plato);
		detalle.setBebida(bebida);
		detalle.setPrecio_unitario(detalle.getPrecio_unitario()+platoDTO.getPrecio());
		detalle.setPrecio_unitario(detalle.getPrecio_unitario()+bebidaDTO.getPrecio());
		detalle.setFactura(factura);
		
		factura.setIva((platoDTO.getPrecio()*100/5)+(bebidaDTO.getPrecio()*100/5));
		factura.setTotal(platoDTO.getPrecio()+bebidaDTO.getPrecio()+factura.getIva());
		
		return factura;
	}
	
}
