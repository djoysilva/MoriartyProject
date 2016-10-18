package br.com.fiap.beans;

public class HistProcTx {
	private Processo numero;
	private HistTaxa taxa;
	private String dataValidade;

	public HistProcTx() {
		super();
	}
	public HistProcTx(Processo numero, HistTaxa taxa, String dataValidade) {
		super();
		this.numero = numero;
		this.taxa = taxa;
		this.dataValidade = dataValidade;
	}
	public Processo getNumero() {
		return numero;
	}
	public void setNumero(Processo numero) {
		this.numero = numero;
	}
	public HistTaxa getTaxa() {
		return taxa;
	}
	public void setTaxa(HistTaxa taxa) {
		this.taxa = taxa;
	}
	public String getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}
}
