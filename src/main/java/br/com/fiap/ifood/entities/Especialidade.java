package br.com.fiap.ifood.entities;

public class Especialidade {
	private int cdEspecialidade;
	private String nmEspecialidade;

	public Especialidade(int cdEspecialidade, String nmEspecialidade) {
		this.cdEspecialidade = cdEspecialidade;
		this.nmEspecialidade = nmEspecialidade;
	}

	@Override
	public String toString() {
		return "Especialidade [cdEspecialidade=" + cdEspecialidade + ", nmEspecialidade=" + nmEspecialidade
				+ "]";
	}

	public int getCdEspecialidade() {
		return cdEspecialidade;
	}

	public void setCdEspecialidade(int cdEspecialidade) {
		this.cdEspecialidade = cdEspecialidade;
	}

	public String getNmEspecialidade() {
		return nmEspecialidade;
	}

	public void setNmEspecialidade(String nmEspecialidade) {
		this.nmEspecialidade = nmEspecialidade;
	}
}
