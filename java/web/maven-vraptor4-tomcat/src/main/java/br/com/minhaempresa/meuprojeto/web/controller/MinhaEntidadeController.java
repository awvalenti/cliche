package br.com.minhaempresa.meuprojeto.web.controller;

import static java.util.Arrays.*;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Result;
import br.com.minhaempresa.meuprojeto.model.entity.MinhaEntidade;
import br.com.minhaempresa.meuprojeto.model.repository.MinhaEntidadeRepository;

@Controller
public class MinhaEntidadeController {

	@Inject
	private Result result;

	@Inject
	private MinhaEntidadeRepository repo;

	public void ola() {
		result.include("mensagens", asList("Ola", "mundo!"));
	}

	public void salvar() {
		repo.salvar(new MinhaEntidade(10, "Dez"));
	}

	public void listar() {
		result.include("entidades", repo.todas());
	}

}
