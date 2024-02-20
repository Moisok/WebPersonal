package es.proyecto.webpersonal.dao.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import es.proyecto.webpersonal.dao.TecnologiasDao;
import es.proyecto.webpersonal.entities.Tecnologias.Tecnologias;

@Repository
public class TecnologiasRepository implements TecnologiasDao {
	
	@PersistenceContext
    private EntityManager entityManager;
	
	@Override
	public List<Tecnologias> getTecnologias() {
		return entityManager.createQuery("FROM Tecnologias", Tecnologias.class).getResultList();
	}
	
	@Override
	public Tecnologias getTecnologia(int id) {
		return entityManager.find(Tecnologias.class, id);
	}

	@Override
	public void addTecnologia(Tecnologias tecnologia) {
		entityManager.persist(tecnologia);
	}

	@Override
	public void updateTecnologias(int id, String nuevonombre) {
		Tecnologias tecnologia = getTecnologia(id);
		tecnologia.setTecnologia(nuevonombre);

	}

	@Override
	public void deleteTecnologias(int id) {
		Tecnologias tecnologia = getTecnologia(id);
		entityManager.remove(tecnologia);
	}

	@Override
	public void enabledTecnologias(int id) {
		Tecnologias tecnologia = getTecnologia(id);
		tecnologia.setActivo(tecnologia.getActivo() == 0 ? 1 : 0);
	}

}
