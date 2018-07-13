package com.example.Proyecto_Agenda.servicios.categoria;

import java.util.List;
import javax.transaction.Transactional;
import com.example.Proyecto_Agenda.model.Categoria;



@Transactional
public interface CategoriaServicios {

	public List<Categoria> list();

	public Categoria get(int id);

	public void update(Categoria categoria);
	public void add(Categoria categoria);
	public void delete(int id);

}
