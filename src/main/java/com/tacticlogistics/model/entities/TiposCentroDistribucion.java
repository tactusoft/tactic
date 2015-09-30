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
 * TiposCentroDistribucion generated by hbm2java
 */
@Entity
@Table(name = "Tipos_Centro_Distribucion", catalog = "dbo")
public class TiposCentroDistribucion implements java.io.Serializable {

	private byte tipoCentroDistribucionId;
	private String codigo;
	private String nombre;
	private String descripcion;
	private short ordinal;
	private boolean activo;
	private Date fechaActualizacion;
	private String usuarioActualizacion;
	private Set<CentrosDistribucion> centrosDistribucions = new HashSet<CentrosDistribucion>(0);

	public TiposCentroDistribucion() {
	}

	public TiposCentroDistribucion(byte tipoCentroDistribucionId, String codigo, String nombre, String descripcion,
			short ordinal, boolean activo, Date fechaActualizacion, String usuarioActualizacion) {
		this.tipoCentroDistribucionId = tipoCentroDistribucionId;
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.ordinal = ordinal;
		this.activo = activo;
		this.fechaActualizacion = fechaActualizacion;
		this.usuarioActualizacion = usuarioActualizacion;
	}

	public TiposCentroDistribucion(byte tipoCentroDistribucionId, String codigo, String nombre, String descripcion,
			short ordinal, boolean activo, Date fechaActualizacion, String usuarioActualizacion,
			Set<CentrosDistribucion> centrosDistribucions) {
		this.tipoCentroDistribucionId = tipoCentroDistribucionId;
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.ordinal = ordinal;
		this.activo = activo;
		this.fechaActualizacion = fechaActualizacion;
		this.usuarioActualizacion = usuarioActualizacion;
		this.centrosDistribucions = centrosDistribucions;
	}

	@Id

	@Column(name = "Tipo_Centro_Distribucion_Id", unique = true, nullable = false)
	public byte getTipoCentroDistribucionId() {
		return this.tipoCentroDistribucionId;
	}

	public void setTipoCentroDistribucionId(byte tipoCentroDistribucionId) {
		this.tipoCentroDistribucionId = tipoCentroDistribucionId;
	}

	@Column(name = "Codigo", nullable = false, length = 20)
	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Column(name = "Nombre", nullable = false, length = 50)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "Descripcion", nullable = false, length = 200)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tiposCentroDistribucion")
	public Set<CentrosDistribucion> getCentrosDistribucions() {
		return this.centrosDistribucions;
	}

	public void setCentrosDistribucions(Set<CentrosDistribucion> centrosDistribucions) {
		this.centrosDistribucions = centrosDistribucions;
	}

}