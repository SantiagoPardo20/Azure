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

import com.example.tarea.modelo.entity.Vuelos;
import com.example.tarea.modelo.services.IVuelosService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class VuelosRestController {
	@Autowired
	private IVuelosService vuelosService;
	
	@GetMapping("/vuelos")
	public List<Vuelos> indext(){
		return vuelosService.FindAll();
	}
	//buscar por id
	@GetMapping("/vuelos/{id}")
	public Vuelos show(@PathVariable long id){
		return vuelosService.findByid(id);
	}
	
	//guardar 
	@PostMapping("/vuelos")
	@ResponseStatus(HttpStatus.CREATED)
	public Vuelos create(@RequestBody Vuelos vuelos){
		return vuelosService.save(vuelos);
	}
	
	//editar 
	@PutMapping("/vuelos/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Vuelos update(@RequestBody Vuelos vuelos,@PathVariable long id){
		Vuelos vuelosactual=vuelosService.findByid(id);
		vuelosactual.setOrigen(vuelos.getOrigen());
		vuelosactual.setDestino(vuelos.getDestino());
		vuelosactual.setFecha(vuelos.getFecha());
		vuelosactual.setHora(vuelos.getHora());
		return vuelosService.save(vuelosactual);
	}
	
	//eliminar 
	
	@DeleteMapping("/vuelos/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable long id){
		vuelosService.delet(id);
	}
}
