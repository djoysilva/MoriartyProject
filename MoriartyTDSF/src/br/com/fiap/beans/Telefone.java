package br.com.fiap.beans;

public class Telefone {
	private int codigo;
	private TipoFone codigoTipoFone;
	private short ddd;
	private int fone;

	public Telefone() {
		super();
	}
	public Telefone(int codigo, TipoFone codigoTipoFone, short ddd, int fone) {
		super();
		this.codigo = codigo;
		this.codigoTipoFone = codigoTipoFone;
		this.ddd = ddd;
		this.fone = fone;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public TipoFone getCodigoTipoFone() {
		return codigoTipoFone;
	}
	public void setCodigoTipoFone(TipoFone codigoTipoFone) {
		this.codigoTipoFone = codigoTipoFone;
	}
	public short getDdd() {
		return ddd;
	}
	public void setDdd(short ddd) {
		this.ddd = ddd;
	}
	public int getFone() {
		return fone;
	}
	public void setFone(int fone) {
		this.fone = fone;
	}
}
