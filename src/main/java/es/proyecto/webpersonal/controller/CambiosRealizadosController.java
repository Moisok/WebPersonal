package es.proyecto.webpersonal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/cambiosrealizados")
public class CambiosRealizadosController {
	
	@RequestMapping("/tecnologia")
	public String volverTecnologias() {
		return "redirect:/adminzone/gestionartecnologias";
	}
	
	@RequestMapping("/habilidad")
	public String volverHabilidades() {
		return "redirect:/adminzone/gestionarhabilidades";
	}
	
	@RequestMapping("/experiencia")
	public String volverExperiencias() {
		return "redirect:/adminzone/gestionarexperiencia";
	}
	
	@RequestMapping("/estudio")
	public String volverEstudios() {
		return "redirect:/adminzone/gestionarestudios";
	}
	
	@RequestMapping("/proyecto")
	public String volverProyectos() {
		return "redirect:/adminzone/gestionarproyectos";
	}
	
	@RequestMapping("/home")
	public String volverHome() {
		return "redirect:/adminzone/gestionarhome";
	}

}
