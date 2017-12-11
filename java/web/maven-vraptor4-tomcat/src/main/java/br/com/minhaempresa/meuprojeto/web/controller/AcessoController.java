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
		System.out.printf("%s, %s\n", usuario, senha);
		if ("aluno".equals(usuario) && "123456".equals(senha)) {
			System.out.println(20);
			sessao.fazerLogin();
		}

		System.out.println(30);
		if (sessao.estahLogado()) {
			System.out.println(40);
			result.redirectTo(MinhaEntidadeController.class).listar();
		} else {
			System.out.println(50);
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
