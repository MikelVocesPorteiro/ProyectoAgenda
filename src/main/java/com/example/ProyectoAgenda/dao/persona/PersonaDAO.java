package com.example.ProyectoAgenda.dao.persona;

import java.util.List;

import com.example.ProyectoAgenda.model.Empleado;
import com.example.ProyectoAgenda.model.Persona;

public interface PersonaDAO {
	public List<Persona> list();
	
	public Persona get(int id);
	
	public void saveOrUpdate(Persona persona);
	
	public void delete(int id);

}
