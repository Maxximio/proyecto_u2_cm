package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ICiudadanoRepository;
import com.example.demo.repository.modelo.Ciudadano;

@Service
public class CiudadanoServiceImpl implements ICiudadanoService{

	@Autowired
	private ICiudadanoRepository ciudadanoRepository;
	
	@Override
	public void insertarService(Ciudadano ciudadano) {
		this.ciudadanoRepository.insertar(ciudadano);
	}

	@Override
	public Ciudadano buscarEstudianteCedulaService(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizarService(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarService(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
