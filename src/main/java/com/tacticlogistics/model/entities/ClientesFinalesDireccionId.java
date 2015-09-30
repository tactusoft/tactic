package com.tacticlogistics.model.entities;
// Generated 28/09/2015 11:33:59 AM by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ClientesFinalesDireccionId generated by hbm2java
 */
@Embeddable
public class ClientesFinalesDireccionId implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer clienteFinalId;
	private Integer direccionId;

	public ClientesFinalesDireccionId() {
	}

	public ClientesFinalesDireccionId(Integer clienteFinalId, Integer direccionId) {
		this.clienteFinalId = clienteFinalId;
		this.direccionId = direccionId;
	}

	@Column(name = "Cliente_Final_Id", nullable = false)
	public Integer getClienteFinalId() {
		return this.clienteFinalId;
	}

	public void setClienteFinalId(Integer clienteFinalId) {
		this.clienteFinalId = clienteFinalId;
	}

	@Column(name = "Direccion_Id", nullable = false)
	public Integer getDireccionId() {
		return this.direccionId;
	}

	public void setDireccionId(Integer direccionId) {
		this.direccionId = direccionId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ClientesFinalesDireccionId))
			return false;
		ClientesFinalesDireccionId castOther = (ClientesFinalesDireccionId) other;

		return (this.getClienteFinalId() == castOther.getClienteFinalId())
				&& (this.getDireccionId() == castOther.getDireccionId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getClienteFinalId();
		result = 37 * result + this.getDireccionId();
		return result;
	}

}