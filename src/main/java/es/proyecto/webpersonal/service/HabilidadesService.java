package es.proyecto.webpersonal.service;

import java.util.List;

import es.proyecto.webpersonal.entities.Habilidades.Habilidades;


public interface HabilidadesService {
	
public List<Habilidades> getHabilidades();
	
	public Habilidades getHabilidad(int id);
	
	public void addHabilidad(Habilidades habilidad);
	
	public void updateHabilidad (int id, String nuevoNombre);
	
	public void deleteHabilidad(int id);
	
	public void enabledHabilidad(int id);
	
}
