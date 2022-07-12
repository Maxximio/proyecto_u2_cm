package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IEstudianteJpaRepository;
import com.example.demo.repository.modelo.Estudiante;

@Service
public class EstudianteJpaServiceImpl implements IEstudianteJpaService{

	@Autowired
	private IEstudianteJpaRepository estudianteJpaRepository;

	@Override
	public void insertarService(Estudiante estudiante) {
		this.estudianteJpaRepository.insertar(estudiante);
	}

	@Override
	public Estudiante buscarEstudianteCedulaService(Integer cedula) {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepository.buscarEstudianteCedula(cedula);
	}

	@Override
	public void actualizarService(Estudiante estudiante) {
		this.estudianteJpaRepository.actualizar(estudiante);
	}

	@Override
	public void eliminarService(Integer cedula) {
		this.estudianteJpaRepository.eliminar(cedula);
	}

	@Override
	public List<Estudiante> buscarSemestreTypedService(int semestre) {
		return this.estudianteJpaRepository.buscarSemestreTyped(semestre);
	}

	@Override
	public List<Estudiante> buscarCarreraTypedService(String carrera) {
		return this.estudianteJpaRepository.buscarCarreraTyped(carrera);
	}

	@Override
	public Estudiante buscarNombreApellidoSemestreNamedService(String nombre, String apellido, int semestre) {
		return this.estudianteJpaRepository.buscarNombreApellidoSemestreNamed(nombre, apellido, semestre);
	}

	@Override
	public List<Estudiante> buscarNombreCarreraNamedService(String nombre, String carrera) {
		return this.estudianteJpaRepository.buscarNombreCarreraNamed(nombre, carrera);
	}

	@Override
	public List<Estudiante> buscarApellidoCarreraNamedTypedService(String apellido, String carrera) {
		return this.estudianteJpaRepository.buscarApellidoCarreraNamedTyped(apellido, carrera);
	}

	@Override
	public List<Estudiante> buscarCarreraSemestreNamedTypedService(String carrera, int semestre) {
		return this.estudianteJpaRepository.buscarCarreraSemestreNamedTyped(carrera, semestre);
	}
	
	

}