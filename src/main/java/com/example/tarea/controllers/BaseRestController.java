package com.example.tarea.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.tarea.modelo.entity.Base;
import com.example.tarea.modelo.services.IBaseService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class BaseRestController {
	@Autowired
	private IBaseService baseService;
	
	@GetMapping("/base")
	public List<Base> indext(){
		return baseService.FindAll();
	}
	//buscar por id
	@GetMapping("/base/{id}")
	public Base show(@PathVariable long id){
		return baseService.findByid(id);
	}
	
	//guardar 
	@PostMapping("/base")
	@ResponseStatus(HttpStatus.CREATED)
	public Base create(@RequestBody Base base){
		return baseService.save(base);
	}
	
	//editar 
	@PutMapping("/base/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Base update(@RequestBody Base base,@PathVariable long id){
		Base baseactual=baseService.findByid(id);
		baseactual.setNombre_base(base.getNombre_base());
		return baseService.save(baseactual);
	}
	
	//eliminar 
	
	@DeleteMapping("/base/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable long id){
		baseService.delet(id);
	}

}
