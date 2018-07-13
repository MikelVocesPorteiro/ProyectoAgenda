package com.example.Proyecto_Agenda.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CATEGORIAS")
public class Categoria {
	
	@Id
	@GeneratedValue
	@Column(name="idcategorias")
	private int idcategorias;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@OneToMany(mappedBy="categoria")
	private List<Empleado> empleado;
	
	public Categoria(){
	
	}

	public Categoria(int idcategorias, String nombre, String descripcion) {
		super();
		this.idcategorias = idcategorias;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "IDCATEGORIAS")
	public int getIdcategorias() {
		return idcategorias;
	}

	public void setIdcategorias(int idcategorias) {
		this.idcategorias = idcategorias;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Categoria [idcategorias=" + idcategorias + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}
	
	
	

}
