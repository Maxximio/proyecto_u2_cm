package com.example.demo.service;

import com.example.demo.repository.modelo.Estudiante;

public interface IEstudianteJpaService {

	public void insertarService(Estudiante estudiante);
	
	public Estudiante buscarEstudianteCedulaService(Integer cedula);
	
	public void actualizarService(Estudiante estudiante);
	
	public void eliminarService(Integer cedula);
	
}
