package com.example.Proyecto_Agenda.servicios.empleado;

import java.util.List;

import com.example.Proyecto_Agenda.model.Empleado;

public interface EmpleadoServicios {
	
	public List<Empleado> list();
	
	public Empleado get(int id);
	
	public void add(Empleado empleado);
	public void update(Empleado empleado);

	public void delete(int id);

}
