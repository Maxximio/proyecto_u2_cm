package com.example.demo.repository.modelo.oneToMany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "mesero")
public class Mesero {

	@Id
	@Column(name = "mese_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "mese_id_seq")
	@SequenceGenerator(name = "mese_id_seq",sequenceName = "mese_id_seq",allocationSize = 1)
	private Integer id;
	
	@Column(name = "mese_nombre")
	private String nombre;
	
	@Column(name = "mese_apellido")
	private String apellido;
	
	@Column(name = "mese_cedula")
	private String cedula;
	
	@ManyToOne
	@JoinColumn(name = "mese_id_restaurante")
	private Restaurante restaurante;

	//set y get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public Restaurante getRestaurante() {
		return restaurante;
	}

	public void setRestaurante(Restaurante restaurante) {
		this.restaurante = restaurante;
	}

	//to string
	@Override
	public String toString() {
		return "Mesero [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula
				+ ", restaurante=" + restaurante + "]";
	}
}
