package com.hbt.semillero.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Entidad de la clase del detalle de la factura con los atributos
 * @author Gustavo Gaviria
 *
 */

@Entity
@Table(name = "FACTURA_DETALLE")
public class FacturaDetalle {
	
	@Id
	@GeneratedValue (generator = "SEQ")
	@Column(name = "DETALLE_ID")
	private Long idDetalle;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FACTURA_ID")
	private Factura factura;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PLATO_ID")
	private Plato plato;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "BEBIDA_ID")
	private Bebida bebida;
	
	@Column(name = "PRECIO_UNITARIO")
	private double precio_unitario;

	/**
	 * @return the idDetalle
	 */
	public Long getIdDetalle() {
		return idDetalle;
	}

	/**
	 * @param idDetalle the idDetalle to set
	 */
	public void setIdDetalle(Long idDetalle) {
		this.idDetalle = idDetalle;
	}

	/**
	 * @return the factura
	 */
	public Factura getFactura() {
		return factura;
	}

	/**
	 * @param factura the factura to set
	 */
	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	/**
	 * @return the plato
	 */
	public Plato getPlato() {
		return plato;
	}

	/**
	 * @param plato the plato to set
	 */
	public void setPlato(Plato plato) {
		this.plato = plato;
	}

	/**
	 * @return the bebida
	 */
	public Bebida getBebida() {
		return bebida;
	}

	/**
	 * @param bebida the bebida to set
	 */
	public void setBebida(Bebida bebida) {
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

