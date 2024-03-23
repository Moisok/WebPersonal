package es.proyecto.webpersonal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import es.proyecto.webpersonal.entities.Proyectos;
import es.proyecto.webpersonal.service.ProyectosService;

@Controller
@RequestMapping("/adminzone/gestionarproyectos")
public class GestionarProyectosController {
	
	@Autowired
	private ProyectosService proyectosService;
	
	@RequestMapping
	public String listarProyectos(Model ModelProyectos) {
		List<Proyectos> losProyectos = proyectosService.getProyectos();
		ModelProyectos.addAttribute("proyectos", losProyectos);
		return "proyectosadmin";
	}
	
	@PostMapping
	public String gestionarProyectos(
		@RequestParam(name="idProyecto", required = false) Integer id,
		@RequestParam(name="action", required = false) String action,
		@RequestParam(name="nuevaFecha", required = false) String fecha,
		@RequestParam(name="nuevoTitulo", required = false) String titulo,
		@RequestParam(name="nuevaDescripcion", required = false) String descripcion,
		@RequestParam(name="nuevaFoto", required = false) String foto,
		@RequestParam(name="nuevoLink", required = false) String link,
		@RequestParam(name="nuevoActivo", required = false) String activo,
		Model ModelProyectos) {
		List<Proyectos> losProyectos = proyectosService.getProyectos();
		ModelProyectos.addAttribute("proyectos", losProyectos);
		if(id != null) {
			Proyectos proyecto = proyectosService.getProyecto(id);
			ModelProyectos.addAttribute("proyecto", proyecto);
		}
		if("modificar".equals(action)) {
			proyectosService.updateProyecto(id, fecha, titulo, foto, descripcion, link);
			return "redirect:/cambiosrealizados/proyecto";
		}else if("agregar".equals(action)) {
			Proyectos nuevoProyecto = new Proyectos(fecha, titulo, descripcion, foto, link, 1);
			proyectosService.addProyecto(nuevoProyecto);
			return "redirect:/cambiosrealizados/proyecto";
		}else if("eliminar".equals(action)) {
			proyectosService.deleteProyecto(id);
			return "redirect:/cambiosrealizados/proyecto";
		}else if("desactivar".equals(action)) {
			proyectosService.enabledProyecto(id);
			return "redirect:/cambiosrealizados/proyecto";
		}
		return "proyectosadmin";
	}
}
