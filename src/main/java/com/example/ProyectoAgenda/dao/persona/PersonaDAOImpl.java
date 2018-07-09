package com.example.ProyectoAgenda.dao.persona;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.internal.SessionFactoryImpl;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.ProyectoAgenda.model.Empleado;
import com.example.ProyectoAgenda.model.Persona;

public class PersonaDAOImpl implements PersonaDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Persona> list() {
		System.out.println("--- PersonaDAOImpl --> list() --> INICIO");
		// en hql no existe el select se coge entero con el from y nombre de la
		// clase
		// si quiero algo especifico lo hago con el where si no me cogera TODO
		// los atributos
		// ejemplo este from personas
		Query query = sessionFactory.getCurrentSession().createQuery("from personas");
		System.out.println("--antes de list");
		// aqui hacemos un casting para saber reconocer el programa que es una
		// lista de la clase
		// persona al pasarle un objeto de clase persona por eso casteamos,si no
		// seria pasar objetos
		// objeto1,2...con el casting pues es objeto de la CLASE persona
		//List<Persona> personaList = (List<Persona>) query.list();
		List<Persona> personaList = (List<Persona>) sessionFactory.getCurrentSession()
				.createCriteria(Persona.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		System.out.println("--- PersonaDAOImpl --> list() --> FIN");
		return personaList;
	}

	
	
	@Override
	public Persona get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(Persona persona) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}
