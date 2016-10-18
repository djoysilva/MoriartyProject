package br.com.fiap.beans;

public class Processo {
	private int numero;
	private Advogado codigoAdvogado;
	private Cliente codigoCliente;
	private TipoCausa codigoCausa;
	private Forum codigoForum;
	//private Forum2 codigoForum;
	private String descricao;
	private String dataAbertura;
	private String dataFechamento;
	private short diaVencimento;
	private short resultado;
	private short situacao;
	private String observacao;
	
	public double getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Advogado getCodigoAdvogado() {
		return codigoAdvogado;
	}
	public void setCodigoAdvogado(Advogado codigoAdvogado) {
		this.codigoAdvogado = codigoAdvogado;
	}
	public Cliente getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(Cliente codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	public TipoCausa getCodigoCausa() {
		return codigoCausa;
	}
	public void setCodigoCausa(TipoCausa codigoCausa) {
		this.codigoCausa = codigoCausa;
	}
	public Forum getCodigoForum() {
		return codigoForum;
	}
	public void setCodigoForum(Forum codigoForum) {
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
	public Processo(int numero, Advogado codigoAdvogado, Cliente codigoCliente, TipoCausa codigoCausa, Forum codigoForum,
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


}
