package com.example.tarea.modelo.services;

import java.util.List;

import com.example.tarea.modelo.entity.Tripulacion;


public interface ITripulacionService {
	public List<Tripulacion> FindAll();
	public Tripulacion save(Tripulacion tripulacion);
	public Tripulacion findByid(long id);
	public void delet(long id);

}
