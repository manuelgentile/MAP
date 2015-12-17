package web.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;
import javax.inject.Named;

import web.dao.RuoloDAO;
import web.model.Ruolo;


@Named
public class RuoloConverter implements Converter {
	@Inject
	RuoloDAO dao;

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		Long id = Long.parseLong(value);
		Ruolo r = dao.getRuoloById(id);
		return r;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if (value==null)
			return "";
		System.out.println("Classe "+value.getClass().getName());
		if (value instanceof Ruolo) {
			Ruolo r = (Ruolo) value;
			return "" + r.getId();
		}
		return null;
	}

}
