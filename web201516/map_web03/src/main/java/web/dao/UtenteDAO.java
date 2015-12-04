package web.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import web.model.Utente;

@Stateless
public class UtenteDAO {
	@PersistenceContext
	private EntityManager em;

	public void salva(Utente utente) {
		em.persist(utente);
	}

	public Utente check(String username, String password) {

		TypedQuery<Utente> query = em.createQuery("from Utente u where u.username=? and u.password=?", Utente.class);

		query.setParameter(1,username);
		query.setParameter(2,password);
		
			
		Utente utente;
		try {
			utente = query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}

		return utente;
	}

}
