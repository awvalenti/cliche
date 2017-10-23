package br.com.minhaempresa.meuprojeto.model.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.minhaempresa.meuprojeto.model.entity.MinhaEntidade;

public class MinhaEntidadeRepository {

	@Inject
	private EntityManager em;

	public void salvar(MinhaEntidade me) {
		em.persist(me);
	}

	public MinhaEntidade comId(long id) {
		return em.find(MinhaEntidade.class, id);
	}

	public List<MinhaEntidade> todas() {
		return em.createQuery("FROM " + MinhaEntidade.class.getSimpleName(),
				MinhaEntidade.class).getResultList();
	}

}
