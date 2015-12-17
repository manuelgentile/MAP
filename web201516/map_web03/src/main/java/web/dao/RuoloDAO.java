package web.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import web.model.Ruolo;

@Stateless

public class RuoloDAO {
	@PersistenceContext
	private EntityManager em;

	
	public List<Ruolo> getRuoli() {
		TypedQuery<Ruolo> query = em.createQuery("from Ruolo r", Ruolo.class);
		return query.getResultList();
	}

	public Ruolo getRuoloById(Long id) {

		return em.find(Ruolo.class, id);
	}

}
