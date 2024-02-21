package es.proyecto.webpersonal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import es.proyecto.webpersonal.entities.Experiencia.Experiencia;
import es.proyecto.webpersonal.service.ExperienciaService;

@Controller
@RequestMapping("/adminzone/gestionarexperiencia")
public class GestionarExperienciaController {
	
	@Autowired
	private ExperienciaService experienciaService;
	
	@RequestMapping
	public String listarExperiencias(Model ModelExperiencias) {
		List<Experiencia> lasExperiencias =  experienciaService.getExperiencia();
		ModelExperiencias.addAttribute("expericias", lasExperiencias);
		return "experienciasadmin";
	}
	
	@PostMapping 
	public String gestionarExperiencia(
			@RequestParam(name = "action", required = false) String action,
			@RequestParam(name = "idExperiencia", required = false) Integer id,
			@RequestParam(name = "nuevoPuesto", required = false) String puesto,
			@RequestParam(name = "nuevaLocalizacion", required = false) String localizacion,
			@RequestParam(name = "nuevaDescripcion", required = false) String descripcion,
			@RequestParam(name = "nuevoActivo", required = false) String activo,
			@RequestParam(name = "nuevaFecha", required = false) String fecha,
			Model ModelExperiencias) {
				List<Experiencia> lasExperiencias =  experienciaService.getExperiencia();
				ModelExperiencias.addAttribute("expericias", lasExperiencias);
				if(id != null){
					Experiencia experiencia = experienciaService.getExperiencia(id);
					ModelExperiencias.addAttribute("experiencia", experiencia);
				}
				if("modificar".equals(action)){
					experienciaService.updateExperiencia(id, fecha, puesto, localizacion, descripcion);
					return "redirect:/cambiosrealizados/experiencia";
				}else if("agregar".equals(action)){
					Experiencia experiencia = new Experiencia(fecha, puesto, localizacion, descripcion, 1);
					experienciaService.addExperiencia(experiencia);
					return "redirect:/cambiosrealizados/experiencia";
				}else if("eliminar".equals(action)){
					experienciaService.deleteExperienca(id);
					return "redirect:/cambiosrealizados/experiencia";
				}else if("desactivar".equals(action)){
					experienciaService.enableExperiencia(id);
					return "redirect:/cambiosrealizados/experiencia";
				}
				return "experienciasadmin";
		}
	}
	
