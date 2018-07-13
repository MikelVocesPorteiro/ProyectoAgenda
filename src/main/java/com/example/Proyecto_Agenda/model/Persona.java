package com.example.Proyecto_Agenda.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "personas")
public class Persona implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name="idpersonas")
	private int idpersonas;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido1")
	private String apellido1;
	
	@Column(name="apellido2")
	private String apellido2;
	
	//cambiar a STRING por cosa de BBDD
	@Column(name="dni")
	private int dni;
	
	@Column(name="fechaNacimiento")
	private Date fechaNacimiento;
	
	@Column(name="idEmpleado")
	private int idEmpleado;
	
	@OneToOne
	@JoinColumn(name="idEmpleado",referencedColumnName="idempleados")
	private Empleado empleado;
	
	@OneToMany(mappedBy="persona")
	private List<Telefono> telefonos;
	
	@OneToMany(mappedBy="pers")
	private List<Direccion> direcciones;
	
	//actualizar constructor
	
public Persona(int idpersonas, String nombre, String apellido1, String apellido2, int dni, Date fechaNacimiento) {
	super();
	this.idpersonas = idpersonas;
	this.nombre = nombre;
	this.apellido1 = apellido1;
	this.apellido2 = apellido2;
	this.dni = dni;
	this.fechaNacimiento = fechaNacimiento;
}
	public Persona(){
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idpersonas")
	public int getIdpersonas() {
		return idpersonas;
	}
	public void setIdpersonas(int idpersonas) {
		this.idpersonas = idpersonas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Persona [idpersonas=" + idpersonas + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2="
				+ apellido2 + ", dni=" + dni + ", fechaNacimiento=" + fechaNacimiento 
				+ "]";
	}
	
//	
//	public Persona(int idpersonas, String nombre, String apellido1, String apellido2, int dni, Date fechaNacimiento, int idEmpleado) {
//		super();
//		this.idpersonas = idpersonas;
//		this.nombre = nombre;
//		this.apellido1 = apellido1;
//		this.apellido2 = apellido2;
//		this.dni = dni;
//		this.fechaNacimiento = fechaNacimiento;
//		this.idEmpleado = idEmpleado;
//	}	
	
	
	
	
	
	
}
