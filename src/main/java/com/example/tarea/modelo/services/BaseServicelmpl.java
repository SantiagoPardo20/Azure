package com.example.tarea.modelo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.tarea.modelo.dao.IBaseDao;
import com.example.tarea.modelo.entity.Base;

@Service
public class BaseServicelmpl implements IBaseService{
	
	@Autowired
	private IBaseDao baseDao;

	@Override
	@Transactional(readOnly = true)
	public List<Base> FindAll() {
		return (List<Base>)baseDao.findAll();
	}

	@Override
	@Transactional
	public Base save(Base base) {
		return baseDao.save(base);
	}

	@Override
	@Transactional(readOnly = true)
	public Base findByid(long id) {
		return baseDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delet(long id) {
		baseDao.deleteById(id);
		
	}

}
