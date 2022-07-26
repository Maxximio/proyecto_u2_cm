package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ILibroRepository;
import com.example.demo.repository.modelo.ManyToMany.Libro;

@Service
public class LibroServiceImpl implements ILibroService{

	@Autowired
	private ILibroRepository libroRepository;
	
	@Override
	public void insertarService(Libro libro) {
		this.libroRepository.insertar(libro);
	}

	@Override
	public Libro buscarService(int id) {
		return this.libroRepository.buscar(id);
	}

}
