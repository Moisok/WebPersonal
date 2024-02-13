package es.proyecto.webpersonal.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import es.proyecto.webpersonal.dao.TecnologiasDao;
import es.proyecto.webpersonal.entities.Tecnologias;


@Controller
@RequestMapping("/adminzone")
public class AdminZoneController {
	
	@Autowired
	private TecnologiasDao tecnologiasDao;
	
	@RequestMapping
	public String menuAdmin() {
		return "zonaadmin";
	}
	
	@RequestMapping("/tecnologias")
	public String prueba(Model  tecnologias) {
	//public String prueba(Model Tecnologias) {
		//Obtener la lista de tecnologias
		List<Tecnologias> lasTecnologias = tecnologiasDao.getTecnologias();
		//Agregar tecnologias al modelo
		tecnologias.addAttribute("tecnologia", lasTecnologias);
		return "tecnologiasadmin";
	}
	
}
