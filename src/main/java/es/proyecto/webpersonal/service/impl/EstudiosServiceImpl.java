package es.proyecto.webpersonal.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.proyecto.webpersonal.dao.EstudiosDao;
import es.proyecto.webpersonal.entities.Estudios;
import es.proyecto.webpersonal.service.EstudiosService;

@Service
@Transactional
public class EstudiosServiceImpl implements EstudiosService {
	
	private final EstudiosDao estudiosDao;
	
	@Autowired
	public EstudiosServiceImpl(EstudiosDao estudiosDao) {
		this.estudiosDao = estudiosDao;
	}
	
	@Override
	public List<Estudios> getEstudios() {
		// TODO Auto-generated method stub
		return estudiosDao.getEstudios();
	}

	@Override
	public Estudios getEstudio(int id) {
		// TODO Auto-generated method stub
		return estudiosDao.getEstudio(id);
	}

	@Override
	public void addEstudio(Estudios estudio) {
		estudiosDao.addEstudio(estudio);
	}

	@Override
	public void updateEstudio(int id, String fecha, String titulo, String centro, String descripcion,
			String localizacion) {
		estudiosDao.updateEstudio(id, fecha, titulo, centro, descripcion, localizacion);
	}

	@Override
	public void deleteEstudio(int id) {
		estudiosDao.deleteEstudio(id);
	}

	@Override
	public void enabledEstudio(int id) {
		estudiosDao.enabledEstudio(id);
	}

}
