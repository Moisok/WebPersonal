package es.proyecto.webpersonal.dao.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import es.proyecto.webpersonal.dao.HomeDao;
import es.proyecto.webpersonal.entities.Home.Home;

@Repository
public class HomeRepository implements HomeDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Home getDescripcion() {
		return entityManager.find(Home.class, 1);
	}

	@Override
	public void updateDesripcion(int id, String descripcion) {
		Home home = entityManager.find(Home.class, 1);
		home.setDescripcion(descripcion);
	}


}
