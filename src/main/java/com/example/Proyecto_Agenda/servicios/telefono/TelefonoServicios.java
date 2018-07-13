package com.example.Proyecto_Agenda.servicios.telefono;

import java.util.List;

import javax.transaction.Transactional;




import com.example.Proyecto_Agenda.model.Telefono;

@Transactional
public interface TelefonoServicios {
	
	public List<Telefono> list();

	public Telefono get(int id);

	public void add(Telefono telefono);
	public void update(Telefono telefono);

	public void delete(int id);


}








