package web.controller;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import web.dao.PersonaDAO;
import web.model.Persona;

@Named("servizio")
@SessionScoped
public class PersonaController implements Serializable {
	private Persona persona = new Persona();
	@Inject PersonaDAO dao;

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

	
}
