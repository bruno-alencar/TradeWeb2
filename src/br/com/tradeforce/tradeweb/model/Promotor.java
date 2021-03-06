package br.com.tradeforce.tradeweb.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Promotor extends Usuario{
	
	private int idade;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Empresa empresa;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "localizacao_id")
	
	private Localizacao localizacao;

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Localizacao getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(Localizacao localizacao) {
		this.localizacao = localizacao;
	}

	
}
