package com.example.Proyecto_Agenda.servicios.departamento;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.example.Proyecto_Agenda.dao.departamento.DepartamentoDAO;
import com.example.Proyecto_Agenda.model.Departamento;
import com.example.Proyecto_Agenda.servicios.categoria.CategoriaServiciosImpl;


@Service("depService")
public class DepartamentoServiciosImpl implements DepartamentoServicios {
	private static final Logger logger = LoggerFactory.getLogger(CategoriaServiciosImpl.class);

	@Autowired
	@Qualifier("departamentoDAOJpaRepository")
	private DepartamentoDAO deptD;	
	
	@Override
	public List<Departamento> list() {
		return deptD.findAll();
	}

	@Override
	public Departamento get(int id) {
		logger.info("--- Servicios --> Modificando ---");
		return deptD.findOne(id);
	}

	@Override
	public void delete(int id) {
		logger.info("--- Servicios --> Eliminando ---");
		deptD.delete(id);		
	}

	@Override
	public void update(Departamento depto) {
		logger.info("--- Servicios --> Updating ---");
		deptD.save(depto);
	}

	@Override
	public void add(Departamento depto) {
		logger.info("--- Servicios --> Añadiendo ---");
		deptD.save(depto);
	}

	

}
