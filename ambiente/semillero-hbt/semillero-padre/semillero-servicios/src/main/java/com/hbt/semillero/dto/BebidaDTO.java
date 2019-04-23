package com.hbt.semillero.dto;


import java.io.Serializable;

public class BebidaDTO implements Serializable {

	/*
	 * clase dto de la clase bebida con los atributos correspondientes
	 * @autor Gustavo Gaviria
	 */
	
	/**
	 * Serial
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Identificador unico de la bebida
	 */
	private Long idBebida;

	/**
	 * Nombre de la bebida.
	 */
	private String nombre;
	
	
	/**
	 * precio de la bebida
	 */
	private double precio;


	/**
	 * @return the idBebida
	 */
	public Long getIdBebida() {
		return idBebida;
	}


	/**
	 * @param idBebida the idBebida to set
	 */
	public void setIdBebida(Long idBebida) {
		this.idBebida = idBebida;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}


	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
