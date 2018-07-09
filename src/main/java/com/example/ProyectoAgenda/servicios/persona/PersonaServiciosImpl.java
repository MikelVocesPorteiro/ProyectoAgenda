package com.example.ProyectoAgenda.servicios.persona;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.ProyectoAgenda.dao.persona.PersonaDAO;
import com.example.ProyectoAgenda.dao.persona.PersonaDAOImpl;
import com.example.ProyectoAgenda.model.Persona;


public class PersonaServiciosImpl implements PersonaServicios {
	
	@Autowired
	private PersonaDAO persD;

	@Override
	public List<Persona> list() {
		System.out.println("PersonaServiciosImpl metodo list inicio ");
		PersonaDAOImpl persD = new PersonaDAOImpl();
		 List<Persona> lista = persD.list();

		return lista;
	}

	@Override
	public Persona get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(Persona persona) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	
	

	
}
