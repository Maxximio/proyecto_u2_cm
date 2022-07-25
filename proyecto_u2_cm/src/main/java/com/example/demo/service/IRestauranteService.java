package com.example.demo.service;

import com.example.demo.repository.modelo.oneToMany.Restaurante;

public interface IRestauranteService {

	public void insertar(Restaurante restaurante);
	
	public Restaurante buscar(int id);
	
	public void actualizar(Restaurante restaurante);
	
	public void eliminar(int id);
	
}
