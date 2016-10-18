package br.com.fiap.beans;

public class Logradouro {
	private String cep;
	private Bairro codigoBairro;
	private TipoLog codigoTipoLog;
	private String descricao;
	
	public Logradouro() {
		super();
	}
	public Logradouro(String cep, Bairro codigoBairro, TipoLog codigoTipoLog, String descricao) {
		super();
		this.cep = cep;
		this.codigoBairro = codigoBairro;
		this.codigoTipoLog = codigoTipoLog;
		this.descricao = descricao;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public Bairro getCodigoBairro() {
		return codigoBairro;
	}
	public void setCodigoBairro(Bairro codigoBairro) {
		this.codigoBairro = codigoBairro;
	}
	public TipoLog getCodigoTipoLog() {
		return codigoTipoLog;
	}
	public void setCodigoTipoLog(TipoLog codigoTipoLog) {
		this.codigoTipoLog = codigoTipoLog;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
