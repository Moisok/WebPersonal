package es.proyecto.webpersonal.dao;

import java.util.List;

import es.proyecto.webpersonal.entities.Estudios;

//Todos los dao deben tener 5 metodos (excepto "Home")
//1: Listar 
//2: Agregar 
//3: Modificar
//4: Eliminar
//5: Desactivar

public interface EstudiosDao {
	
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
