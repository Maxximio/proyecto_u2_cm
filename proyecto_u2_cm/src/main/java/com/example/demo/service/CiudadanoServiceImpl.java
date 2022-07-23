package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ICiudadanoRepository;
import com.example.demo.repository.modelo.oneToOne.Ciudadano;

@Service
public class CiudadanoServiceImpl implements ICiudadanoService{

	@Autowired
	private ICiudadanoRepository ciudadanoRepository;
	
	@Override
	public void insertarService(Ciudadano ciudadano) {
		this.ciudadanoRepository.insertar(ciudadano);
	}

	@Override
	public Ciudadano buscarService(Integer id) {
		return this.ciudadanoRepository.buscar(id);
	}

	@Override
	public void actualizarService(Ciudadano ciudadano) {
		this.ciudadanoRepository.actualizar(ciudadano);
	}

	@Override
	public void eliminarService(Integer id) {
		this.ciudadanoRepository.eliminar(id);
	}

}
