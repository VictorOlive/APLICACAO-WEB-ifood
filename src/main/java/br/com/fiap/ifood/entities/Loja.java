package br.com.fiap.ifood.entities;

import java.util.Date;

public class Loja {
	
	private int cdLoja;
	private int cdPlano;
	private int cdEspecialidade;
	private int cdEndereco;
	private String cdCNPJ;
	private String nmRazaoSocial;
	private String nome;
	private String nrCelular;
	private int mediaPedidoPorDia;
	private Date abertura;
	private Date fechamento;
	private String nrTelefone;

	public Loja(int cdLoja, int cdPlano, int cdEspecialidade, int cdEndereco, String cdCNPJ, String nmRazaoSocial,
			String nome, String nrCelular, int mediaPedidoPorDia, Date abertura, Date fechamento,
			String nrTelefone) {
		this.cdLoja = cdLoja;
		this.cdPlano = cdPlano;
		this.cdEspecialidade = cdEspecialidade;
		this.cdEndereco = cdEndereco;
		this.cdCNPJ = cdCNPJ;
		this.nmRazaoSocial = nmRazaoSocial;
		this.nome = nome;
		this.nrCelular = nrCelular;
		this.mediaPedidoPorDia = mediaPedidoPorDia;
		this.abertura = abertura;
		this.fechamento = fechamento;
		this.nrTelefone = nrTelefone;
	}

	@Override
	public String toString() {
		return "Loja [abertura=" + abertura + ", cdCNPJ=" + cdCNPJ + ", cdEndereco=" + cdEndereco
				+ ", cdEspecialidade=" + cdEspecialidade + ", cdLoja=" + cdLoja + ", cdPlano=" + cdPlano
				+ ", fechamento=" + fechamento + ", mediaPedidoPorDia=" + mediaPedidoPorDia
				+ ", nmRazaoSocial=" + nmRazaoSocial + ", nome=" + nome + ", nrCelular=" + nrCelular
				+ ", nrTelefone=" + nrTelefone + "]";
	}

	public int getCdLoja() {
		return cdLoja;
	}

	public void setCdLoja(int cdLoja) {
		this.cdLoja = cdLoja;
	}

	public int getCdPlano() {
		return cdPlano;
	}

	public void setCdPlano(int cdPlano) {
		this.cdPlano = cdPlano;
	}

	public int getCdEspecialidade() {
		return cdEspecialidade;
	}

	public void setCdEspecialidade(int cdEspecialidade) {
		this.cdEspecialidade = cdEspecialidade;
	}

	public int getCdEndereco() {
		return cdEndereco;
	}

	public void setCdEndereco(int cdEndereco) {
		this.cdEndereco = cdEndereco;
	}

	public String getCdCNPJ() {
		return cdCNPJ;
	}

	public void setCdCNPJ(String cdCNPJ) {
		this.cdCNPJ = cdCNPJ;
	}

	public String getNmRazaoSocial() {
		return nmRazaoSocial;
	}

	public void setNmRazaoSocial(String nmRazaoSocial) {
		this.nmRazaoSocial = nmRazaoSocial;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNrCelular() {
		return nrCelular;
	}

	public void setNrCelular(String nrCelular) {
		this.nrCelular = nrCelular;
	}

	public int getMediaPedidoPorDia() {
		return mediaPedidoPorDia;
	}

	public void setMediaPedidoPorDia(int mediaPedidoPorDia) {
		this.mediaPedidoPorDia = mediaPedidoPorDia;
	}

	public Date getAbertura() {
		return abertura;
	}

	public void setAbertura(Date abertura) {
		this.abertura = abertura;
	}

	public Date getFechamento() {
		return fechamento;
	}

	public void setFechamento(Date fechamento) {
		this.fechamento = fechamento;
	}

	public String getNrTelefone() {
		return nrTelefone;
	}

	public void setNrTelefone(String nrTelefone) {
		this.nrTelefone = nrTelefone;
	}

}
