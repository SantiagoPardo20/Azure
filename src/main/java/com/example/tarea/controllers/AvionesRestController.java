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
import com.example.tarea.modelo.entity.Aviones;
import com.example.tarea.modelo.services.IAvionesService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class AvionesRestController {
	@Autowired
	private IAvionesService avionesService;
	
	@GetMapping("/aviones")
	public List<Aviones> indext(){
		return avionesService.FindAll();
	}
	//buscar por id
	@GetMapping("/aviones/{id}")
	public Aviones show(@PathVariable long id){
		return avionesService.findByid(id);
	}
	
	//guardar un cliente
	@PostMapping("/aviones")
	@ResponseStatus(HttpStatus.CREATED)
	public Aviones create(@RequestBody Aviones aviones){
		return avionesService.save(aviones);
	}
	
	//editar cliente
	@PutMapping("/aviones/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Aviones update(@RequestBody Aviones aviones,@PathVariable long id){
		Aviones avionactual=avionesService.findByid(id);
		avionactual.setCodigo(aviones.getCodigo());
		avionactual.setTipo(aviones.getTipo());
		return avionesService.save(avionactual);
	}
	
	//eliminar 
	
	@DeleteMapping("/aviones/{id_avion}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable long id){
		avionesService.delet(id);
	}
	
}
