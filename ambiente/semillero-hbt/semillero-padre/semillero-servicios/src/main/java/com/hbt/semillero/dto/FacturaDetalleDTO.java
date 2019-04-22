package com.hbt.semillero.dto;

import java.io.Serializable;

public class FacturaDetalleDTO implements Serializable {
	
	/*
	 * dto con los campos del detalle de la factura de compra
	 */
	
	/**
	 * Serial
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Identificador único del detalle la factura
	 */
	private Long idFacturaDetalle;
	
	/*
	 * principal con el encabezado de la factura de compra
	 */
	private FacturaDTO factura;
	
	/*
	 * principal con el plato adquirido por el cliente
	 * 
	 */
	private PlatoDTO plato;
	
	/*
	 * principal con la bebida consumida por el cliente
	 */
	private BebidaDTO bebida;
	
	/*
	 * valor del consumo total factudado al cliente
	 */
	private double precio_unitario;

	/**
	 * @return the idFacturaDetalle
	 */
	public Long getIdFacturaDetalle() {
		return idFacturaDetalle;
	}

	/**
	 * @param idFacturaDetalle the idFacturaDetalle to set
	 */
	public void setIdFacturaDetalle(Long idFacturaDetalle) {
		this.idFacturaDetalle = idFacturaDetalle;
	}

	/**
	 * @return the factura
	 */
	public FacturaDTO getFactura() {
		return factura;
	}

	/**
	 * @param factura the factura to set
	 */
	public void setFactura(FacturaDTO factura) {
		this.factura = factura;
	}

	/**
	 * @return the plato
	 */
	public PlatoDTO getPlato() {
		return plato;
	}

	/**
	 * @param plato the plato to set
	 */
	public void setPlato(PlatoDTO plato) {
		this.plato = plato;
	}

	/**
	 * @return the bebida
	 */
	public BebidaDTO getBebida() {
		return bebida;
	}

	/**
	 * @param bebida the bebida to set
	 */
	public void setBebida(BebidaDTO bebida) {
		this.bebida = bebida;
	}

	/**
	 * @return the precio_unitario
	 */
	public double getPrecio_unitario() {
		return precio_unitario;
	}

	/**
	 * @param precio_unitario the precio_unitario to set
	 */
	public void setPrecio_unitario(double precio_unitario) {
		this.precio_unitario = precio_unitario;
	}
	
	
	

}
