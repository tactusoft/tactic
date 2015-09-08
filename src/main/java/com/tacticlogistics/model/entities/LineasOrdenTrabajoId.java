package com.tacticlogistics.model.entities;
// Generated 23-ago-2015 19:13:34 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * LineasOrdenTrabajoId generated by hbm2java
 */
@Embeddable
public class LineasOrdenTrabajoId implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer idOrdenTrabajo;
	private Integer numeroLinea;

	public LineasOrdenTrabajoId() {
	}

	public LineasOrdenTrabajoId(Integer idOrdenTrabajo, Integer numeroLinea) {
		this.idOrdenTrabajo = idOrdenTrabajo;
		this.numeroLinea = numeroLinea;
	}

	@Column(name = "Id_Orden_Trabajo", nullable = false)
	public Integer getIdOrdenTrabajo() {
		return this.idOrdenTrabajo;
	}

	public void setIdOrdenTrabajo(Integer idOrdenTrabajo) {
		this.idOrdenTrabajo = idOrdenTrabajo;
	}

	@Column(name = "Numero_Linea", nullable = false)
	public Integer getNumeroLinea() {
		return this.numeroLinea;
	}

	public void setNumeroLinea(Integer numeroLinea) {
		this.numeroLinea = numeroLinea;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof LineasOrdenTrabajoId))
			return false;
		LineasOrdenTrabajoId castOther = (LineasOrdenTrabajoId) other;

		return (this.getIdOrdenTrabajo() == castOther.getIdOrdenTrabajo())
				&& (this.getNumeroLinea() == castOther.getNumeroLinea());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdOrdenTrabajo();
		result = 37 * result + this.getNumeroLinea();
		return result;
	}

}