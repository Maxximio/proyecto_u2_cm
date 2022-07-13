package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Persona;

public interface IPersonaJpaService {

	public void insertarService(Persona persona);
	
	public Persona buscarPersonaIdService(Integer id);
	
	public void actualizarService(Persona persona);
	
	public void eliminarService(Integer id);
	
	public Persona buscarPersonaCedulaService(String cedula);
	
	public List<Persona> buscarPersonaApellido(String apellido);
	
	public List<Persona> buscarPersonaNombreService(String nombre);
	
	public List<Persona> buscarPersonaGeneroService(String genero);
	
	
	public int eliminarPorGeneroService(String genero);

	public int actualizarPorApellidoService(String apellido, String genero);
	
	
	public Persona buscarPersonaCedulaTypedService(String cedula);
	
	public Persona buscarPersonaCedulaNamedService(String cedula);
	
	public Persona buscarPersonaCedulaNamedTypedService(String cedula);
	
	public List<Persona> buscarPersonaNombreApellidoService(String nombre,String apellido);
	
	public Persona buscarPersonaCedulaNativeService(String cedula);
	
	public Persona buscarPersonaCedulaNamedNativeService(String cedula);
}
