package com.tacticlogistics.model.entities;
// Generated 28/09/2015 11:33:59 AM by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * OrdenesTransporteObservacionId generated by hbm2java
 */
@Embeddable
public class OrdenesTransporteObservacionId implements java.io.Serializable {

	private int ordenTransporteId;
	private byte tipoObservacionOrdenTransporteId;

	public OrdenesTransporteObservacionId() {
	}

	public OrdenesTransporteObservacionId(int ordenTransporteId, byte tipoObservacionOrdenTransporteId) {
		this.ordenTransporteId = ordenTransporteId;
		this.tipoObservacionOrdenTransporteId = tipoObservacionOrdenTransporteId;
	}

	@Column(name = "Orden_Transporte_Id", nullable = false)
	public int getOrdenTransporteId() {
		return this.ordenTransporteId;
	}

	public void setOrdenTransporteId(int ordenTransporteId) {
		this.ordenTransporteId = ordenTransporteId;
	}

	@Column(name = "Tipo_Observacion_Orden_Transporte_Id", nullable = false)
	public byte getTipoObservacionOrdenTransporteId() {
		return this.tipoObservacionOrdenTransporteId;
	}

	public void setTipoObservacionOrdenTransporteId(byte tipoObservacionOrdenTransporteId) {
		this.tipoObservacionOrdenTransporteId = tipoObservacionOrdenTransporteId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof OrdenesTransporteObservacionId))
			return false;
		OrdenesTransporteObservacionId castOther = (OrdenesTransporteObservacionId) other;

		return (this.getOrdenTransporteId() == castOther.getOrdenTransporteId())
				&& (this.getTipoObservacionOrdenTransporteId() == castOther.getTipoObservacionOrdenTransporteId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getOrdenTransporteId();
		result = 37 * result + this.getTipoObservacionOrdenTransporteId();
		return result;
	}

}
