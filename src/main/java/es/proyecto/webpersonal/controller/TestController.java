package es.proyecto.webpersonal.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TestController {
	
	//@Autowired
	//private TecnologiasDao tecnologiasDao;
	
	@RequestMapping(value = "/")
	public String prueba( ) {
	//public String prueba(Model Tecnologias) {
		//Obtener la lista de tecnologias
		//List <Tecnologias> lasTecnologias = tecnologiasDao.getTecnologias();
		//Agregar tecnologias al modelo
		//Tecnologias.addAttribute("tecnologia", lasTecnologias);
		return "pruebitanomas";
	}
	
}
