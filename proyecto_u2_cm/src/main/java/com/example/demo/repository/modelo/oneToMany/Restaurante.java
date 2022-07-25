package com.example.demo.repository.modelo.oneToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "restaurante")
public class Restaurante {

	@Id
	@Column(name = "resta_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "resta_id_seq")
	@SequenceGenerator(name = "resta_id_seq",sequenceName = "resta_id_seq",allocationSize = 1)
	private Integer id;
	
	@Column(name = "resta_nombre")
	private String nombre;
	
	@Column(name = "resta_direccion")
	private String direccion;
	
	@OneToMany(mappedBy = "restaurante",cascade = CascadeType.ALL)
	private List<Mesero> mesero;
	
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public List<Mesero> getMesero() {
		return mesero;
	}
	public void setMesero(List<Mesero> mesero) {
		this.mesero = mesero;
	}
	//to string
	@Override
	public String toString() {
		return "Hotel [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", meseros=" + mesero
				+ "]";
	}
	
}
