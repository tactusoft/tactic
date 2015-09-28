package com.tacticlogistics.model.entities;
// Generated 28/09/2015 11:33:59 AM by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TiposIdentificacion generated by hbm2java
 */
@Entity
@Table(name = "Tipos_Identificacion", catalog = "dbo")
public class TiposIdentificacion implements java.io.Serializable {

	private String tipoIdentificacionId;
	private String nombre;
	private short ordinal;
	private boolean activo;
	private Date fechaActualizacion;
	private String usuarioActualizacion;
	private Set<ClientesFinales> clientesFinaleses = new HashSet<ClientesFinales>(0);
	private Set<OrdenesTransporte> ordenesTransportes = new HashSet<OrdenesTransporte>(0);
	private Set<Clientes> clienteses = new HashSet<Clientes>(0);

	public TiposIdentificacion() {
	}

	public TiposIdentificacion(String tipoIdentificacionId, String nombre, short ordinal, boolean activo,
			Date fechaActualizacion, String usuarioActualizacion) {
		this.tipoIdentificacionId = tipoIdentificacionId;
		this.nombre = nombre;
		this.ordinal = ordinal;
		this.activo = activo;
		this.fechaActualizacion = fechaActualizacion;
		this.usuarioActualizacion = usuarioActualizacion;
	}

	public TiposIdentificacion(String tipoIdentificacionId, String nombre, short ordinal, boolean activo,
			Date fechaActualizacion, String usuarioActualizacion, Set<ClientesFinales> clientesFinaleses,
			Set<OrdenesTransporte> ordenesTransportes, Set<Clientes> clienteses) {
		this.tipoIdentificacionId = tipoIdentificacionId;
		this.nombre = nombre;
		this.ordinal = ordinal;
		this.activo = activo;
		this.fechaActualizacion = fechaActualizacion;
		this.usuarioActualizacion = usuarioActualizacion;
		this.clientesFinaleses = clientesFinaleses;
		this.ordenesTransportes = ordenesTransportes;
		this.clienteses = clienteses;
	}

	@Id

	@Column(name = "Tipo_Identificacion_Id", unique = true, nullable = false, length = 2)
	public String getTipoIdentificacionId() {
		return this.tipoIdentificacionId;
	}

	public void setTipoIdentificacionId(String tipoIdentificacionId) {
		this.tipoIdentificacionId = tipoIdentificacionId;
	}

	@Column(name = "Nombre", nullable = false, length = 200)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "Ordinal", nullable = false)
	public short getOrdinal() {
		return this.ordinal;
	}

	public void setOrdinal(short ordinal) {
		this.ordinal = ordinal;
	}

	@Column(name = "Activo", nullable = false)
	public boolean isActivo() {
		return this.activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Fecha_Actualizacion", nullable = false, length = 19)
	public Date getFechaActualizacion() {
		return this.fechaActualizacion;
	}

	public void setFechaActualizacion(Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}

	@Column(name = "Usuario_Actualizacion", nullable = false, length = 50)
	public String getUsuarioActualizacion() {
		return this.usuarioActualizacion;
	}

	public void setUsuarioActualizacion(String usuarioActualizacion) {
		this.usuarioActualizacion = usuarioActualizacion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tiposIdentificacion")
	public Set<ClientesFinales> getClientesFinaleses() {
		return this.clientesFinaleses;
	}

	public void setClientesFinaleses(Set<ClientesFinales> clientesFinaleses) {
		this.clientesFinaleses = clientesFinaleses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tiposIdentificacion")
	public Set<OrdenesTransporte> getOrdenesTransportes() {
		return this.ordenesTransportes;
	}

	public void setOrdenesTransportes(Set<OrdenesTransporte> ordenesTransportes) {
		this.ordenesTransportes = ordenesTransportes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tiposIdentificacion")
	public Set<Clientes> getClienteses() {
		return this.clienteses;
	}

	public void setClienteses(Set<Clientes> clienteses) {
		this.clienteses = clienteses;
	}

}
