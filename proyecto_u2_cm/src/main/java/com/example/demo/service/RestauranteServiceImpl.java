package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IRestauranteRepository;
import com.example.demo.repository.modelo.oneToMany.Restaurante;

@Service
public class RestauranteServiceImpl implements IRestauranteService{

	@Autowired
	private IRestauranteRepository restauranteRepository;
	
	@Override
	public void insertar(Restaurante restaurante) {
		this.restauranteRepository.insertar(restaurante);
	}

	@Override
	public Restaurante buscar(int id) {
		return this.restauranteRepository.buscar(id);
	}

	@Override
	public void actualizar(Restaurante restaurante) {
		this.restauranteRepository.actualizar(restaurante);
	}

	@Override
	public void eliminar(int id) {
		this.restauranteRepository.eliminar(id);
	}

}
