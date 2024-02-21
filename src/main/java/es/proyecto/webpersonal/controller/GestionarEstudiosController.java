package es.proyecto.webpersonal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import es.proyecto.webpersonal.entities.Estudios.Estudios;
import es.proyecto.webpersonal.service.EstudiosService;

@Controller
@RequestMapping("/adminzone/gestionarestudios")
public class GestionarEstudiosController {
	
	@Autowired
	private EstudiosService estudiosService;
	
	@RequestMapping
	public String listarEstudios(Model ModelEstudios) {
		List<Estudios> losEstudos = estudiosService.getEstudios();
		ModelEstudios.addAttribute("estudios", losEstudos);
		return "estudiosadmin";
	}
	
	@PostMapping
	public String gestionarEstudios(
		@RequestParam(name="action", required = false) String action,
		@RequestParam(name="idEstudio", required = false) Integer id,
		@RequestParam(name="nuevaFecha", required = false) String fecha,
		@RequestParam(name="nuevoTitulo", required = false) String titulo,
		@RequestParam(name="nuevoCentro", required = false) String centro,
		@RequestParam(name="nuevaDescripcion", required = false) String descripcion,
		@RequestParam(name="nuevoActivo", required = false) String activo,
		@RequestParam(name="nuevaLocalizacion", required = false) String localizacion,
		Model ModelEstudios) {
		List<Estudios> losEstudios = estudiosService.getEstudios();
		ModelEstudios.addAttribute("estudios", losEstudios);
		System.out.println("Esto es: " + action);
		if(id != null) {
			Estudios estudio = estudiosService.getEstudio(id);
			ModelEstudios.addAttribute("estudio", estudio);
		}
		if("modificar".equals(action)) {
			estudiosService.updateEstudio(id, fecha, titulo, centro, descripcion, localizacion);
			return "redirect:/cambiosrealizados/estudio";
		}else if("agregar".equals(action)) {
			Estudios estudio = new Estudios(fecha, titulo, localizacion, descripcion, centro, 1);
			estudiosService.addEstudio(estudio);
			return "redirect:/cambiosrealizados/estudio";
		}else if("eliminar".equals(action)) {
			estudiosService.deleteEstudio(id);
			return "redirect:/cambiosrealizados/estudio";
		}else if("desactivar".equals(action)) {
			estudiosService.enabledEstudio(id);
			return "redirect:/cambiosrealizados/estudio";
		}
		return "estudiosadmin";
	}
}
