package com.example.Proyecto_Agenda.servicios.persona;

import java.util.List;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.example.Proyecto_Agenda.dao.persona.PersonaDAO;
import com.example.Proyecto_Agenda.model.Persona;
import com.example.Proyecto_Agenda.servicios.categoria.CategoriaServiciosImpl;


@Service("perService")
public class PersonaServiciosImpl implements PersonaServicios {

	private static final Logger logger = LoggerFactory.getLogger(CategoriaServiciosImpl.class);
	
	//@Qualifier("personaDAOJpaRepository")
	@Autowired
	@Qualifier("personaDAOJpaRepository")
	private PersonaDAO persD;

	public PersonaServiciosImpl(){}
	
	public PersonaServiciosImpl(PersonaDAO persD) {
		super();
		this.persD = persD;
	}

	public PersonaDAO getPersD() {
		return persD;
	}

	public void setPersD(PersonaDAO persD) {
		this.persD = persD;
	}

	@Override
	public List<Persona> list() {
		System.out.println("PersonaServiciosImpl metodo list inicio ");
		return persD.findAll();
	}
	
	@Override
	public List<Persona> findAll() {
		return persD.findAll();
	}

	@Override
	public Persona get(int id) {
		logger.info("--- PersonaServiciosImpl--> Modificando ---");
		return persD.findOne(id);
	}



	@Override
	public void delete(int id) {
		logger.info("--- PersonaServiciosImpl--> Eliminando ---");
		persD.delete(id);		
	}

	@Override
	public void add(Persona persona) {
		logger.info("--- PersonaServiciosImpl --> Añadiendo --> INICICO");
		logger.info("PERSONA OBJETO EN PersonaServiciosImple --> ADD --> INICIO "+persona);
		persD.save(persona);
		logger.info("PERSONA OBJETO EN PersonaServiciosImple --> ADD --> FIN"+persD.save(persona));
		logger.info("--- PersonaServiciosImpl --> Añadiendo --> FINAL");
	}

	@Override
	public void update(Persona persona) {
		logger.info("--- PersonaServiciosImpl --> Updating ---");
		persD.save(persona);		
	}
	
	
	

	
}
