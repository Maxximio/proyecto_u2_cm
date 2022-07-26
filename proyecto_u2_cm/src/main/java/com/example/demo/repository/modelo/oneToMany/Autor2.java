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
@Table(name = "autor2")
public class Autor2 {

	@Id
	@Column(name = "autor_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "autor2_id_seq")
	@SequenceGenerator(name = "autor2_id_seq",sequenceName = "autor2_id_seq",allocationSize = 1)
	private Integer id;
	
	@Column(name = "autor_nombre")
	private String nombre;
	
	@OneToMany(mappedBy = "autor2")
	private List<Autor2libro2> autor2libro2;

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

	public List<Autor2libro2> getAutor2libro2() {
		return autor2libro2;
	}

	public void setAutor2libro2(List<Autor2libro2> autor2libro2) {
		this.autor2libro2 = autor2libro2;
	}
	
}
