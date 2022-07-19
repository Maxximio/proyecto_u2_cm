package com.example.demo.repository.modelo;

import java.io.Serializable;

public class EstudianteTo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String nombre;
	private String apellido;
	private String carrera;
	
	//constructor
	public EstudianteTo(String nombre, String apellido, String carrera) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.carrera = carrera;
	}
	
	//set y get
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	//to string
	@Override
	public String toString() {
		return "EstudianteTo [nombre=" + nombre + ", apellido=" + apellido + ", carrera=" + carrera + "]";
	}
}
