package com.example.Proyecto_Agenda.servicios.categoria;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.example.Proyecto_Agenda.dao.categoria.CategoriaDAO;
import com.example.Proyecto_Agenda.model.Categoria;


@Service("catService")
public class CategoriaServiciosImpl implements CategoriaServicios {

	private static final Logger logger = LoggerFactory.getLogger(CategoriaServiciosImpl.class);
	
	@Autowired
	@Qualifier("categoriaDAOJpaRepository")
	private CategoriaDAO catD;
	
	public CategoriaServiciosImpl(){
		logger.info("ENTRA AL CONSTRUCTOR DE CATEGORIA SERVICIOS IMPLE");
	}
	
	public CategoriaServiciosImpl(CategoriaDAO catD) {
		this.catD = catD;
	}

	@Override
	public List<Categoria> list() {
		logger.info("------------list inicio");
	
		return catD.findAll();
	}


	public CategoriaDAO getCatD() {
		return catD;
	}

	public void setCatD(CategoriaDAO catD) {
		this.catD = catD;
	}

	@Override
	public Categoria get(int id) {
		logger.info("--- Servicios --> Modificando ---");
		return catD.findOne(id);
	}

	@Override
	public void delete(int id) {
		logger.info("--- Servicios --> Eliminando ---");
		catD.delete(id);		
	}

	@Override
	public void update(Categoria categoria) {
		logger.info("--- Servicios --> Updating ---");
		catD.save(categoria);
	}

	@Override
	public void add(Categoria categoria) {
		logger.info("--- Servicios --> Añadiendo ---");
		catD.save(categoria);
	}



}
