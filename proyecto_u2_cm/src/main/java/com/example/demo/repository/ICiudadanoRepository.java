package com.example.demo.repository;

import com.example.demo.repository.modelo.Ciudadano;

public interface ICiudadanoRepository {

	public void insertar(Ciudadano ciudadano);
	
	public Ciudadano buscarEstudianteCedula(Integer id);
	
	public void actualizar(Ciudadano ciudadano);
	
	public void eliminar(Integer id);
	
}
