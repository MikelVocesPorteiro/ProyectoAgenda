package com.example.Proyecto_Agenda.servicios.departamento;

import java.util.List;

import com.example.Proyecto_Agenda.model.Categoria;
import com.example.Proyecto_Agenda.model.Departamento;

public interface DepartamentoServicios {
	public List<Departamento> list();
	
	public Departamento get(int id);
	
	public void update(Departamento departamento);
	public void add(Departamento departamento);	
	public void delete(int id);

}
