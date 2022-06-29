package com.example.demo.repository;

import com.example.demo.repository.modelo.Persona;


public interface IPersonaJpaRepository {

	public void insertar(Persona persona);
	
	public Persona buscarPersonaId(Integer id);
	
	public void actualizar(Persona persona);
	
	public void eliminar(Integer id);
	
	//public List<Persona> buscarTodos();
	
}
