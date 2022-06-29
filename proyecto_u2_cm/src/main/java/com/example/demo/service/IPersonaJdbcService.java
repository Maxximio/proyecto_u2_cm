package com.example.demo.service;

import java.util.List;

import com.example.demo.To.PersonaTo;

public interface IPersonaJdbcService {

	public void insertarService(PersonaTo persona);
	
	public PersonaTo buscarPersonaIdService(int id);
	
	public void actualizarService(PersonaTo persona);
	
	public void eliminarService(int id);
	
	public List<PersonaTo> buscarTodosService();
	
}
