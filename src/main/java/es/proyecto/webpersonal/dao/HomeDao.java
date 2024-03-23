package es.proyecto.webpersonal.dao;

import es.proyecto.webpersonal.entities.Home;

public interface HomeDao {
	
	public Home getDescripcion();
	
	public void updateDesripcion(int id, String descripcion);
	
}
