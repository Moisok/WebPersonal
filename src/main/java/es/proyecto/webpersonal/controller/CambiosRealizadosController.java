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
	
	
}
