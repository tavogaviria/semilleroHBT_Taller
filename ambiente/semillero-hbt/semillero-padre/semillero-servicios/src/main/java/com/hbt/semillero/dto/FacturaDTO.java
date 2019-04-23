package com.hbt.semillero.dto;

import java.io.Serializable;
import java.util.Date;

public class FacturaDTO implements Serializable {

	/*
	 * clase dto de la clase factura con los atributos correspondientes a el encabezado de la factura
	 * @autor Gustavo Gaviria
	 */
	
	/**
	 * Serial
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Identificador unico de la factura
	 */
	private Long idFactura;
	
	/*
	 * Campo con los datos del cliente al cual se le factura
	 */
	private ClienteDTO cliente;
	
	/*
	 * Campo con los datos del iva a cobrar
	 */
	private double iva;
	
	/*
	 * Campo con los datos del total de la factura del cliente
	 */
	private double total;
	
	/*
	 * Campo con la fecha de realizacion de la factura
	 */
	private Date fecha;

	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the idFactura
	 */
	public Long getIdFactura() {
		return idFactura;
	}

	/**
	 * @param idFactura the idFactura to set
	 */
	public void setIdFactura(Long idFactura) {
		this.idFactura = idFactura;
	}

	/**
	 * @return the cliente
	 */
	public ClienteDTO getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(ClienteDTO cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the iva
	 */
	public double getIva() {
		return iva;
	}

	/**
	 * @param iva the iva to set
	 */
	public void setIva(double iva) {
		this.iva = iva;
	}

	/**
	 * @return the total
	 */
	public double getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(double total) {
		this.total = total;
	}
	
	
	
}
