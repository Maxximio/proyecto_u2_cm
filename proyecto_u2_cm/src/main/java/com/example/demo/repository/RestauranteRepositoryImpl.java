package com.example.demo.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.oneToMany.Hotel;
import com.example.demo.repository.modelo.oneToMany.Restaurante;

@Transactional
@Repository
public class RestauranteRepositoryImpl implements IRestauranteRepository{

	@Autowired
	private EntityManager entityManager; 
	
	@Override
	public void insertar(Restaurante restaurante) {
		this.entityManager.persist(restaurante);
	}

	@Override
	public Restaurante buscar(int id) {
		return this.entityManager.find(Restaurante.class, id);
	}

	@Override
	public void actualizar(Restaurante restaurante) {
		this.entityManager.merge(restaurante);
	}

	@Override
	public void eliminar(int id) {
		Restaurante restaurante=this.buscar(id);
		this.entityManager.remove(restaurante);
	}

}
