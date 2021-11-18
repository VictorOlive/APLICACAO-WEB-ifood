package br.com.fiap.ifood.adapter;

import java.io.Serializable;

public class PlanoAdapter implements Serializable {

	public static final long serialVersionUID = 1L;
	
	private String cdPlano;
	private String nmPlano;
	private String vlComisao;
	private String vlTaxa;
	private String vlMensalidade;

	public PlanoAdapter(String cdPlano, String nmPlano, String vlComisao, String vlTaxa, String vlMensalidade) {
		this.cdPlano = cdPlano;
		this.nmPlano = nmPlano;
		this.vlComisao = vlComisao;
		this.vlTaxa = vlTaxa;
		this.vlMensalidade = vlMensalidade;
	}

	public String getCdPlano() {
		return cdPlano;
	}

	public void setCdPlano(String cdPlano) {
		this.cdPlano = cdPlano;
	}

	public String getNmPlano() {
		return nmPlano;
	}

	public void setNmPlano(String nmPlano) {
		this.nmPlano = nmPlano;
	}

	public String getVlComisao() {
		return vlComisao;
	}

	public void setVlComisao(String vlComisao) {
		this.vlComisao = vlComisao;
	}

	public String getVlTaxa() {
		return vlTaxa;
	}

	public void setVlTaxa(String vlTaxa) {
		this.vlTaxa = vlTaxa;
	}

	public String getVlMensalidade() {
		return vlMensalidade;
	}

	public void setVlMensalidade(String vlMensalidade) {
		this.vlMensalidade = vlMensalidade;
	}

	@Override
	public String toString() {
		return "PlanoAdapter [cdPlano=" + cdPlano + ", nmPlano=" + nmPlano + ", vlComisao=" + vlComisao
				+ ", vlMensalidade=" + vlMensalidade + ", vlTaxa=" + vlTaxa + "]";
	}
}
