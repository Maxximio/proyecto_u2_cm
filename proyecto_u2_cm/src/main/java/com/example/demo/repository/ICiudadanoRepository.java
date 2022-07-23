package com.example.demo.repository;

import com.example.demo.repository.modelo.oneToOne.Ciudadano;

public interface ICiudadanoRepository {

	public void insertar(Ciudadano ciudadano);
	
	public Ciudadano buscar(Integer id);
	
	public void actualizar(Ciudadano ciudadano);
	
	public void eliminar(Integer id);
	
}
