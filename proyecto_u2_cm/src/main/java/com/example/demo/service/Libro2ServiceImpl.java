package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ILibro2Repo;
import com.example.demo.repository.modelo.oneToMany.Libro2;

@Service
public class Libro2ServiceImpl implements ILibro2Service{

	@Autowired
	private ILibro2Repo libro2Repo;

	@Override
	public void insertarService(Libro2 libro2) {
		this.libro2Repo.insertar(libro2);
	}
	
	
}
