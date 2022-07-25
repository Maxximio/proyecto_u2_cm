package com.example.demo.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.oneToMany.Hotel;
import com.example.demo.repository.modelo.oneToMany.Mesero;
import com.example.demo.repository.modelo.oneToMany.Restaurante;

@Transactional
@Repository
public class MeseroRepositoryImpl implements IMeseroRepository{

	@Autowired
	private EntityManager entityManager; 
	
	@Override
	public void insertar(Mesero mesero) {
		this.entityManager.persist(mesero);
	}

	@Override
	public Mesero buscar(int id) {
		return this.entityManager.find(Mesero.class, id);
	}

	@Override
	public void actualizar(Mesero mesero) {
		this.entityManager.merge(mesero);
	}

	@Override
	public void eliminar(int id) {
		Mesero mesero=this.buscar(id);
		this.entityManager.remove(mesero);
	}

}
