package com.example.tarea.modelo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.tarea.modelo.dao.ITripuDao;
import com.example.tarea.modelo.entity.Tripu_Vuelo;

@Service
public class TripuServicelmpl implements ITripuService{
	
	@Autowired
	private ITripuDao tripuDao;

	@Override
	@Transactional(readOnly = true)
	public List<Tripu_Vuelo> FindAll() {
		return (List<Tripu_Vuelo>)tripuDao.findAll();
	}

	@Override
	@Transactional
	public Tripu_Vuelo save(Tripu_Vuelo tripu_Vuelo) {
		return tripuDao.save(tripu_Vuelo);
	}

	@Override
	@Transactional(readOnly = true)
	public Tripu_Vuelo findByid(long id) {
		return tripuDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delet(long id) {
		tripuDao.deleteById(id);
		
	}

}
