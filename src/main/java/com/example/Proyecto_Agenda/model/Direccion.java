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
@Table(name = "Direcciones")
public class Direccion {
	
	
	@Id
	@GeneratedValue
	@Column(name="iddirecciones")
	private int iddirecciones;
	
	@Column(name="direccion")
	private String direccion;
	
	@Column(name="codPostal")
	private String codPostal;
	
	@Column(name="localidad")
	private String localidad;
	
	@Column(name="provincia")
	private String provincia;
	
	@Column(name="idPersona")
	private int idPersona;
	
	
	@ManyToOne
	@JoinColumn(name="idPersona", referencedColumnName="idpersonas")
	private Persona pers;
	
	public Direccion(){
	}

	public Direccion(int iddirecciones, String direccion, String codPostal, String localidad, String provincia,
			int idPersona) {
		super();
		this.iddirecciones = iddirecciones;
		this.direccion = direccion;
		this.codPostal = codPostal;
		this.localidad = localidad;
		this.provincia = provincia;
		this.idPersona = idPersona;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "IDDIRECCIONES")
	public int getIddirecciones() {
		return iddirecciones;
	}

	public void setIddirecciones(int iddirecciones) {
		this.iddirecciones = iddirecciones;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	@Override
	public String toString() {
		return "Direccion [iddirecciones=" + iddirecciones + ", direccion=" + direccion + ", codPostal=" + codPostal
				+ ", localidad=" + localidad + ", provincia=" + provincia + ", idPersona=" + idPersona + "]";
	}
	
	
}
