package com.example.demo.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.ManyToMany.Libro;

@Transactional
@Repository
public class LibroRepoImpl implements ILibroRepository{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public void insertar(Libro libro) {
		this.entityManager.persist(libro);
	}

	@Override
	public Libro buscar(int id) {
		return this.entityManager.find(Libro.class, id);
	}

}
