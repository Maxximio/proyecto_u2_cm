package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IMeseroRepository;
import com.example.demo.repository.modelo.oneToMany.Mesero;

@Service
public class MeseroServiceImpl implements IMeseroService{

	@Autowired
	private IMeseroRepository meseroRepository;
	
	@Override
	public void insertarService(Mesero mesero) {
		this.meseroRepository.insertar(mesero);
	}

	@Override
	public Mesero buscarService(int id) {
		return this.meseroRepository.buscar(id);
	}

	@Override
	public void actualizarService(Mesero mesero) {
		this.meseroRepository.actualizar(mesero);
	}

	@Override
	public void eliminarService(int id) {
		this.meseroRepository.eliminar(id);
	}

}
