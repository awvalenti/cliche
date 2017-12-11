package br.com.minhaempresa.meuprojeto.web.component;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@RequestScoped
public class EntityManagerComponentFactory {

	@Inject
	private EntityManagerFactory emf;

	@Produces
	public EntityManager obter() {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		return em;
	}

	public void fechar(@Disposes EntityManager em) {
		try {
			if (em.getTransaction().isActive()) {
				em.getTransaction().commit();
			}
		} finally {
			em.close();
		}
	}

}
