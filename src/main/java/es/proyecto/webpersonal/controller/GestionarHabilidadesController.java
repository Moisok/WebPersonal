package es.proyecto.webpersonal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import es.proyecto.webpersonal.entities.Habilidades.Habilidades;
import es.proyecto.webpersonal.service.HabilidadesService;



@Controller
@RequestMapping("/adminzone/gestionarhabilidades")
public class GestionarHabilidadesController {
	
	@Autowired
	private HabilidadesService habilidadesService;
	
	
	@RequestMapping
	public String listarHabilidades(Model  ModelHabilidades) {
	//public String prueba(Model Tecnologias) {
		//Obtener la lista de tecnologias
		List<Habilidades> lasHabilidades = habilidadesService.getHabilidades();
		//Agregar tecnologias al modelo
		ModelHabilidades.addAttribute("habilidades", lasHabilidades);
		return "habilidadesadmin";
	}
	

	@PostMapping
	public String gestionarTcnologia(@RequestParam(name = "action", required = false) String action,
            @RequestParam(name = "idHabilidad", required = false) Integer id,
            @RequestParam(name = "nuevoNombre", required = false) String nuevoNombre,
            @RequestParam(name = "nuevoActivo", required = false) String nuevoActivo,
            Model ModelHabilidad) {
		List<Habilidades> lasHabilidades = habilidadesService.getHabilidades();
		ModelHabilidad.addAttribute("habilidades", lasHabilidades);
		if (id != null) {
			Habilidades habilidad = habilidadesService.getHabilidad(id);
			ModelHabilidad.addAttribute("habilidad", habilidad);
		}
		if ("modificar".equals(action)) {
			habilidadesService.updateHabilidad(id, nuevoNombre);
			return "redirect:/cambiosrealizados/habilidad";
		}else if("agregar".equals(action)) {
			agregar(nuevoNombre);
			return "redirect:/cambiosrealizados/habilidad";
		}else if("eliminar".equals(action)) {
			habilidadesService.deleteHabilidad(id);
			return "redirect:/cambiosrealizados/habilidad";
		}else if("desactivar".equals(action)) {
			habilidadesService.enabledHabilidad(id);
			return "redirect:/cambiosrealizados/habilidad";
		}
		return "habilidadesadmin";
	}
	
	private void agregar(String nuevoNombre) {
		Habilidades nuevaHabilidad = new Habilidades(nuevoNombre, 1);
		habilidadesService.addHabilidad(nuevaHabilidad);
	}

	
}
