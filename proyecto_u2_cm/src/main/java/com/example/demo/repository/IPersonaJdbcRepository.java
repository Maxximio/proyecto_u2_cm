package com.example.demo.repository;

import java.util.List;

import com.example.demo.To.PersonaTo;

public interface IPersonaJdbcRepository {

	public void insertar(PersonaTo persona);
	
	public PersonaTo buscarPersonaId(Integer id);
	
	public void actualizar(PersonaTo persona);
	
	public void eliminar(Integer id);
	
	public List<PersonaTo> buscarTodos();
	
}
