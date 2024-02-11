package es.proyecto.webpersonal.dao;

import java.util.List;

import es.proyecto.webpersonal.entities.Experiencia;

public interface ExperienciaDao {
	
	public List <Experiencia> getExperiencia ();
	
	public void addExperiencia(Experiencia experiencia);
	
	public void updateExperiencia(int id);
	
	public void deleteExperienca(int id);
	
	public void enableExperiencia(int id);
	
}
