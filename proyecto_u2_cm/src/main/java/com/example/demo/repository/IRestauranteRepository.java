package com.example.demo.repository;

import com.example.demo.repository.modelo.oneToMany.Restaurante;

public interface IRestauranteRepository {

	public void insertar(Restaurante restaurante);
	
	public Restaurante buscar(int id);
	
	public void actualizar(Restaurante restaurante);
	
	public void eliminar(int id);
	
}
