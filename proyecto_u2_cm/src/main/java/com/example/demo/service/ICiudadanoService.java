package com.example.demo.service;

import com.example.demo.repository.modelo.Ciudadano;

public interface ICiudadanoService {

	public void insertarService(Ciudadano ciudadano);
	
	public Ciudadano buscarEstudianteCedulaService(Integer id);
	
	public void actualizarService(Ciudadano ciudadano);
	
	public void eliminarService(Integer id);
	
}
