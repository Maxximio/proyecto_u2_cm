package com.example.demo.service;

import com.example.demo.model.Persona;

public interface IPersonaJdbcService {

	public void insertarService(Persona persona);
	
	public Persona buscarPersonaIdService(int id);
	
	public void actualizarService(Persona persona);
	
	public void eliminarService(int id);
	
}
