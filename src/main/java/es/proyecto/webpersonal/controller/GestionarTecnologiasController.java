package es.proyecto.webpersonal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import es.proyecto.webpersonal.dao.TecnologiasDao;
import es.proyecto.webpersonal.dto.TecnologiasDTO;
import es.proyecto.webpersonal.entities.Tecnologias;
import es.proyecto.webpersonal.service.TecnologiasService;

@Controller
@RequestMapping("/adminzone/gestionartecnologias")
public class GestionarTecnologiasController {
	
	@Autowired
	private TecnologiasService tecnologiasService;
	
	
	@RequestMapping
	public String listarTecnologias(Model  ModelTecnologia) {
	//public String prueba(Model Tecnologias) {
		//Obtener la lista de tecnologias
		List<Tecnologias> lasTecnologias = tecnologiasService.getTecnologias();
		//Agregar tecnologias al modelo
		ModelTecnologia.addAttribute("tecnologias", lasTecnologias);
		return "tecnologiasadmin";
	}
	
	/*@PostMapping
	public String gestionarTecnologia(@ModelAttribute("tecnologiasDTO") TecnologiasDTO tecnologiasDTO, Model ModelTecnologia) {
		List<Tecnologias> lasTecnologias = tecnologiasService.getTecnologias();
		ModelTecnologia.addAttribute("tecnologias", lasTecnologias);
		if (Integer.valueOf(tecnologiasDTO.getId()) != null) {
			Tecnologias tecnologiaVerificada = tecnologiasService.getTecnologia(tecnologiasDTO.getId());
			ModelTecnologia.addAttribute("tecnologia", tecnologiaVerificada);
		}
		if ("modificar".equals(tecnologiasDTO.getAction())) {
			tecnologiasService.updateTecnologias(tecnologiasDTO.getId(), tecnologiasDTO.getTecnologia());
			return "redirect:/cambiosrealizados/tecnologia";
		}else if("agregar".equals(tecnologiasDTO.getAction())) {
			agregar(tecnologiasDTO.getTecnologia());
			return "redirect:/cambiosrealizados/tecnologia";
		}else if("eliminar".equals(tecnologiasDTO.getAction())) {
			tecnologiasService.deleteTecnologias(tecnologiasDTO.getId());
			return "redirect:/cambiosrealizados/tecnologia";
		}else if("desactivar".equals(tecnologiasDTO.getAction())) {
			tecnologiasService.enabledTecnologias(tecnologiasDTO.getId());
			return "redirect:/cambiosrealizados/tecnologia";
		}
		return "tecnologiasadmin";
	}*/

	@PostMapping
	public String gestionarTecnologia(@RequestParam(name = "action", required = false) String action,
            @RequestParam(name = "idTecnologia", required = false) Integer id,
            @RequestParam(name = "nuevoNombre", required = false) String nuevoNombre,
            @RequestParam(name = "nuevoActivo", required = false) String nuevoActivo,
            Model ModelTecnologia) {
		List<Tecnologias> lasTecnologias = tecnologiasService.getTecnologias();
		ModelTecnologia.addAttribute("tecnologias", lasTecnologias);
		if (id != null) {
			Tecnologias tecnologia = tecnologiasService.getTecnologia(id);
			ModelTecnologia.addAttribute("tecnologia", tecnologia);
		}
		if ("modificar".equals(action)) {
			tecnologiasService.updateTecnologias(id, nuevoNombre);
			return "redirect:/cambiosrealizados/tecnologia";
		}else if("agregar".equals(action)) {
			agregar(nuevoNombre);
			return "redirect:/cambiosrealizados/tecnologia";
		}else if("eliminar".equals(action)) {
			tecnologiasService.deleteTecnologias(id);
			return "redirect:/cambiosrealizados/tecnologia";
		}else if("desactivar".equals(action)) {
			tecnologiasService.enabledTecnologias(id);
			return "redirect:/cambiosrealizados/tecnologia";
		}
		return "tecnologiasadmin";
	}
	
	//Metodo para agregar nueva tecnologia
	private void agregar(String nuevoNombre) {
		Tecnologias nuevaTecnologia = new Tecnologias(nuevoNombre, 1);
		tecnologiasService.addTecnologia(nuevaTecnologia);
	}

	
}