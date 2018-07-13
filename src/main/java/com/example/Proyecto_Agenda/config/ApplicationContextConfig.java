package com.example.Proyecto_Agenda.config;

import java.util.List;
import java.util.Properties;

import javax.sql.DataSource;

//import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.example.Proyecto_Agenda.model.Categoria;
import com.example.Proyecto_Agenda.model.Persona;
import com.example.Proyecto_Agenda.servicios.categoria.CategoriaServicios;
import com.example.Proyecto_Agenda.servicios.persona.PersonaServicios;
import com.example.Proyecto_Agenda.servicios.persona.PersonaServiciosImpl;

import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@SuppressWarnings("deprecation")
@Configuration
@ComponentScan("com.example.Proyecto_Agenda")
@EnableWebMvc
@EnableTransactionManagement
public class ApplicationContextConfig extends WebMvcConfigurerAdapter  {
    @Bean(name = "viewResolver")
    public InternalResourceViewResolver getViewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        /*
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        */
        return viewResolver;
    }
    
    /*
    
    @Bean
    public PersonaServicios personaservicios() {
        return new PersonaServicios() {
			
			@Override
			public void saveOrUpdate(Persona persona) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public List<Persona> list() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Persona get(int id) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public List<Persona> findAll() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void delete(int id) {
				// TODO Auto-generated method stub
				
			}
		};
    }
    
    @Bean("categoriaServicios")
    public CategoriaServicios categoriaservicios() {
        return new CategoriaServicios() {
			
			@Override
			public void saveOrUpdate(Categoria categoria) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public List<Categoria> list() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Categoria get(int id) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void delete(int id) {
				// TODO Auto-generated method stub
				
			}
		};
    }
    
    */
    
    
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
	    registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");  
	}
     
   

}

