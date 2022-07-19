package com.example.demo.repository.modelo;

import java.io.Serializable;

public class EstudianteContadorCarrera implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String carrera;
	
	private Long contador;

	//constructor
	public EstudianteContadorCarrera(String carrera, Long contador) {
		super();
		this.carrera = carrera;
		this.contador = contador;
	}

	//set y get
	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public Long getContador() {
		return contador;
	}

	public void setContador(Long contador) {
		this.contador = contador;
	}

	//to string
	@Override
	public String toString() {
		return "EstudianteContadorCarrera [carrera=" + carrera + ", contador=" + contador + "]";
	}
}
