package com.hbt.semillero.servicios.interfaces;

import java.util.List;

import javax.ejb.Local;

import com.hbt.semillero.dto.PlatoDTO;
import com.hbt.semillero.dto.ResultadoDTO;
import com.hbt.semillero.dto.BebidaDTO;
import com.hbt.semillero.dto.FacturaDTO;

@Local
public interface IConsultasRestaurante {
	
	/**
	 * Consulta los platos disponibles en el sistema
	 * 
	 * @return
	 */
	public List<PlatoDTO> consultarPlatos();

	/**
	 * Consulta las bebidas disponibles en el sistema
	 * 
	 * @return
	 */
	public List<BebidaDTO> consultarBebidas();
	
	/**
	 * Crea las facturas con los respectivos detalles dentro del sistema
	 * 
	 * @param facturaDTO
	 * @return
	 */
	public ResultadoDTO crearPedido(FacturaDTO facturaDTO);
}
