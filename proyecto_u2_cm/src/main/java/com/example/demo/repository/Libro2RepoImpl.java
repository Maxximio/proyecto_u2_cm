package com.example.demo.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.oneToMany.Libro2;

@Transactional
@Repository
public class Libro2RepoImpl implements ILibro2Repo{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public void insertar(Libro2 libro2) {
		this.entityManager.persist(libro2);
	}

}
