package es.proyecto.webpersonal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import es.proyecto.webpersonal.entities.Estudios;
import es.proyecto.webpersonal.entities.Experiencia;
import es.proyecto.webpersonal.entities.Habilidades;
import es.proyecto.webpersonal.entities.Tecnologias;
import es.proyecto.webpersonal.service.EstudiosService;
import es.proyecto.webpersonal.service.ExperienciaService;
import es.proyecto.webpersonal.service.HabilidadesService;
import es.proyecto.webpersonal.service.TecnologiasService;

@Controller
public class ResumeController {
	
	@Autowired
	private ExperienciaService experienciaService; 
	
	@Autowired
	private EstudiosService estudiosService; 
	
	@Autowired
	private TecnologiasService tecnologiasService; 
	
	@Autowired
	private HabilidadesService habilidadesService; 
	
	
	@RequestMapping("/curriculum")
	public String volverTecnologias(Model experiencias, Model estudios, Model tecnologias, Model habilidades) 
	{
		List<Experiencia> experienciasLista = experienciaService.getExperiencia();
		experiencias.addAttribute("experiencia", experienciasLista);

		List<Estudios> estudiosLista = estudiosService.getEstudios();
		estudios.addAttribute("estudio", estudiosLista);
		
		List<Habilidades> habilidadesLista = habilidadesService.getHabilidades();
		tecnologias.addAttribute("habilidad", habilidadesLista);
		
		List<Tecnologias> tecnologiasLista = tecnologiasService.getTecnologias();
		habilidades.addAttribute("tecnologia", tecnologiasLista);
		
		return "resume";
	}
}
