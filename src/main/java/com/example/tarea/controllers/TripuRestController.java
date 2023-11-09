package com.example.tarea.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tarea.modelo.entity.Tripu_Vuelo;
import com.example.tarea.modelo.services.ITripuService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class TripuRestController {
	@Autowired
	private ITripuService tripuService;
	
	@GetMapping("/tripu")
	public List<Tripu_Vuelo> indext(){
		return tripuService.FindAll();
	}
	//buscar por id
	@GetMapping("/tripu/{id}")
	public Tripu_Vuelo show(@PathVariable long id){
		return tripuService.findByid(id);
	}

}
