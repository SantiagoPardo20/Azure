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
@Entity
@Table(name="Base")
public class Base implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_base;
	private String nombre_base;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "id_base")
	private List<Tripulacion> tripulacions;

	public List<Tripulacion> getTripulacions() {
		return tripulacions;
	}


	public void setTripulacions(List<Tripulacion> tripulacions) {
		this.tripulacions = tripulacions;
	}


	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "id_base")
	private List<Aviones> aviones;


	public List<Aviones> getAviones() {
		return aviones;
	}


	public void setAviones(List<Aviones> aviones) {
		this.aviones = aviones;
	}


	public Long getId_base() {
		return id_base;
	}


	public void setId_base(Long id_base) {
		this.id_base = id_base;
	}

	

	public String getNombre_base() {
		return nombre_base;
	}


	public void setNombre_base(String nombre_base) {
		this.nombre_base = nombre_base;
	}


}
