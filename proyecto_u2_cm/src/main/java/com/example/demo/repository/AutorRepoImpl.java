package com.example.demo.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.oneToMany.Autor2;

@Transactional
@Repository
public class AutorRepoImpl implements IAutor2Repo{

	@Autowired
	private EntityManager entityManager;

	@Override
	public void insertar(Autor2 autor2) {
		this.entityManager.persist(autor2);
	}
	
}
