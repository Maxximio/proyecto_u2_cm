package com.example.demo.service;

import com.example.demo.repository.modelo.ManyToMany.Libro;

public interface ILibroService {

	public void insertarService(Libro libro);
	
	public Libro buscarService(int id);
	
}
