package es.proyecto.webpersonal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import es.proyecto.webpersonal.entities.Home;
import es.proyecto.webpersonal.service.HomeService;

@Controller
public class PrincipalController {
	
	@Autowired
	private HomeService homeService;
	
	@RequestMapping("/")
	public String volverTecnologias(Model modelHome) {
		Home descripcion =  homeService.getDescripcion();
		modelHome.addAttribute("descripcion", descripcion);
		return "index";
	}
}
