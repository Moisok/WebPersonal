package es.proyecto.webpersonal.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.proyecto.webpersonal.dao.TecnologiasDao;
import es.proyecto.webpersonal.entities.Tecnologias.Tecnologias;
import es.proyecto.webpersonal.service.TecnologiasService;

@Service
@Transactional
public class TecnologiasServiceImpl implements TecnologiasService {

	private final TecnologiasDao tecnologiasDao;

    @Autowired
    public TecnologiasServiceImpl(TecnologiasDao tecnologiasDao) {
        this.tecnologiasDao = tecnologiasDao;
    }
    
    @Override
    public List<Tecnologias> getTecnologias() {
        return tecnologiasDao.getTecnologias();
    }
    
    @Override
    public Tecnologias getTecnologia(int id) {
        return tecnologiasDao.getTecnologia(id);
    }
    
    @Override
    public void addTecnologia(Tecnologias tecnologia) {
        tecnologiasDao.addTecnologia(tecnologia);
    }
    
    @Override
    public void updateTecnologias(int id, String nuevoNombre) {
        tecnologiasDao.updateTecnologias(id, nuevoNombre);
    }
    
    @Override
    public void deleteTecnologias(int id) {
        tecnologiasDao.deleteTecnologias(id);
    }
    
    @Override
    public void enabledTecnologias(int id) {
        tecnologiasDao.enabledTecnologias(id);
    }
}