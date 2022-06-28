package com.example.demo.repository;

import com.example.demo.model.Estudiante;

public interface IEstudianteJdbcRepository {

	public void insertar(Estudiante estu);
	
	public Estudiante buscar(int cedula);
	
	public void actualizar(Estudiante estu);
	
	public void eliminar(int cedula);
	
}
