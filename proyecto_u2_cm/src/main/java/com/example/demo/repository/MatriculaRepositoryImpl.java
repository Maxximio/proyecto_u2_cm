package com.example.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Matricula;

@Repository
@Transactional
public class MatriculaRepositoryImpl implements IMatriculaRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Matricula m) {
		this.entityManager.persist(m);
	}
	
	@Override
	public void actualizar(Matricula m) {
		this.entityManager.merge(m);
	}

	@Override
	public Matricula buscar(int id) {
		return this.entityManager.find(Matricula.class, id);
	}

	@Override
	public void eliminar(int id) {
		Matricula m=this.buscar(id);
		this.entityManager.remove(m);
	}


	
	
}
