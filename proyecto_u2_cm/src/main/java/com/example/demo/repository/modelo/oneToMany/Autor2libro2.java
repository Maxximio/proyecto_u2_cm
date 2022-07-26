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
@Table(name = "autor2_libro2")
public class Autor2libro2 {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mid_id_seq")
	@SequenceGenerator(name = "mid_id_seq", sequenceName = "mid_id_seq", allocationSize = 1)
	@Column(name = "mid_id")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "mid_id_autor")
	private Autor2 autor2;
	
	@ManyToOne
	@JoinColumn(name = "mid_id_libro")
	private Libro2 libro2;

	public Autor2 getAutor2() {
		return autor2;
	}

	public void setAutor2(Autor2 autor2) {
		this.autor2 = autor2;
	}

	public Libro2 getLibro2() {
		return libro2;
	}

	public void setLibro2(Libro2 libro2) {
		this.libro2 = libro2;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
}
