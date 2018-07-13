package com.example.Proyecto_Agenda.dao.persona;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.Proyecto_Agenda.model.Persona;

@Component
@Repository("personaDAOJpaRepository")
public interface PersonaDAO extends JpaRepository<Persona, Integer>{
	
	
}
