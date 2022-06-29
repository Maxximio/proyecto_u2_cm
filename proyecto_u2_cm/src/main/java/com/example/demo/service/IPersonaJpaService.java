package com.example.demo.service;

import com.example.demo.repository.modelo.Persona;

public interface IPersonaJpaService {

	public void insertarService(Persona persona);
	
	public Persona buscarPersonaIdService(Integer id);
	
	public void actualizarService(Persona persona);
	
	public void eliminarService(Integer id);
	
}
