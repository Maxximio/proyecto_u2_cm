package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="matricula")
public class Matricula {
	
	@Id
	@Column(name="matri_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "matri_id_seq")
	@SequenceGenerator(name = "matri_id_seq",sequenceName = "matri_id_seq",allocationSize = 1)
	private Integer id;
	
	@Column(name="matri_vehiculo")
	private Vehiculo vehiculo;
	
	@Column(name="matri_propietario")
	private Propietario propietario;
	
	@Column(name="matri_fecha")
	private LocalDateTime fechaMatricula;
	
	@Column(name="matri_valor")
	private BigDecimal valor;
	
	//set y get
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	public Propietario getPropietario() {
		return propietario;
	}
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	public LocalDateTime getFechaMatricula() {
		return fechaMatricula;
	}
	public void setFechaMatricula(LocalDateTime fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	//to string
	@Override
	public String toString() {
		return "Matricula [id=" + id + ", vehiculo=" + vehiculo + ", propietario=" + propietario + ", fechaMatricula="
				+ fechaMatricula + ", valor=" + valor + "]";
	}
}
