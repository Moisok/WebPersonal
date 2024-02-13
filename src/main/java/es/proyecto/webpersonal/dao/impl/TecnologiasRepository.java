package es.proyecto.webpersonal.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



import org.hibernate.Session;
import org.hibernate.query.Query;

import es.proyecto.webpersonal.dao.TecnologiasDao;
import es.proyecto.webpersonal.entities.Tecnologias;

@Repository
public class TecnologiasRepository implements TecnologiasDao {
	
	@Autowired
	private SessionFactory sesionFactory;  
	
	@Override
	@Transactional
	public List<Tecnologias> getTecnologias() {
		Session mySession = sesionFactory.getCurrentSession();
		Query <Tecnologias> queryTecnologias = mySession.createQuery("from Tecnologias", Tecnologias.class);
		List <Tecnologias> listTecnologias = queryTecnologias.getResultList();
 		return listTecnologias;
	}

	@Override
	public void addTecnologa(Tecnologias tecnologia) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateTecnologias(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteTecnologias(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enabledTecnologias(int id) {
		// TODO Auto-generated method stub

	}

}
