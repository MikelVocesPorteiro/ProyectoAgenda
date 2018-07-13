package com.example.Proyecto_Agenda.servicios.telefono;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.example.Proyecto_Agenda.dao.telefono.TelefonoDAO;
import com.example.Proyecto_Agenda.model.Direccion;
import com.example.Proyecto_Agenda.model.Telefono;



@Service("telfService")
public class TelefonoServiciosImpl implements TelefonoServicios {
	
	private static final Logger logger = LoggerFactory.getLogger(TelefonoServiciosImpl.class);
	
	
	@Autowired
	@Qualifier("telefonoDAOJpaRepository")
	private TelefonoDAO telfD;

	@Override
	public List<Telefono> list() {
		logger.info("TelefonoServiciosImpl metodo list inicio ");

		return telfD.findAll();
	}

@Override
public Telefono get(int id) {
	logger.info("--- Servicios --> Modificando ---");
	return telfD.findOne(id);
}

@Override
public void delete(int id) {
	logger.info("--- Servicios --> Eliminando ---");
	telfD.delete(id);		
}

@Override
public void update(Telefono tel) {
	logger.info("--- Servicios --> Updating ---");
	telfD.save(tel);
}

@Override
public void add(Telefono tel) {
	logger.info("--- Servicios --> Añadiendo ---");
	telfD.save(tel);
}
	
	

}
