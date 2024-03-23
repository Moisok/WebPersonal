package es.proyecto.webpersonal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProjectsController {
	
	@RequestMapping("/proyectos")
	public String volverTecnologias() {
		return "projects";
	}
}
