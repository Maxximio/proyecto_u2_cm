package com.example.demo.service;

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
	
	

}
