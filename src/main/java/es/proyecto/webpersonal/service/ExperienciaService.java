package es.proyecto.webpersonal.service;

import java.util.List;

import es.proyecto.webpersonal.entities.Experiencia;

public interface ExperienciaService {
	
public List <Experiencia> getExperiencia ();
	
	public Experiencia getExperiencia(int id); 
	
	public void addExperiencia(Experiencia experiencia);
	
	public void updateExperiencia(int id, String fecha, String puesto, String localizacion
			, String descripcion);
	
	public void deleteExperienca(int id);
	
	public void enableExperiencia(int id);
	
}
