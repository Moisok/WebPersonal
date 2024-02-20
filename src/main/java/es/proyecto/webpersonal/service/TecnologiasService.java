package es.proyecto.webpersonal.service;

import java.util.List;

import es.proyecto.webpersonal.entities.Tecnologias.Tecnologias;

public interface TecnologiasService {
	
	public List<Tecnologias> getTecnologias();
	
	public Tecnologias getTecnologia(int id);
	 
	public void addTecnologia(Tecnologias tecnologia);
	
	public void updateTecnologias(int id, String nuevoNombre);
	
	public void deleteTecnologias(int id);
	
	public void enabledTecnologias(int id);
	 
	
}
