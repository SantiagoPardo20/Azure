package com.example.tarea.modelo.entity;

import java.io.Serializable;
import java.util.Date;
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
@Table(name="Vuelos", uniqueConstraints  = {@UniqueConstraint(columnNames = {"id_avion"})})
public class Vuelos implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numero_vuelo;
	
	
	private String origen;
	private String Destino;
	private Date fecha;
	private String hora;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "numero_vuelo")
	private List<Tripu_Vuelo> tripu_Vuelos;
	
	
	public List<Tripu_Vuelo> getTripu_Vuelos() {
		return tripu_Vuelos;
	}
	public void setTripu_Vuelos(List<Tripu_Vuelo> tripu_Vuelos) {
		this.tripu_Vuelos = tripu_Vuelos;
	}
	public Long getNumero_vuelo() {
		return numero_vuelo;
	}
	public void setNumero_vuelo(Long numero_vuelo) {
		this.numero_vuelo = numero_vuelo;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return Destino;
	}
	public void setDestino(String destino) {
		Destino = destino;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	
}
