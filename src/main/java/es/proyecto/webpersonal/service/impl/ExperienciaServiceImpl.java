package es.proyecto.webpersonal.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.proyecto.webpersonal.entities.Experiencia;
import es.proyecto.webpersonal.service.ExperienciaService;

import es.proyecto.webpersonal.dao.ExperienciaDao;

@Service
@Transactional
public class ExperienciaServiceImpl implements ExperienciaService {

	private final ExperienciaDao experienciaDao;
	
	@Autowired
	public ExperienciaServiceImpl(ExperienciaDao experienciaDao) {
		this.experienciaDao = experienciaDao;
	}
	
	@Override
	public List<Experiencia> getExperiencia() {
		// TODO Auto-generated method stub
		return experienciaDao.getExperiencias();
	}

	@Override
	public Experiencia getExperiencia(int id) {
		// TODO Auto-generated method stub
		return experienciaDao.getExperiencia(id);
	}

	@Override
	public void addExperiencia(Experiencia experiencia) {
		experienciaDao.addExperiencia(experiencia);
	}

	@Override
	public void updateExperiencia(int id, String fecha, String puesto, String localizacion, String descripcion) {
		experienciaDao.updateExperiencia(id, fecha, puesto, localizacion, descripcion);
	}

	@Override
	public void deleteExperienca(int id) {
		experienciaDao.deleteExperienca(id);
	}

	@Override
	public void enableExperiencia(int id) {
		experienciaDao.enableExperiencia(id);
	}

}
