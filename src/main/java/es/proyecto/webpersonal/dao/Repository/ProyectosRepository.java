package es.proyecto.webpersonal.dao.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import es.proyecto.webpersonal.dao.ProyectosDao;
import es.proyecto.webpersonal.entities.Proyectos.Proyectos;

@Repository
public class ProyectosRepository implements ProyectosDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Proyectos> getProyectos() {
		return entityManager.createQuery("from Proyectos", Proyectos.class).getResultList();
	}

	@Override
	public Proyectos getProyecto(int id) {
		// TODO Auto-generated method stub
		return entityManager.find(Proyectos.class, id);
	}

	@Override
	public void addProyecto(Proyectos proyecto) {
		entityManager.persist(proyecto);
	}

	@Override
	public void updateProyecto(int id, String fecha, String titulo, String foto, String descripcion, String link) {
		Proyectos proyecto  = getProyecto(id);
		proyecto.setFecha(fecha);
		proyecto.setTitulo(titulo);
		proyecto.setFoto(foto);
		proyecto.setDescripcion(descripcion);
		proyecto.setLink(link);
	}

	@Override
	public void deleteProyecto(int id) {
		Proyectos proyecto = getProyecto(id);
		entityManager.remove(proyecto);
	}

	@Override
	public void enabledProyecto(int id) {
		Proyectos proyecto = getProyecto(id);
		proyecto.setActivo(proyecto.getActivo() == 0 ? 1 : 0);
	}

}
