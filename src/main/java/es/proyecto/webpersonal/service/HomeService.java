package es.proyecto.webpersonal.service;

import es.proyecto.webpersonal.entities.Home;

public interface HomeService {
	
	public Home getDescripcion();
	
	public void updateDesripcion(int id, String descripcion);
	
}
