package com.example.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.To.PersonaTo;
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
	
	@Override
	public Persona buscarPersonaCedula(String cedula) {
		Query jpqlQuery=this.entityManager
				.createQuery("select p from Persona p Where p.cedula = :datoCedula");
		jpqlQuery.setParameter("datoCedula", cedula);
		
		return (Persona) jpqlQuery.getSingleResult();
	}

	@Override
	public List<Persona> buscarPersonaApellido(String apellido) {
		Query jpqlQuery=this.entityManager
				.createQuery("select p from Persona p Where p.apellido = :datoApellido");
		jpqlQuery.setParameter("datoApellido", apellido);
		
		return jpqlQuery.getResultList();
	}

	@Override
	public List<Persona> buscarPersonaNombre(String nombre) {
		Query jpqlQuery=this.entityManager
				.createQuery("select p from Persona p Where p.nombre = :datoNombre");
		jpqlQuery.setParameter("datoNombre", nombre);
		
		return jpqlQuery.getResultList();
	}

	@Override
	public List<Persona> buscarPersonaGenero(String genero) {
		Query jpqlQuery=this.entityManager
				.createQuery("select p from Persona p Where p.genero = :datoGenero");
		jpqlQuery.setParameter("datoGenero", genero);
		
		return jpqlQuery.getResultList();
	}

}
