package es.proyecto.webpersonal.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import es.proyecto.webpersonal.dao.HabilidadesDao;
import es.proyecto.webpersonal.entities.Habilidades;

@Repository
public class HabilidadesRepository implements HabilidadesDao {

	@Override
	public List<Habilidades> getHabilidades() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addHabilidad(Habilidades habilidad) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateHabilidad(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteHabilidad(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enabledHabilidad(int id) {
		// TODO Auto-generated method stub

	}

}
