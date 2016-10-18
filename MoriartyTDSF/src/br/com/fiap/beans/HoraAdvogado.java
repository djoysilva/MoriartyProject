package br.com.fiap.beans;

public class HoraAdvogado {
	private Advogado codigo;
	private int histHora;
	private String dataVigencia;
	private double valorHora;
	
	public Advogado getCodigo() {
		return codigo;
	}
	public void setCodigo(Advogado codigo) {
		this.codigo = codigo;
	}
	public int getHistHora() {
		return histHora;
	}
	public void setHistHora(int histHora) {
		this.histHora = histHora;
	}
	public String getDataVigencia() {
		return dataVigencia;
	}
	public void setDataVigencia(String dataVigencia) {
		this.dataVigencia = dataVigencia;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	public HoraAdvogado(Advogado codigo, int histHora, String dataVigencia, double valorHora) {
		super();
		this.codigo = codigo;
		this.histHora = histHora;
		this.dataVigencia = dataVigencia;
		this.valorHora = valorHora;
	}
	public HoraAdvogado() {
		super();
	}


}
