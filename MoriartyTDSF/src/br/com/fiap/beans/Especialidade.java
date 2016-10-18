package br.com.fiap.beans;

public class Especialidade {
	private Advogado codigoAdvogado;
	private TipoCausa codigoCausa;
	
	public Advogado getCodigoAdvogado() {
		return codigoAdvogado;
	}
	public void setCodigoAdvogado(Advogado codigoAdvogado) {
		this.codigoAdvogado = codigoAdvogado;
	}
	public TipoCausa getCodigoCausa() {
		return codigoCausa;
	}
	public void setCodigoCausa(TipoCausa codigoCausa) {
		this.codigoCausa = codigoCausa;
	}
	public Especialidade(Advogado codigoAdvogado, TipoCausa codigoCausa) {
		super();
		this.codigoAdvogado = codigoAdvogado;
		this.codigoCausa = codigoCausa;
	}
	public Especialidade() {
		super();
	}


}
