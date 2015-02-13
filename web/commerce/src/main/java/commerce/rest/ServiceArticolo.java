package commerce.rest;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import commerce.model.Articolo;

@Stateless
@Path("articolo")
public class ServiceArticolo {
	@PersistenceContext(unitName = "pu01")
	EntityManager em;

	@GET
	@Path("get/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Articolo get(@PathParam("id") int id) {
		Articolo u = em.find(Articolo.class, id);
		return u;
	}
	
	@GET
	@Path("getall")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Articolo> get() {
		return em.createQuery("from Articolo a").getResultList();
		
	}

	@POST
	@Path("add")
	@Consumes(MediaType.APPLICATION_JSON)
	public void crea(Articolo utente) {

		em.persist(utente);
	}
	/*
	 * public Utente get(int id) { Utente u=em.find(Utente.class, id); return u;
	 * }
	 */

}
