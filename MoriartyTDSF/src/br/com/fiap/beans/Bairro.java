package br.com.fiap.beans;

public class Bairro {
	private int codigoBairro;
	private Cidade codigoCidade;
	private String nome;
	
	public Bairro() {
		super();
	}
	public Bairro(int codigoBairro, Cidade codigoCidade, String nome) {
		super();
		this.codigoBairro = codigoBairro;
		this.codigoCidade = codigoCidade;
		this.nome = nome;
	}
	public int getCodigoBairro() {
		return codigoBairro;
	}
	public void setCodigoBairro(int codigoBairro) {
		this.codigoBairro = codigoBairro;
	}
	public Cidade getCodigoCidade() {
		return codigoCidade;
	}
	public void setCodigoCidade(Cidade codigoCidade) {
		this.codigoCidade = codigoCidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}