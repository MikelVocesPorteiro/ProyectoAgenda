package com.example.Proyecto_Agenda.dao.direccion;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.Proyecto_Agenda.model.Direccion;





@Component
@Repository("direccionDAOJpaRepository")
public interface DireccionDAO extends JpaRepository<Direccion, Integer>{

}










