package com.example.tarea.modelo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.tarea.modelo.dao.IVuelosDao;
import com.example.tarea.modelo.entity.Vuelos;

@Service
public class VuelosServicelmlp implements IVuelosService{
	
	@Autowired
	private IVuelosDao vuelosDao;

	@Override
	@Transactional(readOnly = true)
	public List<Vuelos> FindAll() {
		return (List<Vuelos>)vuelosDao.findAll();
	}

	@Override
	@Transactional
	public Vuelos save(Vuelos vuelos) {
		return vuelosDao.save(vuelos);
	}

	@Override
	@Transactional(readOnly = true)
	public Vuelos findByid(long id) {
		return vuelosDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delet(long id) {
		vuelosDao.deleteById(id);
	}



}
