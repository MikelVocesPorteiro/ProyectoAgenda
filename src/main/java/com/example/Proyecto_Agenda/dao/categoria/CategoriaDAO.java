package com.example.Proyecto_Agenda.dao.categoria;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Proyecto_Agenda.model.Categoria;




@Repository("categoriaDAOJpaRepository")
//@Repository
public interface CategoriaDAO extends JpaRepository<Categoria, Integer>{
	
}
