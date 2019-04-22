package com.hbt.semillero.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entidad de la clase plato con los atributos
 * @author Gustavo Gaviria
 *
 */

@Entity
@Table(name = "PLATO")
public class Plato {
	
	@Id
	@GeneratedValue (generator = "SEQ")
	@Column(name = "PLATO_ID")
	private Long idPlato;

	@Column(name = "PLATO_NOMBRE")
	private String nombre;

	@Column(name = "PRECIO")
	private double precio;
	
	@Column(name = "PLATO_DESCRIPCION")
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
