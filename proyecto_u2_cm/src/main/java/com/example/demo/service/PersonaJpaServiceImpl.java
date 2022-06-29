package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IPersonaJpaRepository;
import com.example.demo.repository.modelo.Persona;

@Service
public class PersonaJpaServiceImpl implements IPersonaJpaService{

	@Autowired
	private IPersonaJpaRepository personaJpaRepository;
	
	@Override
	public void insertarService(Persona persona) {
		this.personaJpaRepository.insertar(persona);
	}

	@Override
	public Persona buscarPersonaIdService(Integer id) {
		return this.personaJpaRepository.buscarPersonaId(id);
	}

	@Override
	public void actualizarService(Persona persona) {
		this.personaJpaRepository.actualizar(persona);
	}

	@Override
	public void eliminarService(Integer id) {
		this.personaJpaRepository.eliminar(id);
	}

}
