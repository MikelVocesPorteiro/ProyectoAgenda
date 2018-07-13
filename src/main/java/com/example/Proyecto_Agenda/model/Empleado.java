package com.example.Proyecto_Agenda.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "empleados")
public class Empleado implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name="idempleados")
	private int idempleados;
	
	@Column(name="codEmpleado")
	private String codEmpleado;
	
	@Column(name="salario")
	private String salario;
	
	@Column(name="fechaAlta")
	private Date fechaAlta;
	
	@Column(name="idDepartamento")
	private int idDepartamento;
	
	@Column(name="idCategoria")
	private int idCategoria;
	
	@OneToOne(mappedBy="empleado")
	private Persona personas;
	
	@ManyToOne
	@JoinColumn(name = "idDepartamento",referencedColumnName="iddepartamento")
	private Departamento dpto;
	
	@ManyToOne
	@JoinColumn(name="idCategoria",referencedColumnName="idcategorias")
	private Categoria categoria;

	public Empleado() {
		
	}

	public Empleado(int idempleados, String codEmpleado, String salario, Date fechaAlta, int idDepartamento,
			int idCategoria) {
		super();
		this.idempleados = idempleados;
		this.codEmpleado = codEmpleado;
		this.salario = salario;
		this.fechaAlta = fechaAlta;
		this.idDepartamento = idDepartamento;
		this.idCategoria = idCategoria;
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

	public String getCodEmpleado() {
		return codEmpleado;
	}

	public void setCodEmpleado(String codEmpleado) {
		this.codEmpleado = codEmpleado;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public int getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	@Override
	public String toString() {
		return "Empleado [idempleados=" + idempleados + ", codEmpleado=" + codEmpleado + ", salario=" + salario
				+ ", fechaAlta=" + fechaAlta + ", idDepartamento=" + idDepartamento + ", idCategoria=" + idCategoria
				+ "]";
	}

	
	

}
