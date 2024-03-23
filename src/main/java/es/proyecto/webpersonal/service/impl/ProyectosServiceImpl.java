package es.proyecto.webpersonal.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.proyecto.webpersonal.dao.ProyectosDao;
import es.proyecto.webpersonal.entities.Proyectos;
import es.proyecto.webpersonal.service.ProyectosService;

@Service
@Transactional
public class ProyectosServiceImpl implements ProyectosService {

	private final ProyectosDao proyectosDao;
	
	@Autowired
	public ProyectosServiceImpl (ProyectosDao proyectosDao) {
		this.proyectosDao = proyectosDao;
	}
	
	@Override
	public List<Proyectos> getProyectos() {
		return proyectosDao.getProyectos();
	}

	@Override
	public Proyectos getProyecto(int id) {
		return proyectosDao.getProyecto(id);
	}

	@Override
	public void addProyecto(Proyectos proyecto) {
		 proyectosDao.addProyecto(proyecto);
	}

	@Override
	public void updateProyecto(int id, String fecha, String titulo, String foto, String descripcion, String link) {
		proyectosDao.updateProyecto(id, fecha, titulo, foto, descripcion, link);
	}

	@Override
	public void deleteProyecto(int id) {
		proyectosDao.deleteProyecto(id);
	}

	@Override
	public void enabledProyecto(int id) {
		proyectosDao.enabledProyecto(id);
	}

}
