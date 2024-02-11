package es.proyecto.webpersonal.dao;

import java.util.List;

import es.proyecto.webpersonal.entities.Proyectos;

public interface ProyectosDao {
	
	public List<Proyectos> getProyectos();
	
	public void addProyecto(Proyectos proyecto);
	
	public void updateProyecto(int id);
	
	public void deleteProyecto(int id);
	
	public void enabledProyecto(int id);
	
}
