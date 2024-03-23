package es.proyecto.webpersonal.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import es.proyecto.webpersonal.dao.TecnologiasDao;



@Controller
@RequestMapping("/adminzone")
public class AdminZoneController {
	
	@RequestMapping
	public String menuAdmin() {
		return "zonaadmin";
	}
	
}
