package com.example.Proyecto_Agenda.dao.departamento;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.Proyecto_Agenda.model.Departamento;
import com.example.Proyecto_Agenda.model.Persona;

@Component
@Repository("departamentoDAOJpaRepository")
public interface DepartamentoDAO extends JpaRepository<Departamento, Integer>{
	
	
}
