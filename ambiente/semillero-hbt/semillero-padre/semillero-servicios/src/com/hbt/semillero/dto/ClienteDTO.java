package com.hbt.semillero.dto;

import java.io.Serializable;

public class ClienteDTO implements Serializable {

	/*
	 * clase dto de la clase cliente con los atributos correspondientes
	 * @autor Gustavo Gaviria
	 */
	
	/**
	 * Serial
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Identificador único del cliente
	 */
	private Long idCliente;
	
	/*
	 * nombre completo del cliente
	 */
	private String nombre;

	/**
	 * @return the idCliente
	 */
	public Long getIdCliente() {
		return idCliente;
	}

	/**
	 * @param idCliente the idCliente to set
	 */
	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
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
	
	
	
}
