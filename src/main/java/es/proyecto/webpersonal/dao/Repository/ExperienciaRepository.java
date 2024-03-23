package es.proyecto.webpersonal.dao.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import es.proyecto.webpersonal.dao.ExperienciaDao;
import es.proyecto.webpersonal.entities.Experiencia;

@Repository
public class ExperienciaRepository implements ExperienciaDao {

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public List<Experiencia> getExperiencias() {
		return entityManager.createQuery("from Experiencia", Experiencia.class).getResultList();
	}

	@Override
	public Experiencia getExperiencia(int id) {
		return entityManager.find(Experiencia.class, id);
	}

	@Override
	public void addExperiencia(Experiencia experiencia) {
		entityManager.persist(experiencia);
	}

	@Override
	public void updateExperiencia(int id, String fecha, String puesto, String localizacion, String descripcion) {
		Experiencia exp = getExperiencia(id);
		exp.setDescripcion(descripcion);
		exp.setFecha(fecha);
		exp.setPuesto(puesto);
		exp.setLocalizacion(localizacion);
	}

	@Override
	public void deleteExperienca(int id) {
		Experiencia exp = getExperiencia(id);
		entityManager.remove(exp);
	}

	@Override
	public void enableExperiencia(int id) {
		Experiencia exp = getExperiencia(id);
		exp.setActivo(exp.getActivo() == 0 ? 1 : 0);
	}
	
}
