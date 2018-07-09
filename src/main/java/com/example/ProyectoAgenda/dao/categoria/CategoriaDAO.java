package com.example.ProyectoAgenda.dao.categoria;

import java.util.List;

import com.example.ProyectoAgenda.model.Categoria;
import com.example.ProyectoAgenda.model.Empleado;

public interface CategoriaDAO {


	public List<Categoria> list();
	
	public Categoria get(int id);
	
	public void saveOrUpdate(Categoria categoria);
	
	public void delete(int id);
}
