package es.proyecto.webpersonal.dao.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;


import es.proyecto.webpersonal.dao.HabilidadesDao;
import es.proyecto.webpersonal.entities.Habilidades.Habilidades;


@Repository
public class HabilidadesRepository implements HabilidadesDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Habilidades> getHabilidades() {
		return entityManager.createQuery("from Habilidades", Habilidades.class).getResultList();
	}

	@Override
	public Habilidades getHabilidad(int id) {
		return entityManager.find(Habilidades.class,id);
	}

	@Override
	public void addHabilidad(Habilidades habilidad) {
		entityManager.persist(habilidad);
	}

	@Override
	public void updateHabilidad(int id, String nuevoNombre) {
		Habilidades habilidad = getHabilidad(id);
		habilidad.setHabilidad(nuevoNombre);
	}

	@Override
	public void deleteHabilidad(int id) {
		Habilidades habilidad = getHabilidad(id);
		entityManager.remove(habilidad);
	}

	@Override
	public void enabledHabilidad(int id) {
		Habilidades habilidad = getHabilidad(id);
		habilidad.setActivo(habilidad.getActivo() == 0 ? 1 : 0);
	}
	
}
