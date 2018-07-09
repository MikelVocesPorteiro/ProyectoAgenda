package com.example.ProyectoAgenda.dao.categoria;

import java.util.List;

import org.hibernate.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.ProyectoAgenda.model.Categoria;

public class CategoriaDAOImpl implements CategoriaDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Categoria> list() {
		System.out.println("--- CategoriaDAOImpl --> list() --> INICIO");
		Query query = sessionFactory.getCurrentSession().createQuery("from Categoria");
		System.out.println("--antes de list");
	    List<Categoria> catList = (List<Categoria>) query.list();
		System.out.println("--antes de for");
	    for (Categoria c : catList) {
	        System.out.println(c);
	    }
		System.out.println("--- CategoriaDAOImpl --> list() --> FIN");
		return catList;
	}

	@Override
	public Categoria get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(Categoria categoria) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
	

}
