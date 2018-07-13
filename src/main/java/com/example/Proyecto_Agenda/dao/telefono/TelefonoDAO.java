package com.example.Proyecto_Agenda.dao.telefono;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import com.example.Proyecto_Agenda.model.Telefono;

@Component
@Repository("telefonoDAOJpaRepository")
public interface TelefonoDAO extends JpaRepository<Telefono, Integer > {

}






