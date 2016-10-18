package br.com.fiap.beans;

public class LancaDespesa {
	private int codigoLancamento;
	private TipoDespesa codigoTipoDespesa;
	private Processo numero;
	private String dataDespesa;
	private double valorDespesa;
	private String descricao;
	
	public double getCodigoLancamento() {
		return codigoLancamento;
	}
	public void setCodigoLancamento(int codigoLancamento) {
		this.codigoLancamento = codigoLancamento;
	}
	public TipoDespesa getCodigoTipoDespesa() {
		return codigoTipoDespesa;
	}
	public void setCodigoTipoDespesa(TipoDespesa codigoTipoDespesa) {
		this.codigoTipoDespesa = codigoTipoDespesa;
	}
	public Processo getNumero() {
		return numero;
	}
	public void setNumero(Processo numero) {
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
	public LancaDespesa(int codigoLancamento, TipoDespesa codigoTipoDespesa, Processo numero, String dataDespesa,
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
