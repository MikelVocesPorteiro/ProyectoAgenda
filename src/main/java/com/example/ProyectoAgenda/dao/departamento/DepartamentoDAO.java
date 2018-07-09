package com.example.ProyectoAgenda.dao.departamento;

import java.util.List;

import com.example.ProyectoAgenda.model.Departamento;
import com.example.ProyectoAgenda.model.Empleado;

public interface DepartamentoDAO {
	

	public List<Departamento> list();
	
	public Departamento get(int id);
	
	public void saveOrUpdate(Departamento departamento);
	
	public void delete(int id);

}
