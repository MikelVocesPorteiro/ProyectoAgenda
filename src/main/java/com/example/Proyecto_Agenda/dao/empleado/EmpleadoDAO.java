package com.example.Proyecto_Agenda.dao.empleado;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import com.example.Proyecto_Agenda.model.Empleado;


@Component
@Repository("empleadoDAOJpaRepository")
public interface EmpleadoDAO extends JpaRepository<Empleado, Integer>{
	
	
}