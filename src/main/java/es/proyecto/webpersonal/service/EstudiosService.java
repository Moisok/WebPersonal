package es.proyecto.webpersonal.service;

import java.util.List;

import es.proyecto.webpersonal.entities.Estudios;

public interface EstudiosService {
	
	//Listar estudios
	public List <Estudios> getEstudios();
		
	//Listar estudio
	public Estudios getEstudio(int id);
		
	//Agregar estudio
	public void addEstudio (Estudios estudio);
		
	//Modificar por Titulo
	public void updateEstudio (int id, String fecha, String titulo, 
			String centro, String descripcion, String localizacion);
		
	//Eliminar estudio
	public void deleteEstudio (int id);
		
	//activar o desactivar estudio
	public void enabledEstudio (int id);
	
}
