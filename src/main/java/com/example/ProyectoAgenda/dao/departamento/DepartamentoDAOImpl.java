package com.example.ProyectoAgenda.dao.departamento;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.ProyectoAgenda.model.Categoria;
import com.example.ProyectoAgenda.model.Departamento;

public class DepartamentoDAOImpl implements DepartamentoDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Departamento> list() {
		System.out.println("--- DepartamentoDAOImpl --> list() --> INICIO");
		Query query = sessionFactory.getCurrentSession().createQuery("from Departamento");
		System.out.println("--antes de list");
	    List<Departamento> dptoList = (List<Departamento>) query.list();
		System.out.println("--antes de for");
	    for (Departamento d : dptoList) {
	        System.out.println(d);
	    }
		System.out.println("--- DepartamentoDAOImpl --> list() --> FIN");
		return dptoList;
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
