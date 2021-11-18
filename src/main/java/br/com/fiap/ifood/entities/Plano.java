package br.com.fiap.ifood.entities;

public class Plano {

	private int cdPlano;
	private String nmPlano;
	private float vlComisao;
	private float vlTaxa;
	private float vlMensalidade;
	
	public Plano(int cdPlano, String nmPlano, float vlComisao, float vlTaxa, float vlMensalidade) {
		this.cdPlano = cdPlano;
		this.nmPlano = nmPlano;
		this.vlComisao = vlComisao;
		this.vlTaxa = vlTaxa;
		this.vlMensalidade = vlMensalidade;
	}

	public int getCdPlano() {
		return cdPlano;
	}

	public void setCdPlano(int cdPlano) {
		this.cdPlano = cdPlano;
	}

	public String getNmPlano() {
		return nmPlano;
	}

	public void setNmPlano(String nmPlano) {
		this.nmPlano = nmPlano;
	}

	public float getVlComisao() {
		return vlComisao;
	}

	public void setVlComisao(float vlComisao) {
		this.vlComisao = vlComisao;
	}

	public float getVlTaxa() {
		return vlTaxa;
	}

	public void setVlTaxa(float vlTaxa) {
		this.vlTaxa = vlTaxa;
	}

	public float getVlMensalidade() {
		return vlMensalidade;
	}

	public void setVlMensalidade(float vlMensalidade) {
		this.vlMensalidade = vlMensalidade;
	}

	@Override
	public String toString() {
		return "Plano [cdPlano=" + cdPlano + ", nmPlano=" + nmPlano + ", vlComisao=" + vlComisao
				+ ", vlMensalidade=" + vlMensalidade + ", vlTaxa=" + vlTaxa + "]";
	}



}
