package com.example.demo.repository;

import com.example.demo.repository.modelo.Estudiante;


public interface IEstudianteJpaRepository {

	public void insertar(Estudiante estudiante);
	
	public Estudiante buscarEstudianteCedula(Integer cedula);
	
	public void actualizar(Estudiante estudiante);
	
	public void eliminar(Integer cedula);

	
	
}
