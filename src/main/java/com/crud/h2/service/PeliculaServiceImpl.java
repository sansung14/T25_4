package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IPeliculasDAO;
import com.crud.h2.dto.Peliculas;

@Service
public class PeliculaServiceImpl implements IPeliculaService{
	
	//Utilizamos los metodos de la interface IPeliculaDAO, es como si instaciaramos.
	@Autowired
	IPeliculasDAO iPeliculaDAO;
	
	@Override
	public List<Peliculas> listarPeliculas() {
		
		return iPeliculaDAO.findAll();
	}

	@Override
	public Peliculas guardarPelicula(Peliculas pelicula) {
		
		return iPeliculaDAO.save(pelicula);
	}

	@Override
	public Peliculas peliculaXID(Long id) {
		
		return iPeliculaDAO.findById(id).get();
	}

	@Override
	public Peliculas actualizarPelicula(Peliculas pelicula) {
		
		return iPeliculaDAO.save(pelicula);
	}

	@Override
	public void eliminarPelicula(Long id) {
		
		iPeliculaDAO.deleteById(id);
		
	}



}
