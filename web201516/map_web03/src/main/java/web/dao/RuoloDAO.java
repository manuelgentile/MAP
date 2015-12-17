package web.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import web.model.ListaRuoli;
import web.model.Ruolo;

@Stateless

@Path("ruolo")
public class RuoloDAO {
	@PersistenceContext
	private EntityManager em;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Ruolo> getRuoli() {
		TypedQuery<Ruolo> query = em.createQuery("from Ruolo r", Ruolo.class);
		return query.getResultList();
	}

	@GET()
	@Path("xml")
	@Produces(MediaType.APPLICATION_XML)
	public ListaRuoli getRuoli2() {
		ListaRuoli l = new ListaRuoli();
		l.setRuoli(this.getRuoli());
		return l;
	}

	/*
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Ruolo getRuoloById(@PathParam("id") Long id) {
		return em.find(Ruolo.class, id);
	}*/
	
	@GET
	@Path("byid")
	@Produces(MediaType.APPLICATION_JSON)
	public Ruolo getRuoloById(@QueryParam("id") Long id) {
		return em.find(Ruolo.class, id);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void save(Ruolo ruolo)
	{
		em.persist(ruolo);
		//System.out.println(ruolo);
	}

}
