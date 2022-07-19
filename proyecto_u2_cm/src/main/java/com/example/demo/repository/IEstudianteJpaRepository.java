package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository.modelo.EstudianteContadorCarrera;
import com.example.demo.repository.modelo.EstudianteTo;


public interface IEstudianteJpaRepository {

	public void insertar(Estudiante estudiante);
	
	public Estudiante buscarEstudianteCedula(Integer cedula);
	
	public void actualizar(Estudiante estudiante);
	
	public void eliminar(Integer cedula);

	//tarea 17
	
	public List<Estudiante> buscarSemestreTyped(int semestre);
	
	public List<Estudiante> buscarCarreraTyped(String carrera);
	
	public Estudiante buscarNombreApellidoSemestreNamed(String nombre,String apellido,int semestre);
	
	public List<Estudiante> buscarNombreCarreraNamed(String nombre,String carrera);
	
	public List<Estudiante> buscarApellidoCarreraNamedTyped(String apellido,String carrera);
	
	public List<Estudiante> buscarCarreraSemestreNamedTyped(String carrera,int semestre);
	
	//tarea 18
	
	public Estudiante buscarCedulaNative(int cedula);
	
	public List<Estudiante> buscarCarreraSemestreNative(String carrera,int semestre);
	
	public Estudiante buscarNombreApellidoNamedNative(String nombre,String apellido);
	
	public List<Estudiante> buscarApellidoCarreraNative(String carrera,String apellido);
	
	//tarea 19
	
	public List<Estudiante> buscarNombreApellidoCriteria(String nombre,String apellido);
	
	public List<Estudiante> busquedaDinamicaCarreraNombreConSemestre(String carrera,String nombre,int semestre);
	
	//tarea 20
	public List<EstudianteTo> busquedaEstudianteTOApellido(String apellido);
	
	public List<EstudianteContadorCarrera> cantidadPorCarrera();
	
}
