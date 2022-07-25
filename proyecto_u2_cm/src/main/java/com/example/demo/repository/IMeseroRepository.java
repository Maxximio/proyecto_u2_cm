package com.example.demo.repository;

import com.example.demo.repository.modelo.oneToMany.Mesero;

public interface IMeseroRepository {

	public void insertar(Mesero mesero);
	
	public Mesero buscar(int id);
	
	public void actualizar(Mesero mesero);
	
	public void eliminar(int id);
	
}
