package com.example.Proyecto_Agenda.servicios.empleado;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.Proyecto_Agenda.dao.empleado.EmpleadoDAO;
import com.example.Proyecto_Agenda.model.Direccion;
import com.example.Proyecto_Agenda.model.Empleado;
import com.example.Proyecto_Agenda.servicios.telefono.TelefonoServiciosImpl;

@Service
public class EmpleadoServiciosImpl implements EmpleadoServicios {
	private static final Logger logger = LoggerFactory.getLogger(TelefonoServiciosImpl.class);

	@Autowired
	@Qualifier("empleadoDAOJpaRepository")
	private EmpleadoDAO empD;
	
	@Override
	public List<Empleado> list() {
		System.out.println("PersonaServiciosImpl metodo list inicio ");

		return empD.findAll();
	}

	@Override
	public Empleado get(int id) {
		logger.info("--- Servicios --> Modificando ---");
		return empD.findOne(id);
	}

	@Override
	public void delete(int id) {
		logger.info("--- Servicios --> Eliminando ---");
		empD.delete(id);		
	}

	@Override
	public void update(Empleado emp) {
		logger.info("--- Servicios --> Updating ---");
		empD.save(emp);
	}

	@Override
	public void add(Empleado emp) {
		logger.info("--- Servicios --> Añadiendo ---");
		empD.save(emp);
	}
	
	
	

}
