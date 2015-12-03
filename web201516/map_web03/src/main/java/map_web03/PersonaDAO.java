package map_web03;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import map_web03.model.Persona;

@Stateless
public class PersonaDAO {
	@PersistenceContext
	private EntityManager em;

	public void salva(Persona persona) {
		em.persist(persona);

	}
}
