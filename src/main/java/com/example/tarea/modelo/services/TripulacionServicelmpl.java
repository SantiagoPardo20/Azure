package com.example.tarea.modelo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.tarea.modelo.dao.ITripulacionDao;
import com.example.tarea.modelo.entity.Tripulacion;

@Service
public class TripulacionServicelmpl implements ITripulacionService {

	@Autowired
	private ITripulacionDao tripulacionDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Tripulacion> FindAll() {
		return (List<Tripulacion>)tripulacionDao.findAll();
	}

	@Override
	@Transactional
	public Tripulacion save(Tripulacion tripulacion) {
		return tripulacionDao.save(tripulacion);
	}

	@Override
	@Transactional(readOnly = true)
	public Tripulacion findByid(long id) {
		return tripulacionDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delet(long id) {
		tripulacionDao.deleteById(id);
		
	}

}
