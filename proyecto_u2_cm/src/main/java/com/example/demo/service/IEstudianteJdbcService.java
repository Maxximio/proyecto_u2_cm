package com.example.demo.service;

import com.example.demo.model.Estudiante;

public interface IEstudianteJdbcService {

	public void insertarService(Estudiante estu);
	
	public Estudiante buscarService(int cedula);
	
	public void actualizarService(Estudiante estu);
	
	public void eliminarService(int cedula);
	
}
