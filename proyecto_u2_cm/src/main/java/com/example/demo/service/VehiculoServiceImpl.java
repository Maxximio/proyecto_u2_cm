package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IVehiculoRepository;
import com.example.demo.repository.modelo.Vehiculo;

@Service
public class VehiculoServiceImpl implements IVehiculoService{

	@Autowired
	private IVehiculoRepository estuRepo;

	@Override
	public void insertarService(Vehiculo vehiculo) {
		this.estuRepo.insertar(vehiculo);
	}

	@Override
	public Vehiculo buscarService(String placa) {
		return this.estuRepo.buscar(placa);
	}

	@Override
	public void actualizarService(Vehiculo vehiculo) {
		this.estuRepo.actualizar(vehiculo);
	}

	@Override
	public void eliminarService(String placa) {
		this.estuRepo.eliminar(placa);
	}
	
	

}
