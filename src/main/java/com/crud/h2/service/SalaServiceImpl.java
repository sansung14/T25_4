package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.ISalasDAO;
import com.crud.h2.dto.Salas;

@Service
public class SalaServiceImpl implements ISalaService{

	@Autowired
	ISalasDAO iSalaDAO;
	
	@Override
	public List<Salas> listarSalas() {
		
		return iSalaDAO.findAll();
	}
	
	@Override
	public Salas guardarSala(Salas sala) {
		
		return iSalaDAO.save(sala);
	}

	@Override
	public Salas salaXID(Long id) {
		
		return iSalaDAO.findById(id).get();
	}

	@Override
	public Salas actualizarSala(Salas sala) {
		
		return iSalaDAO.save(sala);
	}

	@Override
	public void eliminarSala(Long id) {
		
		iSalaDAO.deleteById(id);
		
	}
}
