package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IAutorLibroRepo;
import com.example.demo.repository.modelo.oneToMany.Autor2libro2;

@Service
public class AutorLibroServiceImpl implements IAutorLibroService{

	@Autowired
	private IAutorLibroRepo autorLibroRepo;
	
	@Override
	public void insertarService(Autor2libro2 autor2libro2) {
		this.autorLibroRepo.insertar(autor2libro2);
	}

}
