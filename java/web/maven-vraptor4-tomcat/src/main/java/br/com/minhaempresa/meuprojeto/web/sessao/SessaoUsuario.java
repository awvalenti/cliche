package br.com.minhaempresa.meuprojeto.web.sessao;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;

@SessionScoped
public class SessaoUsuario implements Serializable {

	private static final long serialVersionUID = 1L;

	private boolean logado = false;

	public void fazerLogin() {
		logado = true;
	}

	public void fazerLogout() {
		logado = false;
	}

	public boolean estahLogado() {
		return logado;
	}

}
