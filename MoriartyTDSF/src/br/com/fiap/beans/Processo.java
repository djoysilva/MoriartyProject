package br.com.fiap.beans;

public class Processo {
	private int numero;
	private int codigoAdvogado;
	private int codigoCliente;
	private int codigoCausa;
	private int codigoForum;
	//private Forum2 codigoForum;
	private String descricao;
	private String dataAbertura;
	private String dataFechamento;
	private short diaVencimento;
	private short resultado;
	private short situacao;
	private String observacao;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getCodigoAdvogado() {
		return codigoAdvogado;
	}
	public void setCodigoAdvogado(int codigoAdvogado) {
		this.codigoAdvogado = codigoAdvogado;
	}
	public int getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	public int getCodigoCausa() {
		return codigoCausa;
	}
	public void setCodigoCausa(int codigoCausa) {
		this.codigoCausa = codigoCausa;
	}
	public int getCodigoForum() {
		return codigoForum;
	}
	public void setCodigoForum(int codigoForum) {
		this.codigoForum = codigoForum;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public String getDataFechamento() {
		return dataFechamento;
	}
	public void setDataFechamento(String dataFechamento) {
		this.dataFechamento = dataFechamento;
	}
	public short getDiaVencimento() {
		return diaVencimento;
	}
	public void setDiaVencimento(short diaVencimento) {
		this.diaVencimento = diaVencimento;
	}
	public short getResultado() {
		return resultado;
	}
	public void setResultado(short resultado) {
		this.resultado = resultado;
	}
	public short getSituacao() {
		return situacao;
	}
	public void setSituacao(short situacao) {
		this.situacao = situacao;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public Processo(int numero, int codigoAdvogado, int codigoCliente, int codigoCausa, int codigoForum,
			String descricao, String dataAbertura, String dataFechamento, short diaVencimento, short resultado,
			short situacao, String observacao) {
		super();
		this.numero = numero;
		this.codigoAdvogado = codigoAdvogado;
		this.codigoCliente = codigoCliente;
		this.codigoCausa = codigoCausa;
		this.codigoForum = codigoForum;
		this.descricao = descricao;
		this.dataAbertura = dataAbertura;
		this.dataFechamento = dataFechamento;
		this.diaVencimento = diaVencimento;
		this.resultado = resultado;
		this.situacao = situacao;
		this.observacao = observacao;
	}
	public Processo() {
		super();
	}

	public String getTudo() {
		return numero + "\n" + codigoAdvogado+ "\n" + codigoCliente+ "\n"+ codigoCausa+ "\n"+
				codigoForum+ "\n" + descricao+ "\n" + dataAbertura+ "\n" + dataFechamento+ "\n" 
				+ diaVencimento+ "\n" + resultado+ "\n" + situacao+ "\n" + observacao;
	}

}
