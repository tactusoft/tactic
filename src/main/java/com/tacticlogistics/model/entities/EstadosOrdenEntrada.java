package com.tacticlogistics.model.entities;
// Generated 23-ago-2015 19:13:34 by Hibernate Tools 4.3.1

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
import javax.persistence.UniqueConstraint;

/**
 * EstadosOrdenEntrada generated by hbm2java
 */
@Entity
@Table(name = "Estados_Orden_Entrada", schema = "demo", catalog = "esbTactic", uniqueConstraints = @UniqueConstraint(columnNames = "Codigo") )
public class EstadosOrdenEntrada implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String codigo;
	private String nombre;
	private String descripcion;
	private boolean terminal;
	private Date fechaModificacion;
	private String usuarioModificacion;
	private Set<OrdenesEntrada> ordenesEntradas = new HashSet<OrdenesEntrada>(0);

	public EstadosOrdenEntrada() {
	}

	public EstadosOrdenEntrada(Integer id, String codigo, String nombre, String descripcion, boolean terminal,
			Date fechaModificacion, String usuarioModificacion) {
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.terminal = terminal;
		this.fechaModificacion = fechaModificacion;
		this.usuarioModificacion = usuarioModificacion;
	}

	public EstadosOrdenEntrada(Integer id, String codigo, String nombre, String descripcion, boolean terminal,
			Date fechaModificacion, String usuarioModificacion, Set<OrdenesEntrada> ordenesEntradas) {
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.terminal = terminal;
		this.fechaModificacion = fechaModificacion;
		this.usuarioModificacion = usuarioModificacion;
		this.ordenesEntradas = ordenesEntradas;
	}

	@Id

	@Column(name = "Id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "Codigo", unique = true, nullable = false, length = 50)
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

	@Column(name = "Terminal", nullable = false)
	public boolean isTerminal() {
		return this.terminal;
	}

	public void setTerminal(boolean terminal) {
		this.terminal = terminal;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Fecha_Modificacion", nullable = false, length = 23)
	public Date getFechaModificacion() {
		return this.fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	@Column(name = "Usuario_Modificacion", nullable = false, length = 50)
	public String getUsuarioModificacion() {
		return this.usuarioModificacion;
	}

	public void setUsuarioModificacion(String usuarioModificacion) {
		this.usuarioModificacion = usuarioModificacion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "estadosOrdenEntrada")
	public Set<OrdenesEntrada> getOrdenesEntradas() {
		return this.ordenesEntradas;
	}

	public void setOrdenesEntradas(Set<OrdenesEntrada> ordenesEntradas) {
		this.ordenesEntradas = ordenesEntradas;
	}

}