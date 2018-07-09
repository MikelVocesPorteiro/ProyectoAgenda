package com.example.ProyectoAgenda.servicios.categoria;

import java.util.List;

import com.example.ProyectoAgenda.model.Categoria;

public interface CategoriaServicios {

	public List<Categoria> list();

	public Categoria get(int id);

	public void saveOrUpdate(Categoria categoria);

	public void delete(int id);

}
