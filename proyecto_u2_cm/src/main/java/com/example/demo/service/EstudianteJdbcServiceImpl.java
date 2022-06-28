package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Estudiante;
import com.example.demo.repository.IEstudianteJdbcRepository;

@Service
public class EstudianteJdbcServiceImpl implements IEstudianteJdbcService{

	@Autowired
	private IEstudianteJdbcRepository estudianteJdbcRepository;
	
	@Override
	public void insertarService(Estudiante estu) {
		this.estudianteJdbcRepository.insertar(estu);
	}

	@Override
	public Estudiante buscarService(int cedula) {
		return this.estudianteJdbcRepository.buscar(cedula);
	}

	@Override
	public void actualizarService(Estudiante estu) {
		this.estudianteJdbcRepository.actualizar(estu);
	}

	@Override
	public void eliminarService(int cedula) {
		this.estudianteJdbcRepository.eliminar(cedula);
	}

}
