package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IPersonaJpaRepository;
import com.example.demo.repository.modelo.Persona;

@Service
public class PersonaJpaServiceImpl implements IPersonaJpaService{

	@Autowired
	private IPersonaJpaRepository personaJpaRepository;
	
	@Override
	public void insertarService(Persona persona) {
		this.personaJpaRepository.insertar(persona);
	}

	@Override
	public Persona buscarPersonaIdService(Integer id) {
		return this.personaJpaRepository.buscarPersonaId(id);
	}

	@Override
	public void actualizarService(Persona persona) {
		this.personaJpaRepository.actualizar(persona);
	}

	@Override
	public void eliminarService(Integer id) {
		this.personaJpaRepository.eliminar(id);
	}

	@Override
	public Persona buscarPersonaCedulaService(String cedula) {
		return this.personaJpaRepository.buscarPersonaCedula(cedula);
	}

	@Override
	public List<Persona> buscarPersonaApellido(String apellido) {
		return this.personaJpaRepository.buscarPersonaApellido(apellido);
	}

	@Override
	public List<Persona> buscarPersonaNombreService(String nombre) {
		return this.personaJpaRepository.buscarPersonaNombre(nombre);
	}

	@Override
	public List<Persona> buscarPersonaGeneroService(String genero) {
		return this.personaJpaRepository.buscarPersonaGenero(genero);
	}

	@Override
	public int eliminarPorGeneroService(String genero) {
		return this.personaJpaRepository.eliminarPorGenero(genero);
	}

	@Override
	public int actualizarPorApellidoService(String apellido, String genero) {
		return this.personaJpaRepository.actualizarPorApellido(apellido, genero);
	}

}
