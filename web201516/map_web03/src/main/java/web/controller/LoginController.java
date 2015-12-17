package web.controller;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import web.dao.UtenteDAO;
import web.model.Utente;
import web.view_model.Credenziali;

@Named("loginController")
@SessionScoped
public class LoginController implements Serializable {
	@Inject
	UtenteDAO dao;
	private Utente utenteLoggato;
	@Inject Logger log;
	
	
	public void login(Credenziali credenziali) {
		
		
		log.log(Level.INFO, "ciao");
		Utente utente=dao.check(credenziali.getUsername(), credenziali.getPassword());
		if (utente!=null)
			this.utenteLoggato=utente;
		else {
			
		}
	}
	
	public void logout() {
	
	}
	
	public boolean isLogged()
	{
		return utenteLoggato!=null;
	}
	
	

}
