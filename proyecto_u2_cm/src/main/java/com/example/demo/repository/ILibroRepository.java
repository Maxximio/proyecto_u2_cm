package com.example.demo.repository;

import com.example.demo.repository.modelo.ManyToMany.Libro;

public interface ILibroRepository {

	public void insertar(Libro libro);
	
	public Libro buscar(int id);
}
