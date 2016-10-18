package br.com.fiap.beans;

public class FonePessoa {
	private Pessoa codigoPessoa;
	private Telefone codigoTelefone;
	private short ramal;
	
	public Pessoa getCodigoPessoa() {
		return codigoPessoa;
	}
	public void setCodigoPessoa(Pessoa codigoPessoa) {
		this.codigoPessoa = codigoPessoa;
	}
	public Telefone getCodigoTelefone() {
		return codigoTelefone;
	}
	public void setCodigoTelefone(Telefone codigoTelefone) {
		this.codigoTelefone = codigoTelefone;
	}
	public short getRamal() {
		return ramal;
	}
	public void setRamal(short ramal) {
		this.ramal = ramal;
	}
	public FonePessoa(Pessoa codigoPessoa, Telefone codigoTelefone, short ramal) {
		super();
		this.codigoPessoa = codigoPessoa;
		this.codigoTelefone = codigoTelefone;
		this.ramal = ramal;
	}
	public FonePessoa() {
		super();
	}

}
