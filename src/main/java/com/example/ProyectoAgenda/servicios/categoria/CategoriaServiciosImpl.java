package com.example.ProyectoAgenda.servicios.categoria;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.ProyectoAgenda.dao.categoria.CategoriaDAO;
import com.example.ProyectoAgenda.model.Categoria;
import com.example.ProyectoAgenda.model.Empleado;

public class CategoriaServiciosImpl implements CategoriaServicios {

//crear un objeto automaticamente de la clase  categoriaDAO en el momento en el que creo un objeto de mi clase categoria
	//servicios
	@Autowired
	private CategoriaDAO cd;

	@Override
	public List<Categoria> list() {
		// tengo un metodo LISTAR en categoria dao al que tengo que llamar en
		// servicios y para ello
		// el nombre cd con el .list(); para unirlos
		System.out.println("--- CategoriaServiciosImp --> list() --> INICIO");
		 List<Categoria> listaCat  = cd.list();
		System.out.println("--- CategoriaServiciosImp --> list() --> FIN");		
		return listaCat;

	}

	@Override
	public Categoria get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(Categoria categoria) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}
