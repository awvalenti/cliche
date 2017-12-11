package br.com.minhaempresa.meuprojeto.web.interceptor;

import javax.inject.Inject;

import br.com.caelum.vraptor.AroundCall;
import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.controller.ControllerInstance;
import br.com.caelum.vraptor.interceptor.SimpleInterceptorStack;
import br.com.minhaempresa.meuprojeto.web.controller.AcessoController;
import br.com.minhaempresa.meuprojeto.web.sessao.SessaoUsuario;

@Intercepts
public class AutorizacaoInterceptor {

	@Inject
	private AcessoController acessoController;

	@Inject
	private SessaoUsuario sessao;

	@Inject
	private Result result;

	@AroundCall
	public void intercept(SimpleInterceptorStack stack,
			ControllerInstance controllerInstance) {
		if (controllerInstance.getController().equals(acessoController) ||
				sessao.estahLogado()) {
			stack.next();
		} else {
			result.redirectTo(AcessoController.class).form();
		}
	}

}
