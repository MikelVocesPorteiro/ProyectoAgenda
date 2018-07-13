package com.example.Proyecto_Agenda.servicios.direccion;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.example.Proyecto_Agenda.dao.direccion.DireccionDAO;
import com.example.Proyecto_Agenda.model.Departamento;
import com.example.Proyecto_Agenda.model.Direccion;
import com.example.Proyecto_Agenda.servicios.telefono.TelefonoServiciosImpl;


@Service("dirService")
public class DireccionServiciosImpl implements DireccionServicios  {
	
private static final Logger logger = LoggerFactory.getLogger(TelefonoServiciosImpl.class);

@Autowired
@Qualifier("direccionDAOJpaRepository")
private DireccionDAO dirD;

@Override
public List<Direccion> list() {
	logger.info("DireccionServiciosImpl metodo list inicio ");

	return dirD.findAll();
}

@Override
public Direccion get(int id) {
	logger.info("--- Servicios --> Modificando ---");
	return dirD.findOne(id);
}

@Override
public void delete(int id) {
	logger.info("--- Servicios --> Eliminando ---");
	dirD.delete(id);		
}

@Override
public void update(Direccion dir) {
	logger.info("--- Servicios --> Updating ---");
	dirD.save(dir);
}

@Override
public void add(Direccion dir) {
	logger.info("--- Servicios --> Añadiendo ---");
	dirD.save(dir);
}
}





	
	