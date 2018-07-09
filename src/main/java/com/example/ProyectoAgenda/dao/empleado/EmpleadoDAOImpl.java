package com.example.ProyectoAgenda.dao.empleado;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.ProyectoAgenda.model.Categoria;
import com.example.ProyectoAgenda.model.Empleado;

public class EmpleadoDAOImpl implements EmpleadoDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Empleado> list() {
		System.out.println("--- EmpleadoDAOImpl --> list() --> INICIO");
		Query query = sessionFactory.getCurrentSession().createQuery("from Empleado");
		System.out.println("--antes de list");
	    List<Empleado> empList = (List<Empleado>) query.list();
		System.out.println("--antes de for");
	    for (Empleado c : empList) {
	        System.out.println(c);
	    }
		System.out.println("--- EmpleadoDAOImpl --> list() --> FIN");
		return empList;
	}

	@Override
	public Empleado get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(Empleado empleado) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
	

}
