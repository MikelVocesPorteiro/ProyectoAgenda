package com.example.Proyecto_Agenda.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.Proyecto_Agenda.model.Categoria;
import com.example.Proyecto_Agenda.model.Departamento;
import com.example.Proyecto_Agenda.model.Direccion;
import com.example.Proyecto_Agenda.model.Empleado;
import com.example.Proyecto_Agenda.model.Persona;
import com.example.Proyecto_Agenda.model.Telefono;
import com.example.Proyecto_Agenda.servicios.categoria.CategoriaServicios;
import com.example.Proyecto_Agenda.servicios.departamento.DepartamentoServicios;
import com.example.Proyecto_Agenda.servicios.direccion.DireccionServicios;
import com.example.Proyecto_Agenda.servicios.empleado.EmpleadoServicios;
import com.example.Proyecto_Agenda.servicios.persona.PersonaServicios;
import com.example.Proyecto_Agenda.servicios.telefono.TelefonoServicios;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller("anaController")
public class HomeController {

	// @Qualifier("personaService")

	@Autowired
	private PersonaServicios perS;

	@Autowired
	@Qualifier("catService")
	private CategoriaServicios catS;

	@Autowired
	private DepartamentoServicios depS;

	@Autowired
	@Qualifier("telfService")
	private TelefonoServicios telfS;

	@Autowired
	@Qualifier("dirService")
	private DireccionServicios dirS;

	@Autowired

	private EmpleadoServicios empS;

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/*
	 * @RequestMapping("/new") public String
	 * greeting(@RequestParam(value="name", required=false,
	 * defaultValue="World") String name, Model model) { List<Persona> lista =
	 * perS.list(); logger.info(
	 * "----------------------------------------------------------------");
	 * logger.info("Lista = " + lista); logger.info(
	 * "----------------------------------------------------------------");
	 * 
	 * model.addAttribute("name", lista); return "greeting"; }
	 */
	// LISTAR CATEGORIAS
	@RequestMapping(value = "/categoria", method = RequestMethod.GET)
	public String greeting(@RequestParam(value = "listacat", required = false, defaultValue = "World") String listacat,
			Model model) {

		List<Categoria> lista = catS.list();
		logger.info("----------------------------------------------------------------");
		logger.info("Lista = " + lista);
		logger.info("----------------------------------------------------------------");

		model.addAttribute("listacat", lista);
		return "tablaCAT";
	}

	// LISTAR PERSONAS
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String listaperso(@RequestParam(value = "name", required = false, defaultValue = "World") String name,
			Model model) {

		List<Persona> lista = perS.list();
		logger.info("----------------------------------------------------------------");
		logger.info("Lista = " + lista);
		logger.info("----------------------------------------------------------------");

		model.addAttribute("listPers", lista);
		return "PerList";
	}

	// LISTAR DEPARTAMENTOS
	@RequestMapping("/departamentos")
	public String listadep(@RequestParam(value = "name", required = false, defaultValue = "World") String name,
			Model model) {

		List<Departamento> lista = depS.list();
		logger.info("----------------------------------------------------------------");
		logger.info("Lista = " + lista);
		logger.info("----------------------------------------------------------------");

		model.addAttribute("lista", lista);
		return "tablaDEP";
	}
	// LISTAR TELEFONOS

	@RequestMapping("/telefonos")
	public String listatelf(@RequestParam(value = "name", required = false, defaultValue = "World") String name,
			Model model) {

		List<Telefono> lista = telfS.list();
		logger.info("----------------------------------------------------------------");
		logger.info("Lista = " + lista);
		logger.info("----------------------------------------------------------------");

		model.addAttribute("name", lista);
		return "PerList";
	}
	// LISTAR DIRECCIONES

	@RequestMapping("/direcciones")
	public String listadir(@RequestParam(value = "name", required = false, defaultValue = "World") String name,
			Model model) {

		List<Direccion> lista = dirS.list();
		logger.info("----------------------------------------------------------------");
		logger.info("Lista = " + lista);
		logger.info("----------------------------------------------------------------");

		model.addAttribute("name", lista);
		return "PerList";

	}

	// LISTAR EMPLEADOS

	@RequestMapping("/empleados")
	public String listaemp(@RequestParam(value = "name", required = false, defaultValue = "World") String name,
			Model model) {

		List<Empleado> lista = empS.list();
		logger.info("----------------------------------------------------------------");
		logger.info("Lista = " + lista);
		logger.info("----------------------------------------------------------------");

		model.addAttribute("name", lista);
		return "PerList";
	}

	// AÑADIR PERSONA
	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public ModelAndView anadirPersona() {
		logger.info("--- EN ANADIR");
		ModelAndView model = new ModelAndView("FormInsert");
		model.addObject("persona", new Persona());
		logger.info("MODELO: " + model);
		return model;
	}

	// ELIMINAR POR CATEGORIA
	@RequestMapping(value = "/deleteCat/{idcategorias}", method = RequestMethod.GET)
	public ModelAndView deleteCat(@PathVariable("idcategorias") Integer idcategorias) {
//		ModelAndView model = new ModelAndView("PerList");
		catS.delete(idcategorias);
		return new ModelAndView("redirect:/");
	}

	// ELIMINAR POR PERSONA
	@RequestMapping(value = "/deletePer/{idpersonas}", method = RequestMethod.GET)
	public ModelAndView deletePer(@PathVariable("idpersonas") Integer idpersonas) {
//		ModelAndView model = new ModelAndView("PerList");
		perS.delete(idpersonas);
		return new ModelAndView("redirect:/");
	}
	// ELIMINAR POR DEPARTAMENTO
	@RequestMapping(value = "/deleteDep/{iddepartamento}", method = RequestMethod.GET)
	public ModelAndView deleteDep(@PathVariable("iddepartamento") Integer iddepartamento) {
//		ModelAndView model = new ModelAndView("PerList");
		perS.delete(iddepartamento);
		return new ModelAndView("redirect:/");
	}

	// GUARDAR PERSONA
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute ("persona") Persona persona) {
		logger.info("-- en GUARDAR");
		perS.add(persona);
		logger.info("OBJETO PERSONA --> " + perS);
		return new ModelAndView("redirect:/");
	}

}
