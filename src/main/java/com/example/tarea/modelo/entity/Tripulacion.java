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
@Table(name="Tripulacion", uniqueConstraints  = {@UniqueConstraint(columnNames = {"id_base"})})
public class Tripulacion implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_tripulacion;
	private String codigo;
	private String apellido_piloto;
	private String nombre_piloto;
	private String horas;
	private Boolean piloto_si_no;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "id_tripulacion")
	private List<Tripu_Vuelo> tripu_Vuelos;
	
	
	public List<Tripu_Vuelo> getTripu_Vuelos() {
		return tripu_Vuelos;
	}
	public void setTripu_Vuelos(List<Tripu_Vuelo> tripu_Vuelos) {
		this.tripu_Vuelos = tripu_Vuelos;
	}

	public Long getId_tripulacion() {
		return id_tripulacion;
	}



	public void setId_tripulacion(Long id_tripulacion) {
		this.id_tripulacion = id_tripulacion;
	}



	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	public String getApellido_piloto() {
		return apellido_piloto;
	}



	public void setApellido_piloto(String apellido_piloto) {
		this.apellido_piloto = apellido_piloto;
	}



	public String getNombre_piloto() {
		return nombre_piloto;
	}



	public void setNombre_piloto(String nombre_piloto) {
		this.nombre_piloto = nombre_piloto;
	}



	public String getHoras() {
		return horas;
	}



	public void setHoras(String horas) {
		this.horas = horas;
	}



	public Boolean getPiloto_si_no() {
		return piloto_si_no;
	}



	public void setPiloto_si_no(Boolean piloto_si_no) {
		this.piloto_si_no = piloto_si_no;
	}



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
