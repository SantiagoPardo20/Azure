package com.example.tarea.modelo.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;


@Entity
@Table(name="Aviones", uniqueConstraints  = {@UniqueConstraint(columnNames = {"id_base"})})
public class Aviones implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_avion;

	private String codigo;
	private String tipo;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "id_avion")
	private List<Vuelos> vuelos;
	
	public List<Vuelos> getVuelos() {
		return vuelos;
	}

	public void setVuelos(List<Vuelos> vuelos) {
		this.vuelos = vuelos;
	}

	public Long getId_avion() {
		return id_avion;
	}

	public void setId_avion(Long id_avion) {
		this.id_avion = id_avion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	

}
