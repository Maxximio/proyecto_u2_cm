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
@Table(name = "libro2")
public class Libro2 {

	@Id
	@Column(name = "lib_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "lib2_id_seq")
	@SequenceGenerator(name = "lib2_id_seq",sequenceName = "lib2_id_seq",allocationSize = 1)
	private Integer id;
	
	@Column(name = "lib_titulo")
	private String titulo;
	
	@Column(name = "lib_paginas")
	private Integer cantidadPaginas;

	@OneToMany(mappedBy = "libro2",cascade = CascadeType.ALL)
	private List<Autor2libro2> autor2libro2;
	
	//set y get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getCantidadPaginas() {
		return cantidadPaginas;
	}

	public void setCantidadPaginas(Integer cantidadPaginas) {
		this.cantidadPaginas = cantidadPaginas;
	}

	public List<Autor2libro2> getAutor2libro2() {
		return autor2libro2;
	}

	public void setAutor2libro2(List<Autor2libro2> autor2libro2) {
		this.autor2libro2 = autor2libro2;
	}
}
