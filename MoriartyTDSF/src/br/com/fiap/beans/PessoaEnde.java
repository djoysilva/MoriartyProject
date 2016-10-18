package br.com.fiap.beans;

public class PessoaEnde {
	private int codigoPessoaEnde;
	private Logradouro cep;
	private Pessoa codigoPessoa;
	private int numeroEndereco;
	private String complemento;
	
	public PessoaEnde() {
		super();
	}
	public PessoaEnde(int codigoPessoaEnde, Logradouro cep, Pessoa codigoPessoa, int numeroEndereco, String complemento) {
		super();
		this.codigoPessoaEnde = codigoPessoaEnde;
		this.cep = cep;
		this.codigoPessoa = codigoPessoa;
		this.numeroEndereco = numeroEndereco;
		this.complemento = complemento;
	}
	public int getCodigoPessoaEnde() {
		return codigoPessoaEnde;
	}
	public void setCodigoPessoaEnde(int codigoPessoaEnde) {
		this.codigoPessoaEnde = codigoPessoaEnde;
	}
	public Logradouro getCep() {
		return cep;
	}
	public void setCep(Logradouro cep) {
		this.cep = cep;
	}
	public Pessoa getCodigoPessoa() {
		return codigoPessoa;
	}
	public void setCodigoPessoa(Pessoa codigoPessoa) {
		this.codigoPessoa = codigoPessoa;
	}
	public int getNumeroEndereco() {
		return numeroEndereco;
	}
	public void setNumeroEndereco(int numeroEndereco) {
		this.numeroEndereco = numeroEndereco;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
}
