package com.example.tarea.modelo.services;

import java.util.List;

import com.example.tarea.modelo.entity.Aviones;

public interface IAvionesService {
	
	public List<Aviones> FindAll();
	public Aviones save(Aviones aviones);
	public Aviones findByid(long id);
	public void delet(long id);
}
