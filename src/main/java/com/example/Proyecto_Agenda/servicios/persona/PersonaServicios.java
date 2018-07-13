package com.example.Proyecto_Agenda.servicios.persona;

import java.util.List;

import javax.transaction.Transactional;

import com.example.Proyecto_Agenda.model.Persona;

//@Service("personaService")
@Transactional
public interface PersonaServicios {
	
	public abstract List<Persona> findAll();
	public List<Persona> list();
	
	public Persona get(int id);

	public void add(Persona persona);
	public void update(Persona persona);

	public void delete(int id);
}
