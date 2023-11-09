package com.example.tarea.modelo.services;

import java.util.List;

import com.example.tarea.modelo.entity.Tripu_Vuelo;


public interface ITripuService {
	public List<Tripu_Vuelo> FindAll();
	public Tripu_Vuelo save(Tripu_Vuelo tripu_Vuelo);
	public Tripu_Vuelo findByid(long id);
	public void delet(long id);
}
