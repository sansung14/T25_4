package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Salas;

public interface ISalaService {

	//Metodos del CRUD
		public List<Salas> listarSalas(); //Listar All 
		
		public Salas guardarSala(Salas sala);	//Guarda un sala CREATE
		
		public Salas salaXID(Long id); //Leer datos de un sala READ
		
		public Salas actualizarSala(Salas sala); //Actualiza datos del sala UPDATE
		
		public void eliminarSala(Long id);// Elimina el sala DELETE
}
