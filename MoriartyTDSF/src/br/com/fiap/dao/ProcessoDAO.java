 package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Processo;

public class ProcessoDAO {

	public List<Processo> getLista(Connection conexao) throws Exception{
		List<Processo> lstProcesso = new ArrayList<Processo>();
		PreparedStatement estrutura = conexao.prepareStatement("SELECT * FROM T_AM_ART_PROCESSO INNER JOIN T_AM_ART_ADVOGADO USING(CD_ADVOGADO)");
		ResultSet resultado = estrutura.executeQuery();
		
		while(resultado.next()){
			Processo processo = new Processo();
			processo.setNumero(resultado.getInt("NR_PROCESSO"));
			processo.setCodigoAdvogado(resultado.getInt("CD_ADVOGADO"));
			processo.setCodigoCliente(resultado.getInt("CD_CLIENTE"));
			processo.setCodigoCausa(resultado.getInt("CD_CAUSA"));
			processo.setCodigoForum(resultado.getInt("CD_FORUM"));
			processo.setDescricao(resultado.getString("DS_PROCESSO"));
			processo.setDataAbertura(resultado.getString("DT_ABERTURA"));
			processo.setDataFechamento(resultado.getString("DT_FECHAMENTO"));
			processo.setDiaVencimento(resultado.getShort("DT_DIA_VENCIMENTO"));
			processo.setResultado(resultado.getShort("NR_RESULTADO"));
			processo.setSituacao(resultado.getShort("NR_SITUACAO"));
			processo.setObservacao(resultado.getString("DS_OBSERVACAO"));
			lstProcesso.add(processo);
		}
		resultado.close();
		estrutura.close();
		return lstProcesso;
	}
	
	public Processo buscarPorNumeroProcesso(int numeroProcesso, Connection conexao) throws Exception{
		Processo processo = new Processo();
		String comando = "SELECT NR_PROCESSO, CD_ADVOGADO, CD_CLIENTE, CD_CAUSA, CD_FORUM, DS_PROCESSO, DT_ABERTURA, DT_FECHAMENTO, DT_DIA_VENCIMENTO, NR_RESULTADO, NR_SITUACAO, DS_OBSERVACAO FROM T_AM_ART_PROCESSO WHERE NR_PROCESSO = ?";
		PreparedStatement estrutura = conexao.prepareStatement(comando);
		estrutura.setInt(1, numeroProcesso);
		ResultSet resultado = estrutura.executeQuery();
		
		while(resultado.next()) {
			processo.setNumero(resultado.getInt("NR_PROCESSO"));
			processo.setCodigoAdvogado(resultado.getInt("CD_ADVOGADO"));
			processo.setCodigoCliente(resultado.getInt("CD_CLIENTE"));
			processo.setCodigoCausa(resultado.getInt("CD_CAUSA"));
			processo.setCodigoForum(resultado.getInt("CD_FORUM"));
			processo.setDescricao(resultado.getString("DS_PROCESSO"));
			processo.setDataAbertura(resultado.getString("DT_ABERTURA"));
			processo.setDataFechamento(resultado.getString("DT_FECHAMENTO"));
			processo.setDiaVencimento(resultado.getShort("DT_DIA_VENCIMENTO"));
			processo.setResultado(resultado.getShort("NR_RESULTADO"));
			processo.setSituacao(resultado.getShort("NR_SITUACAO"));
			processo.setObservacao(resultado.getString("DS_OBSERVACAO"));
		}
		
		resultado.close();
		estrutura.close();
		
		return processo;
	}
}
