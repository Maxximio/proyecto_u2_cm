package com.example.demo.cajero.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.cajero.repository.IFacturaRepo;
import com.example.demo.cajero.repository.modelo.Factura;

@Service
public class FacturaServiceImpl implements IFacturaService{

	@Autowired
	private IFacturaRepo facturaRepo;
	
	@Override
	public Factura buscarService(int id) {
		return this.facturaRepo.buscar(id);
	}

}
