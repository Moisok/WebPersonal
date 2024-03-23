package es.proyecto.webpersonal.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.proyecto.webpersonal.dao.HabilidadesDao;
import es.proyecto.webpersonal.entities.Habilidades;
import es.proyecto.webpersonal.service.HabilidadesService;

@Service
@Transactional
public class HabilidadesServiceImpl implements HabilidadesService {
	
	private final HabilidadesDao habilidadesDao; 
	
	@Autowired
	public HabilidadesServiceImpl(HabilidadesDao habilidadesDao) {
		this.habilidadesDao = habilidadesDao;
	}
	
	@Override
	public List<Habilidades> getHabilidades() {
		return habilidadesDao.getHabilidades();
	}

	@Override
	public Habilidades getHabilidad(int id) {
		return habilidadesDao.getHabilidad(id);
	}

	@Override
	public void addHabilidad(Habilidades habilidad) {
		habilidadesDao.addHabilidad(habilidad);
	}

	@Override
	public void updateHabilidad(int id, String nuevoNombre) {
		habilidadesDao.updateHabilidad(id, nuevoNombre);
	}

	@Override
	public void deleteHabilidad(int id) {
		habilidadesDao.deleteHabilidad(id);
	}

	@Override
	public void enabledHabilidad(int id) {
		habilidadesDao.enabledHabilidad(id);
	}

}
