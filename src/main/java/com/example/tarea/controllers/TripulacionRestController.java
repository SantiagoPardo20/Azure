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

import com.example.tarea.modelo.entity.Tripulacion;
import com.example.tarea.modelo.services.ITripulacionService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class TripulacionRestController {
	
	@Autowired
	private ITripulacionService tripulacionService;
	
	@GetMapping("/tripulacion")
	public List<Tripulacion> indext(){
		return tripulacionService.FindAll();
	}
	//buscar por id
	@GetMapping("/tripulacion/{id}")
	public Tripulacion show(@PathVariable long id){
		return tripulacionService.findByid(id);
	}
	
	//guardar 
	@PostMapping("/tripulacion")
	@ResponseStatus(HttpStatus.CREATED)
	public Tripulacion create(@RequestBody Tripulacion tripulacion){
		return tripulacionService.save(tripulacion);
	}
	
	//editar 
	@PutMapping("/tripulacion/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Tripulacion update(@RequestBody Tripulacion tripulacion,@PathVariable long id){
		Tripulacion tripuactual=tripulacionService.findByid(id);
		tripuactual.setCodigo(tripuactual.getCodigo());
		tripuactual.setNombre_piloto(tripuactual.getNombre_piloto());
		tripuactual.setApellido_piloto(tripuactual.getApellido_piloto());
		tripuactual.setHoras(tripuactual.getHoras());
		tripuactual.setPiloto_si_no(tripuactual.getPiloto_si_no());
		return tripulacionService.save(tripuactual);
	}
	
	//eliminar 
	
	@DeleteMapping("/tripulacion/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable long id){
		tripulacionService.delet(id);
	}


}
