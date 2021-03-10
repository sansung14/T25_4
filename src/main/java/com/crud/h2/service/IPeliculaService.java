package com.crud.h2.service;

import java.util.List;

/**
 * @author Jose
 *
 */
import com.crud.h2.dto.Peliculas;

public interface IPeliculaService {

	//Metodos del CRUD
	public List<Peliculas> listarPeliculas(); //Listar All 
	
	public Peliculas guardarPelicula(Peliculas pelicula);	//Guarda un pelicula CREATE
	
	public Peliculas peliculaXID(Long id); //Leer datos de un pelicula READ
	
	public Peliculas actualizarPelicula(Peliculas pelicula); //Actualiza datos del pelicula UPDATE
	
	public void eliminarPelicula(Long id);// Elimina el pelicula DELETE
	
	
}
