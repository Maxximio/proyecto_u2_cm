package com.example.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Propietario;

@Repository
@Transactional
public class PropietarioRepositoryImpl implements IPropietarioRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Propietario propietario) {
		this.entityManager.persist(propietario);
	}

	@Override
	public Propietario buscar(String cedula) {
		return this.entityManager.find(Propietario.class, cedula);
	}

	@Override
	public void actualizar(Propietario propietario) {
		this.entityManager.merge(propietario);
	}
	

	@Override
	public void eliminar(String cedula) {
		Propietario pro=this.buscar(cedula);
		this.entityManager.remove(pro);
	}
}
