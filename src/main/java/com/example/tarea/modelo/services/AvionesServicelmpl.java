package com.example.tarea.modelo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.tarea.modelo.dao.IAvionesDao;
import com.example.tarea.modelo.entity.Aviones;

@Service
public class AvionesServicelmpl implements IAvionesService{

	
	@Autowired
	private IAvionesDao avionesDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Aviones> FindAll() {
		return (List<Aviones>)avionesDao.findAll();
	}
	@Override
	@Transactional
	public Aviones save(Aviones aviones) {
		return avionesDao.save(aviones);
	}
	@Override
	@Transactional(readOnly = true)
	public Aviones findByid(long id) {
		// TODO Auto-generated method stub
		return avionesDao.findById(id).orElse(null);
	}
	@Override
	@Transactional
	public void delet(long id) {
		avionesDao.deleteById(id);
		
	}
	
}
