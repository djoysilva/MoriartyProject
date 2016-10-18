package br.com.fiap.beans;

public class Cidade {
	private int codigoCidade;
	private Estado codigoEstado;
	private String nome;
	
	public Cidade() {
		super();
	}
	public Cidade(int codigoCidade, Estado codigoEstado, String nome) {
		super();
		this.codigoCidade = codigoCidade;
		this.codigoEstado = codigoEstado;
		this.nome = nome;
	}
	public int getCodigoCidade() {
		return codigoCidade;
	}
	public void setCodigoCidade(int codigoCidade) {
		this.codigoCidade = codigoCidade;
	}
	public Estado getCodigoEstado() {
		return codigoEstado;
	}
	public void setCodigoEstado(Estado codigoEstado) {
		this.codigoEstado = codigoEstado;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
