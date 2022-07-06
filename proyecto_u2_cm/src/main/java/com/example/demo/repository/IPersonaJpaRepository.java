package com.example.demo.repository;

import java.util.List;

import com.example.demo.To.PersonaTo;
import com.example.demo.repository.modelo.Persona;


public interface IPersonaJpaRepository {

	public void insertar(Persona persona);
	
	public Persona buscarPersonaId(Integer id);
	
	public void actualizar(Persona persona);
	
	public void eliminar(Integer id);
	
	//public List<Persona> buscarTodos();
	
	public Persona buscarPersonaCedula(String cedula);
	
	public List<Persona> buscarPersonaApellido(String apellido);
	
}
