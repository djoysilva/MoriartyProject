package br.com.fiap.beans;

public class Forum extends Pessoa{
	private String descricao;

	public Forum(int codigo, String nome) {
		super(codigo, nome);
	}

	public Forum(int codigo, String nome, String descricao) {
		super(codigo, nome);
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
