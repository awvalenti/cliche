package br.com.minhaempresa.meuprojeto.web.repository;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;
import br.com.minhaempresa.meuprojeto.web.model.MinhaEntidade;

@Component
public class MinhaEntidadeRepository {

	private final EntityManager em;

	public MinhaEntidadeRepository(EntityManager em) {
		this.em = em;
	}

	public void salvar(MinhaEntidade me) {
		em.persist(me);
	}

	public MinhaEntidade comId(long id) {
		return em.find(MinhaEntidade.class, id);
	}

	public List<MinhaEntidade> todas() {
		return em.createQuery("FROM " + MinhaEntidade.class.getSimpleName(), MinhaEntidade.class)
				.getResultList();
	}

}
