package com.example.ProyectoAgenda.servicios.persona;

import java.util.List;

import com.example.ProyectoAgenda.model.Empleado;
import com.example.ProyectoAgenda.model.Persona;

public interface PersonaServicios {
	public List<Persona> list();
	
	public Persona get(int id);
	
	public void saveOrUpdate(Persona persona);
	
	public void delete(int id);
}
