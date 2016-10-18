package br.com.fiap.beans;

public class HistTaxa {
	private int codigo;
	private String dataVigencia;
	private double valorDataAdministrativa;
	private double valorTaxaJuros;
	private double valorMoraDiaria;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDataVigencia() {
		return dataVigencia;
	}
	public void setDataVigencia(String dataVigencia) {
		this.dataVigencia = dataVigencia;
	}
	public double getValorDataAdministrativa() {
		return valorDataAdministrativa;
	}
	public void setValorDataAdministrativa(double valorDataAdministrativa) {
		this.valorDataAdministrativa = valorDataAdministrativa;
	}
	public double getValorTaxaJuros() {
		return valorTaxaJuros;
	}
	public void setValorTaxaJuros(double valorTaxaJuros) {
		this.valorTaxaJuros = valorTaxaJuros;
	}
	public double getValorMoraDiaria() {
		return valorMoraDiaria;
	}
	public void setValorMoraDiaria(double valorMoraDiaria) {
		this.valorMoraDiaria = valorMoraDiaria;
	}
	public HistTaxa(int codigo, String dataVigencia, double valorDataAdministrativa, double valorTaxaJuros,
			double valorMoraDiaria) {
		super();
		this.codigo = codigo;
		this.dataVigencia = dataVigencia;
		this.valorDataAdministrativa = valorDataAdministrativa;
		this.valorTaxaJuros = valorTaxaJuros;
		this.valorMoraDiaria = valorMoraDiaria;
	}
	public HistTaxa() {
		super();
	}


}
