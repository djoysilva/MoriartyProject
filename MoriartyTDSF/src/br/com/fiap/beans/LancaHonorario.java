package br.com.fiap.beans;

public class LancaHonorario {
	private int codigoLancamento;
	private int codigoTipoTarefa;
	private int codigoProcesso;
	private String dataHonorario;
	private double quantidadeHora;
	private String observacao;
	
	public int getCodigoLancamento() {
		return codigoLancamento;
	}
	public void setCodigoLancamento(int codigoLancamento) {
		this.codigoLancamento = codigoLancamento;
	}
	public int getCodigoTipoTarefa() {
		return codigoTipoTarefa;
	}
	public void setCodigoTipoTarefa(int codigoTipoTarefa) {
		this.codigoTipoTarefa = codigoTipoTarefa;
	}
	public int getCodigoProcesso() {
		return codigoProcesso;
	}
	public void setCodigoProcesso(int codigoProcesso) {
		this.codigoProcesso = codigoProcesso;
	}
	public String getDataHonorario() {
		return dataHonorario;
	}
	public void setDataHonorario(String dataHonorario) {
		this.dataHonorario = dataHonorario;
	}
	public double getQuantidadeHora() {
		return quantidadeHora;
	}
	public void setQuantidadeHora(double quantidadeHora) {
		this.quantidadeHora = quantidadeHora;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public LancaHonorario(int codigoLancamento, int codigoTipoTarefa, int codigoProcesso, String dataHonorario,
			double quantidadeHora, String observacao) {
		super();
		this.codigoLancamento = codigoLancamento;
		this.codigoTipoTarefa = codigoTipoTarefa;
		this.codigoProcesso = codigoProcesso;
		this.dataHonorario = dataHonorario;
		this.quantidadeHora = quantidadeHora;
		this.observacao = observacao;
	}
	public LancaHonorario() {
		super();
	}


}
