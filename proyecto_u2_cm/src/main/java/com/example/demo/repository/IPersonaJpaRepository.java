package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Persona;


public interface IPersonaJpaRepository {

	public void insertar(Persona persona);
	
	public Persona buscarPersonaId(Integer id);
	
	public void actualizar(Persona persona);
	
	public void eliminar(Integer id);
	
	//public List<Persona> buscarTodos();
	
	
	public Persona buscarPersonaCedula(String cedula);//normal
	
	public Persona buscarPersonaCedulaTyped(String cedula);//typed
	
	public Persona buscarPersonaCedulaNamed(String cedula);//named
	
	public Persona buscarPersonaCedulaNamedTyped(String cedula);//named y typed
	
	public Persona buscarPersonaCedulaNative(String cedula);//native 
	
	public Persona buscarPersonaCedulaNamedNative(String cedula);//named native 
	
	//taller 22
	public Persona buscarPersonaCedulaCriteria(String cedula);
	
	public Persona buscarDinamica(String nombre, String apellido,String genero);
	
	
	public List<Persona> buscarPersonaApellido(String apellido);
	
	public List<Persona> buscarPersonaNombreApellido(String nombre,String apellido);
	
	public List<Persona> buscarPersonaNombre(String nombre);
	
	public List<Persona> buscarPersonaGenero(String genero);
	
	
	
	public int eliminarPorGenero(String genero);

	public int actualizarPorApellido(String apellido, String genero);
	
}
