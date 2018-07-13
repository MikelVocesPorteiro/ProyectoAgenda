package com.example.Proyecto_Agenda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="personaempleado")
public class PersonaEmpleado {
	
	private int idpersonas;
	private int idempleados;
	
	@Autowired
	private Persona persona;
	@Autowired
	private Empleado empleado;
	
	
	public PersonaEmpleado(int idpersonas, int idempleados, Persona persona, Empleado empleado) {
		super();
		this.idpersonas = idpersonas;
		this.idempleados = idempleados;
		this.persona = persona;
		this.empleado = empleado;
	}
	public int getIdpersonas() {
		return idpersonas;
	}
	public void setIdpersonas(int idpersonas) {
		this.idpersonas = idpersonas;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "IDEMPLEADOS")
	public int getIdempleados() {
		return idempleados;
	}
	public void setIdempleados(int idempleados) {
		this.idempleados = idempleados;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	
	
	
	
	
	
	
	
}
