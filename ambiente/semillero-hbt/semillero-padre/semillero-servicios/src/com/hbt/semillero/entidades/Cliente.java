package com.hbt.semillero.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entidad de la clase cliente con los atributos
 * @author Gustavo Gaviria
 *
 */

@Entity
@Table(name = "CLIENTE")
public class Cliente {
	
	@Id
	@GeneratedValue (generator = "SEQ")
	@Column(name = "CLIENTE_ID")
	private Long idCliente;

	@Column(name = "CLIENTE_NOMBRE")
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
