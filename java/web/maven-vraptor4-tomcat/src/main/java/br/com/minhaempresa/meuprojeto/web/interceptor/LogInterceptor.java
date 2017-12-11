package br.com.minhaempresa.meuprojeto.web.interceptor;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import br.com.caelum.vraptor.AroundCall;
import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.interceptor.SimpleInterceptorStack;

@Intercepts
public class LogInterceptor {

	@Inject
	private HttpServletRequest request;

	@AroundCall
	public void intercept(SimpleInterceptorStack stack) {
		System.out.println("Interceptando " + request.getRequestURI());

		stack.next();
	}

}
