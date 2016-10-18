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
		PreparedStatement estrutura = conexao.prepareStatement("SELECT * FROM T_AM_ART_PROCESSO P INNER JOIN T_AM_ART_ADVOGADO A USING(CD_ADVOGADO)");
		ResultSet resultado = estrutura.executeQuery();
		
		while(resultado.next()){
			Processo processo = new Processo();
			processo.setNumero(resultado.getInt("NR_PROCESSO"));
			processo.getCodigoAdvogado().setCodigo(resultado.getInt("CD_ADVOGADO"));
			processo.getCodigoCliente().setCodigo(resultado.getInt("CD_CLIENTE"));
			processo.getCodigoCausa().setCodigo(resultado.getInt("CD_CAUSA"));
			processo.getCodigoForum().setCodigo(resultado.getInt("CD_FORUM"));
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
}
