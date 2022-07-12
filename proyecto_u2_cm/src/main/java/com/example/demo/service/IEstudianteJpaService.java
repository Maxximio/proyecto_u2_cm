package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;

public interface IEstudianteJpaService {

	public void insertarService(Estudiante estudiante);
	
	public Estudiante buscarEstudianteCedulaService(Integer cedula);
	
	public void actualizarService(Estudiante estudiante);
	
	public void eliminarService(Integer cedula);
	
	
	//////
	public List<Estudiante> buscarSemestreTypedService(int semestre);
	
	public List<Estudiante> buscarCarreraTypedService(String carrera);
	
	public Estudiante buscarNombreApellidoSemestreNamedService(String nombre,String apellido,int semestre);
	
	public List<Estudiante> buscarNombreCarreraNamedService(String nombre,String carrera);
	
	public List<Estudiante> buscarApellidoCarreraNamedTypedService(String apellido,String carrera);
	
	public List<Estudiante> buscarCarreraSemestreNamedTypedService(String carrera,int semestre);
	
}