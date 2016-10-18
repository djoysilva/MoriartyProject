package br.com.fiap.excecoes;

public class Excecao extends Exception{
	public Excecao(String msg, Exception e){
		super(msg, e);
		e.getMessage();
		e.printStackTrace();
	}
	public Excecao(String msg){
		super(msg);
		System.out.println("Erro desconhecido.");
	}
}
