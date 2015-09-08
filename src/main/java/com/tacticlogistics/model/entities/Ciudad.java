package com.tacticlogistics.model.entities;
// Generated 23-ago-2015 19:13:34 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Ciudad generated by hbm2java
 */
@Entity
@Table(name = "Ciudad", schema = "demo", catalog = "esbTactic")
public class Ciudad implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Pais pais;
	private String codigo;
	private String nombre;

	public Ciudad() {
	}

	public Ciudad(Integer id, Pais pais, String codigo, String nombre) {
		this.id = id;
		this.pais = pais;
		this.codigo = codigo;
		this.nombre = nombre;
	}

	@Id
	@Column(name = "Id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "Id_Pais", nullable = false)
	public Pais getPais() {
		return this.pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	@Column(name = "Codigo", nullable = false)
	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Column(name = "Nombre", nullable = false)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}