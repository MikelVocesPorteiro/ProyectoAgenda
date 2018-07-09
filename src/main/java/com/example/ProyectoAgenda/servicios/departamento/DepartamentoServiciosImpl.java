package com.example.ProyectoAgenda.servicios.departamento;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.ProyectoAgenda.dao.departamento.DepartamentoDAO;
import com.example.ProyectoAgenda.model.Categoria;
import com.example.ProyectoAgenda.model.Departamento;

public class DepartamentoServiciosImpl implements DepartamentoServicios {

	@Autowired
	private DepartamentoDAO dd;

	@Override
	public List<Departamento> list() {
		System.out.println("--- DepartamentoServiciosImp --> list() --> INICIO");
		List<Departamento> listaDptos = dd.list();
		System.out.println("--- DepartamentoServiciosImp --> list() --> FIN");
		return listaDptos;
	}

	@Override
	public Departamento get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(Departamento departamento) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}
