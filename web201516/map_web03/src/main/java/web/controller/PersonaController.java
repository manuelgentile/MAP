package web.controller;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import web.dao.PersonaDAO;
import web.dao.RuoloDAO;
import web.model.Persona;
import web.model.Ruolo;

@Named("servizio")
@SessionScoped
public class PersonaController implements Serializable {
	private Persona persona = new Persona();
	@Inject PersonaDAO dao;
	@Inject RuoloDAO ruoloDao;

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	public void salva()
	{
		dao.salva(persona);
	}
	
	public List<Ruolo> getRuoli()
	{
		return ruoloDao.getRuoli();
	}

	
}
