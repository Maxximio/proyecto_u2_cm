package com.example.demo.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.oneToMany.Hotel;

@Transactional
@Repository
public class HotelRepositoryImpl implements IHotelRepository{

	@Autowired
	private EntityManager entityManager; 
	
	@Override
	public void insertar(Hotel hotel) {
		this.entityManager.persist(hotel);
	}

}
