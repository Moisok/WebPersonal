package es.proyecto.webpersonal.dao;

import java.util.List;


import es.proyecto.webpersonal.entities.Tecnologias;

public interface TecnologiasDao  {
	
	public List<Tecnologias> getTecnologias();
	
	public Tecnologias getTecnologia(int id);
	
	public void addTecnologia(Tecnologias tecnologia);
	
	void updateTecnologias(int id, String nuevonombre);
	
	public void deleteTecnologias(int id);
	
	public void enabledTecnologias(int id);
	
	/* List<Tecnologias> findAll();
	
	 Optional<Tecnologias> findById(Integer id);
	
	 Tecnologias save(Tecnologias tecnologia);

	void deleteById(Integer id);
	
	@Modifying
   @Query("UPDATE Tecnologias t SET t.activo = CASE WHEN t.activo = 1 THEN 0 ELSE 1 END WHERE t.id = :id")
   void toggleActivo(@Param("id") Integer id);*/
	
	
}
