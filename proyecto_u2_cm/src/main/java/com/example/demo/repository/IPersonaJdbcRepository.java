package com.example.demo.repository;

import com.example.demo.model.Persona;

public interface IPersonaJdbcRepository {

	public void insertar(Persona persona);
	
	public Persona buscarPersonaId(int id);
	
	public void actualizar(Persona persona);
	
	public void eliminar(int id);
	
}
