package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Persona;
import com.example.demo.repository.IPersonaJdbcRepository;

@Service
public class PersonaJdbcServiceImpl implements IPersonaJdbcService{

	@Autowired
	private IPersonaJdbcRepository iPersonaJdbcRepository;
	
	@Override
	public void insertarService(Persona persona) {
		this.iPersonaJdbcRepository.insertar(persona);
	}

	@Override
	public Persona buscarPersonaIdService(int id) {
		// TODO Auto-generated method stub
		return this.iPersonaJdbcRepository.buscarPersonaId(id);
	}

	@Override
	public void actualizarService(Persona persona) {
		this.iPersonaJdbcRepository.actualizar(persona);
	}

	@Override
	public void eliminarService(int id) {
	this.iPersonaJdbcRepository.eliminar(id);
	}

}
