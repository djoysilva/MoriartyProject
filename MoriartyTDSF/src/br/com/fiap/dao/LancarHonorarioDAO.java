package br.com.fiap.dao;

import br.com.fiap.beans.LancaHonorario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Na documentaçã você inicia desenvolvendo uma aplicação sucinta do se projeto. Neste espaço onde você
 * pode utilizar as tags de HTML, como por exemplo, a <code. tag </code>, ou ainda deixar em <i>itálico
 * </i> e etc.
 * Existem ainda marcas especiais como:
 * @author Joyce Mara da Silva
 * @version1.5
 * @since1.0
 * @see OutraClasseRelacionada
 * @see OutraClasseRelacionadaComEsteProjeto
 * Não deixe também de comentar os seus códigos, principalmente os métodos com a mesma
 * <b>estrutura</b>
 * */

public class LancarHonorarioDAO{
	public void create(LancaHonorario lancaHonorario, Connection c) throws Exception{
		String comando = "INSERT INTO T_AM_ART_LANCA_HONORARIO (CD_LANCAMENTO, CD_TIPO_TAREFA, NR_PROCESSO, DT_HONORARIO, QT_HORA, DS_OBSERVACAO) values (?, ?, ?, ?, ?, ?)"
		PreparedStatement struct  = c.PreparedStatement(comando);
		struct.setInt(1, lancaHonorario.getCodigoLancamento());
		struct.setInt(2, lancaHonorario.getCodigoTipoTarefa().getCodigo());
		struct.setInt(3, lancaHonorario.getCodigoProcesso().getNumero());
		struct.setString(4, lancaHonorario.getDataHonorario());
		struct.setDouble(5, lancaHonorario. getQuantidadeHora());
		struct.setstring(6, lancaHonorario. getObservacao());
		struct.execute();
		struct.close();
	}

	public List<LancaHonorario> readList(Connection c) throws Exception{
		List<LancaHonorario> listHonorario = new ArrayList<LancaHonorario>();
		PreparedStatement struct = c.PreparedStatement("select * from T_AM_ART_LANCA_HONORARIO INNER JOIN T_AM_ART_PROCESSO USING (NR_PROCESSO)");
		ResultSet result = struct.executeQuery();
		while(result.next){
			LancaHonorario lancaHonorario = new LancaHonorario();
			lancaHonorario.setCodigoLancamento(result.getInt("CD_LANCAMENTO"));
			lancaHonorario.getCodigoTipoTarefa().getCodigo(result.getInt("CD_TIPO_TAREFA"));
			lancaHonorario.getCodigoProcesso().getNumero(result.getInt("NR_PROCESSO"));
			lancaHonorario.setDataHonorario(result.getString("DT_HONORARIO"));
			lancaHonorario.setQuantidadeHora(result.getDouble("QT_HORA"));
			lancaHonorario.setObservacao(result.getString("DS_OBSERVACAO"));
			listHonorario.add(lancaHonorario);
		}
		result.close();
		struct.close();
		return listHonorario;
	}

	public int update(Double hours, String obs, Connection c) throws Exception{
		PreparedStatement struct = c.PreparedStatement("update T_AM_ART_LANCA_HONORARIO SET QT_HORA = ? , DS_OBSERVACAO = ?");
		struct.setDouble(1, hours);
		struct.setstring(2, obs);
		int saida = struct.executeUpdate;
		struct.close();
		return saida;
	}

	public void deleteList(Connection c, int codigoLancamento) throws Exception{
		PreparedStatement struct = c.PreparedStatement("delete FROM  T_AM_ART_LANCA_HONORARIO where CD_LANCAMENTO = ?");
		struct.setInt(1, codigoLancamento);
		struct.execute();
		struct.close();
	}
}
