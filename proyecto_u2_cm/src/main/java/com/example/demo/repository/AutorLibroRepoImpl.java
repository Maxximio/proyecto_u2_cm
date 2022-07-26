package com.example.demo.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.oneToMany.Autor2libro2;

@Transactional
@Repository
public class AutorLibroRepoImpl implements IAutorLibroRepo{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public void insertar(Autor2libro2 autor2libro2) {
		this.entityManager.persist(autor2libro2);
	}

}
