package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.To.PersonaTo;
import com.example.demo.repository.IPersonaJdbcRepository;

@Service
public class PersonaJdbcServiceImpl implements IPersonaJdbcService{

	@Autowired
	private IPersonaJdbcRepository iPersonaJdbcRepository;
	
	@Override
	public void insertarService(PersonaTo persona) {
		this.iPersonaJdbcRepository.insertar(persona);
	}

	@Override
	public PersonaTo buscarPersonaIdService(int id) {
		// TODO Auto-generated method stub
		return this.iPersonaJdbcRepository.buscarPersonaId(id);
	}

	@Override
	public void actualizarService(PersonaTo persona) {
		this.iPersonaJdbcRepository.actualizar(persona);
	}

	@Override
	public void eliminarService(int id) {
	this.iPersonaJdbcRepository.eliminar(id);
	}

	@Override
	public List<PersonaTo> buscarTodosService() {
		// TODO Auto-generated method stub
		return this.iPersonaJdbcRepository.buscarTodos();
	}

}
