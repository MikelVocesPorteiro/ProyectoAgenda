package com.example.ProyectoAgenda.servicios.empleado;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.ProyectoAgenda.dao.empleado.EmpleadoDAO;
import com.example.ProyectoAgenda.model.Empleado;

public class EmpleadoServiciosImpl implements EmpleadoServicios {
	
	@Autowired
	private EmpleadoDAO ed;

	@Override
	public List<Empleado> list() {
		System.out.println("--- EmpleadosServiciosImp --> list() --> INICIO");
		List<Empleado> listaEmpleados = ed.list();
		System.out.println("--- EmpleadosServiciosImp --> list() --> FIN");
		return listaEmpleados;
	}

	@Override
	public Empleado get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(Empleado empleado) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
