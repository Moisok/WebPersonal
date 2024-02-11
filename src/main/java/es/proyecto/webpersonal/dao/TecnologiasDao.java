package es.proyecto.webpersonal.dao;

import java.util.List;

import es.proyecto.webpersonal.entities.Tecnologias;

public interface TecnologiasDao {
	
	public List<Tecnologias> getTecnologias();
	
	public void addTecnologa(Tecnologias tecnologia);
	
	public void updateTecnologias (int id);
	
	public void deleteTecnologias(int id);
	
	public void enabledTecnologias(int id);
	
}
