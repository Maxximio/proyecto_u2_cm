package com.example.demo.cajero.repository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.cajero.repository.modelo.Factura;

@Transactional
@Repository
public class FacturaRepoImpl implements IFacturaRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Factura buscar(int id) {
		return this.entityManager.find(Factura.class, id);
	}
	
	

}
