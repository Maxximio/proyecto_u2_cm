package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IPropietarioRepository;
import com.example.demo.repository.modelo.Propietario;

@Service
public class PropietarioServiceImpl implements IPropietarioService{

	@Autowired
	private IPropietarioRepository materiaRepo;

	@Override
	public void insertarService(Propietario e) {
		this.materiaRepo.insertar(e);
	}

	@Override
	public Propietario buscarService(String cedula) {
		return this.materiaRepo.buscar(cedula);
	}

	@Override
	public void actualizarService(Propietario e) {
		this.materiaRepo.actualizar(e);
	}

	@Override
	public void eliminarService(String cedula) {
		this.materiaRepo.eliminar(cedula);
	}
	
	

}
