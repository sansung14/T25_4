package com.crud.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.h2.dto.Salas;
import com.crud.h2.service.SalaServiceImpl;

@RestController
@RequestMapping("/api")
public class SalasController {

	@Autowired
	SalaServiceImpl salaServideImpl;
	
	@GetMapping("/salas")
	public List<Salas> listarSalas(){
		return salaServideImpl.listarSalas();
	}
	
	@PostMapping("/salas")
	public Salas salvarSala(@RequestBody Salas sala) {
		
		return salaServideImpl.guardarSala(sala);
	}
	
	@GetMapping("/salas/{id}")
	public Salas salaXID(@PathVariable(name="id") Long id) {
		
		Salas sala_xid= new Salas();
		
		sala_xid=salaServideImpl.salaXID(id);
		
		//System.out.println("Sala XID: "+sala_xid);
		
		return sala_xid;
	}
	
	@PutMapping("/salas/{id}")
	public Salas actualizarSala(@PathVariable(name="id")Long id,@RequestBody Salas sala) {
		
		Salas sala_seleccionado= new Salas();
		Salas sala_actualizado= new Salas();
		
		sala_seleccionado= salaServideImpl.salaXID(id);
		
		sala_seleccionado.setNombre(sala.getNombre());
		sala_seleccionado.setPelicula(sala.getPelicula());
		
		sala_actualizado = salaServideImpl.actualizarSala(sala_seleccionado);
		
		//System.out.println("El sala actualizado es: "+ sala_actualizado);
		
		return sala_actualizado;
	}
	
	@DeleteMapping("/salas/{id}")
	public void eliminarSala(@PathVariable(name="id")Long id) {
		salaServideImpl.eliminarSala(id);
	}
	
}
