package br.com.minhaempresa.meuprojeto.web.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.minhaempresa.meuprojeto.web.sessao.SessaoUsuario;

@Controller
public class AcessoController {

	@Inject private Result result;
	@Inject private SessaoUsuario sessao;

	public void form() {
	}

	@Post
	public void login(String usuario, String senha) {
		if ("aluno".equals(usuario) && "123456".equals(senha)) {
			sessao.fazerLogin();
		}

		if (sessao.estahLogado()) {
			result.redirectTo(MinhaEntidadeController.class).listar();
		} else {
			result.include("mensagem", "Login falhou");
			result.redirectTo(this).form();
		}
	}

	@Post
	public void logout() {
		sessao.fazerLogout();
		result.redirectTo(MinhaEntidadeController.class).ola();
	}

}
