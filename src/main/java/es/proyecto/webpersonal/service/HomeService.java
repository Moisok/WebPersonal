package es.proyecto.webpersonal.service;

import es.proyecto.webpersonal.entities.Home.Home;

public interface HomeService {
	
	public Home getDescripcion();
	
	public void updateDesripcion(int id, String titulo, String descripcion);
	
}
