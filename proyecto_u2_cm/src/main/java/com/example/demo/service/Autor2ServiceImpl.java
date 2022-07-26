package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IAutor2Repo;
import com.example.demo.repository.modelo.oneToMany.Autor2;

@Service
public class Autor2ServiceImpl implements IAutor2Service{

	@Autowired
	private IAutor2Repo autor2Repo;

	@Override
	public void insertarService(Autor2 autor2) {
		this.autor2Repo.insertar(autor2);
	}
	
}
