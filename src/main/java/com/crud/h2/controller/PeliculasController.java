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
import com.crud.h2.dto.Peliculas;
import com.crud.h2.service.PeliculaServiceImpl;

@RestController
@RequestMapping("/api")
public class PeliculasController {
	
	@Autowired
	PeliculaServiceImpl peliculaServideImpl;
	
	@GetMapping("/peliculas")
	public List<Peliculas> listarPeliculas(){
		return peliculaServideImpl.listarPeliculas();
	}
	
	@PostMapping("/peliculas")
	public Peliculas salvarPelicula(@RequestBody Peliculas pelicula) {
		
		return peliculaServideImpl.guardarPelicula(pelicula);
	}
	
	@GetMapping("/peliculas/{id}")
	public Peliculas peliculaXID(@PathVariable(name="id") Long id) {
		
		Peliculas pelicula_xid= new Peliculas();
		
		pelicula_xid=peliculaServideImpl.peliculaXID(id);
		
		//System.out.println("Pelicula XID: "+pelicula_xid);
		
		return pelicula_xid;
	}
	
	@PutMapping("/peliculas/{id}")
	public Peliculas actualizarPelicula(@PathVariable(name="id")Long id,@RequestBody Peliculas pelicula) {
		
		Peliculas pelicula_seleccionado= new Peliculas();
		Peliculas pelicula_actualizado= new Peliculas();
		
		pelicula_seleccionado= peliculaServideImpl.peliculaXID(id);
		
		pelicula_seleccionado.setNombre(pelicula.getNombre());
		pelicula_seleccionado.setCalificacionedad(pelicula.getCalificacionedad());

		pelicula_actualizado = peliculaServideImpl.actualizarPelicula(pelicula_seleccionado);
		
		//System.out.println("El pelicula actualizado es: "+ pelicula_actualizado);
		
		return pelicula_actualizado;
	}
	
	@DeleteMapping("/peliculas/{id}")
	public void eleiminarPelicula(@PathVariable(name="id")Long id) {
		peliculaServideImpl.eliminarPelicula(id);
	}
	
	
}
