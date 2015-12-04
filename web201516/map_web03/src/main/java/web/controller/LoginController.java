package web.controller;

import java.io.Serializable;

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
	
	
	public void login(Credenziali credenziali) {
		
		
		
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
