package com.example.demo.service;

import com.example.demo.repository.modelo.oneToMany.Mesero;

public interface IMeseroService {

	public void insertarService(Mesero mesero);
	
	public Mesero buscarService(int id);
	
	public void actualizarService(Mesero mesero);
	
	public void eliminarService(int id);
	
}
