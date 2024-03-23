package es.proyecto.webpersonal.dao.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import es.proyecto.webpersonal.dao.EstudiosDao;
import es.proyecto.webpersonal.entities.Estudios;

@Repository
public class EstudiosRepository implements EstudiosDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Estudios> getEstudios() {
		return entityManager.createQuery("from Estudios", Estudios.class).getResultList();
	}

	@Override
	public Estudios getEstudio(int id) {
		return entityManager.find(Estudios.class, id);
	}

	@Override
	public void addEstudio(Estudios estudio) {
		entityManager.persist(estudio);
		
	}

	@Override
	public void updateEstudio(int id, String fecha, String titulo, String centro, String descripcion,
			String localizacion) {
		Estudios estudio = getEstudio(id);
		estudio.setCentro(centro);
		estudio.setDescripcion(descripcion);
		estudio.setFecha(fecha);
		estudio.setLocalizacion(localizacion);
		estudio.setTitulo(titulo);
	}

	@Override
	public void deleteEstudio(int id) {
		Estudios estudio = getEstudio(id);
		entityManager.remove(estudio);
	}

	@Override
	public void enabledEstudio(int id) {
		Estudios estudio = getEstudio(id);
		estudio.setActivo(estudio.getActivo() == 0 ? 1 : 0);
	}
	
}
