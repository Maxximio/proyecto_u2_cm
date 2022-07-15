package com.example.demo.repository.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="estudiante")
@NamedQueries({
	@NamedQuery(name = "Estudiente.buscarPorNombreApellidoSemestre",query=
	"select e from Estudiante e where e.nombre =:datoNombre and e.apellido =:datoApellido and e.semestre =:datoSemestre")
	,@NamedQuery(name = "Estudiente.buscarNombreCarrera",query=
	"select e from Estudiante e where e.nombre =:datoNombre and e.carrera =:datoCarrera")
	,@NamedQuery(name = "Estudiente.buscarApellidoCarrera",query=
	"select e from Estudiante e where e.apellido =:datoApellido and e.carrera =:datoCarrera")
	,@NamedQuery(name = "Estudiente.buscarCarreraSemestre",query=
	"select e from Estudiante e where e.carrera =:datoCarrera and e.semestre =:datoSemestre")
	})
@NamedNativeQuery(name="Estudiente.buscarNombreApellido",query="select * from estudiante where nombre =:datoNombre and apellido=:datoApellido",resultClass = Estudiante.class)
@NamedNativeQuery(name="Estudiente.buscarApellidoCarreraNative",query="select * from estudiante where apellido =:datoApellido and carrera=:datoCarrera",resultClass = Estudiante.class)
public class Estudiante {

	@Id
	@Column(name="cedula")
	private Integer cedula;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="carrera")
	private String carrera;
	
	@Column(name="semestre")
	private Integer semestre;

	//set y get
	public Integer getCedula() {
		return cedula;
	}

	public void setCedula(Integer cedula) {
		this.cedula = cedula;
	}

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

	public Integer getSemestre() {
		return semestre;
	}

	public void setSemestre(Integer semestre) {
		this.semestre = semestre;
	}

	//to string
	@Override
	public String toString() {
		return "Estudiante [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", carrera=" + carrera
				+ ", semestre=" + semestre + "]";
	}
	
	
	
}
