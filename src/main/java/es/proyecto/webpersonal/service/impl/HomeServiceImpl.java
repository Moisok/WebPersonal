package es.proyecto.webpersonal.service.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import es.proyecto.webpersonal.dao.HomeDao;
import es.proyecto.webpersonal.entities.Home;
import es.proyecto.webpersonal.service.HomeService;

@Service
@Transactional
public class HomeServiceImpl implements HomeService {
	
	private final HomeDao homeDao;
	
	public HomeServiceImpl(HomeDao homeDao) {
		this.homeDao = homeDao;
	}
	
	@Override
	public Home getDescripcion() {
		return homeDao.getDescripcion();
	}

	@Override
	public void updateDesripcion(int id,  String descripcion) {
		homeDao.updateDesripcion(id, descripcion);
	}

}
