package es.proyecto.webpersonal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import es.proyecto.webpersonal.entities.Proyectos;
import es.proyecto.webpersonal.service.ProyectosService;

@Controller
public class ProjectsController {
	
	@Autowired
	private ProyectosService proyectosService;
	
	@RequestMapping("/proyectos")
	public String volverTecnologias(Model proyectos) {
		List<Proyectos> listaProyectos =  proyectosService.getProyectos();
		proyectos.addAttribute("proyecto", listaProyectos);
		return "projects";
	}
}
