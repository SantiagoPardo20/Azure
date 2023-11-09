package com.example.tarea.modelo.services;

import java.util.List;

import com.example.tarea.modelo.entity.Vuelos;

public interface IVuelosService {
	public List<Vuelos> FindAll();
	public Vuelos save(Vuelos vuelos);
	public Vuelos findByid(long id);
	public void delet(long id);

}
