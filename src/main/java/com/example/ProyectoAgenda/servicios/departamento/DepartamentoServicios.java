package com.example.ProyectoAgenda.servicios.departamento;

import java.util.List;

import com.example.ProyectoAgenda.model.Departamento;

public interface DepartamentoServicios {
	public List<Departamento> list();
	
	public Departamento get(int id);
	
	public void saveOrUpdate(Departamento departamento);
	
	public void delete(int id);

}
