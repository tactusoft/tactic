package com.tacticlogistics.model.bo;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tacticlogistics.model.dao.CustomHibernateDao;
import com.tacticlogistics.model.entities.Ciudades;
import com.tacticlogistics.model.entities.Departamentos;
import com.tacticlogistics.model.entities.Paises;
import com.tacticlogistics.model.entities.TiposDireccion;
import com.tacticlogistics.model.entities.TiposIdentificacion;
import com.tacticlogistics.model.entities.Zonas;

@Service
public class CatalogoBO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Autowired
	private CustomHibernateDao dao;

	public List<TiposIdentificacion> getListTiposIdentificacionActivo() {
		return dao.find("FROM TiposIdentificacion a WHERE a.activo is true");
	}

	public List<TiposDireccion> getListTiposDireccionActivo() {
		return dao.find("FROM TiposDireccion a WHERE a.activo is true");
	}

	public List<Paises> getListPaisesActivo() {
		return dao.find("FROM Paises a WHERE a.activo is true");
	}

	public List<Departamentos> getListDepartamentosActivoPorPais(Short paisId) {
		return dao.find("FROM Departamentos a WHERE a.activo is true AND a.paises.paisId = " + paisId);
	}

	public List<Ciudades> getListCiudadesActivoPorDepartamentos(Short departamentoId) {
		return dao.find(
				"FROM Ciudades a WHERE a.activo is true AND a.departamentos.id.departamentoId = " + departamentoId);
	}

	public List<Zonas> getListZonasActivo() {
		return dao.find("FROM Zonas a WHERE a.activo is true");
	}

}
