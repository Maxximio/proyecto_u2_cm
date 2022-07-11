package com.example.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Vehiculo;

@Repository
@Transactional
public class VehiculoRepositoryImpl implements IVehiculoRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Vehiculo vehi) {
		this.entityManager.persist(vehi);
	}

	@Override
	public Vehiculo buscar(String placa) {
		return this.entityManager.find(Vehiculo.class, placa);
	}

	@Override
	public void actualizar(Vehiculo vehi) {
		this.entityManager.merge(vehi);
	}

	@Override
	public void eliminar(String placa) {
		Vehiculo vehi=this.buscar(placa);
		this.entityManager.remove(vehi);
	}

	
}
