package com.example.tarea.modelo.services;

import java.util.List;

import com.example.tarea.modelo.entity.Base;


public interface IBaseService {
	public List<Base> FindAll();
	public Base save(Base base);
	public Base findByid(long id);
	public void delet(long id);
}
