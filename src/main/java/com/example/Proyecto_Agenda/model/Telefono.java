package com.example.Proyecto_Agenda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TELEFONOS")

public class Telefono {
	
	
	@Id
	@GeneratedValue
	@Column(name="idtelefonos")
	private int idtelefonos;
	
	@Column(name="telefono")
	private int telefono;
	
	@Column(name="idPersona")
	private int idPersona;
	@ManyToOne
	@JoinColumn(name="idPersona", referencedColumnName="idpersonas")
	private Persona persona;
	
	
	
	public Telefono(int idtelefonos, int telefono, int idPersona) {
		super();
		this.idtelefonos = idtelefonos;
		this.telefono = telefono;
		this.idPersona = idPersona;
	}
	
	public Telefono(){
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "IDTELEFONOS")
	
	public int getIdtelefonos() {
		return idtelefonos;
	}

	public void setIdtelefonos(int idtelefonos) {
		this.idtelefonos = idtelefonos;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	@Override
	public String toString() {
		return "Telefono [idtelefonos=" + idtelefonos + ", telefono=" + telefono + ", idPersona=" + idPersona + "]";
	}
	
	
	
	
}
