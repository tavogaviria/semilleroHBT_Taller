package com.hbt.semillero.entidades;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entidad de la clase bebida con los atributos
 * @author Gustavo Gaviria
 *
 */

@Entity
@Table(name = "BEBIDA")
public class Bebida {
	
	@Id
	@GeneratedValue (generator = "SEQ")
	@Column(name = "BEBIDA_ID")
	private Long idBebida;

	@Column(name = "BEBIDA_NOMBRE")
	private String nombre;

	@Column(name = "PRECIO")
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
