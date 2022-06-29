package com.example.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Persona;

@Repository
@Transactional
public class PersonaJpaRepositoryImpl implements IPersonaJpaRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Persona persona) {		
		this.entityManager.persist(persona);	
	}

	@Override
	public Persona buscarPersonaId(Integer id) {
		
		return this.entityManager.find(Persona.class, id);
	}

	@Override
	public void actualizar(Persona persona) {
		this.entityManager.merge(persona);
	}

	@Override
	public void eliminar(Integer id) {
		Persona p=this.buscarPersonaId(id);
		this.entityManager.remove(p);
	}

}
