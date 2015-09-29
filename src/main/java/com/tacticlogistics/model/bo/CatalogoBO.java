package com.tacticlogistics.model.bo;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tacticlogistics.model.dao.CustomHibernateDao;
import com.tacticlogistics.model.entities.TiposDireccion;
import com.tacticlogistics.model.entities.TiposIdentificacion;

@Service
public class CatalogoBO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Autowired
	private CustomHibernateDao dao;

	public List<TiposIdentificacion> getListTiposIdentificacionActivo() {
		return dao.find("from TiposIdentificacion a WHERE a.activo is true");
	}

	public List<TiposDireccion> getListTiposDireccionActivo() {
		return dao.find("from TiposDireccion a WHERE a.activo is true");
	}

}
