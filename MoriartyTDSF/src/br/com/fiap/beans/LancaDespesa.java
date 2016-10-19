package br.com.fiap.beans;

public class LancaDespesa {
	private int codigoLancamento;
	private int codigoTipoDespesa;
	private int numero;
	private String dataDespesa;
	private double valorDespesa;
	private String descricao;
	
	public int getCodigoLancamento() {
		return codigoLancamento;
	}
	public void setCodigoLancamento(int codigoLancamento) {
		this.codigoLancamento = codigoLancamento;
	}
	public int getCodigoTipoDespesa() {
		return codigoTipoDespesa;
	}
	public void setCodigoTipoDespesa(int codigoTipoDespesa) {
		this.codigoTipoDespesa = codigoTipoDespesa;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getDataDespesa() {
		return dataDespesa;
	}
	public void setDataDespesa(String dataDespesa) {
		this.dataDespesa = dataDespesa;
	}
	public double getValorDespesa() {
		return valorDespesa;
	}
	public void setValorDespesa(double valorDespesa) {
		this.valorDespesa = valorDespesa;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getTudo() {
		return codigoLancamento + "\n" + codigoTipoDespesa + "\n" +
	numero + "\n" + dataDespesa + "\n" + valorDespesa + "\n" + descricao;
	}
	
	public LancaDespesa(int codigoLancamento, int codigoTipoDespesa, int numero, String dataDespesa,
			double valorDespesa, String descricao) {
		super();
		this.codigoLancamento = codigoLancamento;
		this.codigoTipoDespesa = codigoTipoDespesa;
		this.numero = numero;
		this.dataDespesa = dataDespesa;
		this.valorDespesa = valorDespesa;
		this.descricao = descricao;
	}
	public LancaDespesa() {
		super();
	}

}
