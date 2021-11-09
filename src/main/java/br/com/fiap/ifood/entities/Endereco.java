package br.com.fiap.ifood.entities;

public class Endereco {
	private int cdEndereco;
	private String cdCep;
	private String dsUF;
	private String nmCidade;
	private String nmBairro;
	private String nmEndereco;
	private String lvNumero;
	private String dsComplemento;
	
	public Endereco(int cdEndereco, String cdCep, String dsUF, String nmCidade, String nmBairro, String nmEndereco,
			String lvNumero, String dsComplemento) {
		this.setCdEndereco(cdEndereco);
		this.cdCep = cdCep;
		this.dsUF = dsUF;
		this.nmCidade = nmCidade;
		this.nmBairro = nmBairro;
		this.nmEndereco = nmEndereco;
		this.lvNumero = lvNumero;
		this.dsComplemento = dsComplemento;
	}

	public int getCdEndereco() {
		return cdEndereco;
	}

	public void setCdEndereco(int cdEndereco) {
		this.cdEndereco = cdEndereco;
	}

	public String getCdCep() {
		return cdCep;
	}

	public void setCdCep(String cdCep) {
		this.cdCep = cdCep;
	}

	public String getDsUF() {
		return dsUF;
	}

	public void setDsUF(String dsUF) {
		this.dsUF = dsUF;
	}

	public String getNmCidade() {
		return nmCidade;
	}

	public void setNmCidade(String nmCidade) {
		this.nmCidade = nmCidade;
	}

	public String getNmBairro() {
		return nmBairro;
	}

	public void setNmBairro(String nmBairro) {
		this.nmBairro = nmBairro;
	}

	public String getNmEndereco() {
		return nmEndereco;
	}

	public void setNmEndereco(String nmEndereco) {
		this.nmEndereco = nmEndereco;
	}

	public String getLvNumero() {
		return lvNumero;
	}

	public void setLvNumero(String lvNumero) {
		this.lvNumero = lvNumero;
	}

	public String getDsComplemento() {
		return dsComplemento;
	}

	public void setDsComplemento(String dsComplemento) {
		this.dsComplemento = dsComplemento;
	}

	@Override
	public String toString() {
		return "Endereco [cdCep=" + cdCep + ", cdEndereco=" + cdEndereco + ", dsComplemento=" + dsComplemento
				+ ", dsUF=" + dsUF + ", lvNumero=" + lvNumero + ", nmBairro=" + nmBairro + ", nmCidade="
				+ nmCidade + ", nmEndereco=" + nmEndereco + "]";
	}

	
}
