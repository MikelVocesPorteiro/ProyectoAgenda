package com.example.ProyectoAgenda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DEPARTAMENTOS")
public class Departamento {
	
	private int iddepartamento;
	private String nombre;
	
	public Departamento(){
		
	}

	public Departamento(int iddepartamento, String nombre) {
		super();
		this.iddepartamento = iddepartamento;
		this.nombre = nombre;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "IDDEPARTAMENTO")
	public int getIdDepartamento() {
		return iddepartamento;
	}

	public void setIdDepartamento(int iddepartamento) {
		this.iddepartamento = iddepartamento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Departamento [iddepartamento=" + iddepartamento + ", nombre=" + nombre + "]";
	}
	
	

}
