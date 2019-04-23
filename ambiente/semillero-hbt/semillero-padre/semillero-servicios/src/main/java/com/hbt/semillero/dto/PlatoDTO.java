package com.hbt.semillero.dto;

import java.io.Serializable;

public class PlatoDTO implements Serializable {
	
	/*
	 * clase dto de la clase plato con los atributos correspondientes
	 * @autor Gustavo Gaviria
	 */
	
	/**
	 * Serial
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Identificador unico del plato
	 */
	private Long idPlato;

	/**
	 * Nombre del plato.
	 */
	private String nombre;
	/**
	 * precio del plato
	 */
	private double precio;
	
	/*
	 * descripcion detallada del contenido del plato
	 */
	private String descripcion;

	/**
	 * @return the idPlato
	 */
	public Long getIdPlato() {
		return idPlato;
	}

	/**
	 * @param idPlato the idPlato to set
	 */
	public void setIdPlato(Long idPlato) {
		this.idPlato = idPlato;
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

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
