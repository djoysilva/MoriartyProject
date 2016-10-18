package br.com.fiap.beans;

public class Cliente extends Pessoa{
	private String razaoSocial;
	private String cnpj;
	private double inscricaoEstadual;
	private String email;
	private String password;
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public double getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	
	public void setInscricaoEstadual(double inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Cliente(int codigo, String nome, String razaoSocial, String cnpj, double inscricaoEstadual, String email,
			String password) {
		super(codigo, nome);
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
		this.email = email;
		this.password = password;
	}
	
	public Cliente(int codigo, String nome) {
		super(codigo, nome);
	}


}
