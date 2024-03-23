package es.proyecto.webpersonal.dao;

import java.util.List;

import es.proyecto.webpersonal.entities.Proyectos;

public interface ProyectosDao {
	
	public List<Proyectos> getProyectos();
	
	public Proyectos getProyecto(int id);
	
	public void addProyecto(Proyectos proyecto);
	
	public void updateProyecto(int id, String fecha, String titulo,
			String foto, String descripcion, String link);
	
	public void deleteProyecto(int id);
	
	public void enabledProyecto(int id);
	
}
