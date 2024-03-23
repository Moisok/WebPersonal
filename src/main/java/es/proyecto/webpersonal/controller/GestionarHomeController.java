package es.proyecto.webpersonal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import es.proyecto.webpersonal.entities.Home;
import es.proyecto.webpersonal.service.HomeService;

@Controller
@RequestMapping("/adminzone/gestionarhome")
public class GestionarHomeController {
	
	@Autowired
	private HomeService homeService;
	
	@RequestMapping
	public String mostrarDescripcion(Model ModelHome) {
		Home descripcion = homeService.getDescripcion();
		ModelHome.addAttribute("descripcion", descripcion);
		return "homeadmin";
	}
	
	@PostMapping
	public String gestionarDescripcion
	(@RequestParam(name="action",  required = false) String action,
	 @RequestParam(name="nuevaDescripcion",  required = false) String nuevaDescripcion,
	 Model ModelHome){
		Home descripcion = homeService.getDescripcion();
		ModelHome.addAttribute("descripcion", descripcion);
		homeService.updateDesripcion(1, nuevaDescripcion);
		return "redirect:/cambiosrealizados/home";
	}
	
}
