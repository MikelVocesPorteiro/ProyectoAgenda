package com.example.Proyecto_Agenda.servicios.direccion;

import java.util.List;
import javax.transaction.Transactional;
import com.example.Proyecto_Agenda.model.Direccion;




@Transactional
public interface DireccionServicios {
	
	public List<Direccion> list();

	public Direccion get(int id);

	public void add(Direccion direccion);

	public void update(Direccion direccion);

	public void delete(int id);

}









