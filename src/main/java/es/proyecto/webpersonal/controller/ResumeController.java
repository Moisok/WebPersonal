package es.proyecto.webpersonal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResumeController {
	
	@RequestMapping("/curriculum")
	public String volverTecnologias() {
		return "resume";
	}
}
