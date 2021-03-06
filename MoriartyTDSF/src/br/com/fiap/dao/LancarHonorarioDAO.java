package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.LancaHonorario;

/**
 * Na documenta�� voc� inicia desenvolvendo uma aplica��o sucinta do se projeto. Neste espa�o onde voc�
 * pode utilizar as tags de HTML, como por exemplo, a <code. tag </code>, ou ainda deixar em <i>it�lico
 * </i> e etc.
 * Existem ainda marcas especiais como:
 * @author Joyce Mara da Silva
 * @version1.5
 * @since1.0
 * @see OutraClasseRelacionada
 * @see OutraClasseRelacionadaComEsteProjeto
 * N�o deixe tamb�m de comentar os seus c�digos, principalmente os m�todos com a mesma
 * <b>estrutura</b>
 * */

public class LancarHonorarioDAO{
	public void create(LancaHonorario lancaHonorario, Connection c) throws Exception{
		String comando = "INSERT INTO T_AM_ART_LANCA_HONORARIO (CD_LANCAMENTO, CD_TIPO_TAREFA, NR_PROCESSO, DT_HONORARIO, QT_HORA, DS_OBSERVACAO) values (SQ_AM_ART_LANCA_HONORARIO.nextval, ?, ?, ?, ?, ?)";
		PreparedStatement struct  = c.prepareStatement(comando);
		
		struct.setInt(1, lancaHonorario.getCodigoTipoTarefa());
		struct.setInt(2, lancaHonorario.getCodigoProcesso());
		struct.setString(3, lancaHonorario.getDataHonorario());
		struct.setDouble(4, lancaHonorario. getQuantidadeHora());
		struct.setString(5, lancaHonorario. getObservacao());
		struct.execute();
		struct.close();
		System.out.println("Gravado com sucesso!");
	}

	public List<LancaHonorario> readList(int nrProcesso, Connection c) throws Exception{
		List<LancaHonorario> listHonorario = new ArrayList<LancaHonorario>();
		PreparedStatement struct = c.prepareStatement("select * from T_AM_ART_LANCA_HONORARIO WHERE NR_PROCESSO = ?");
		
		struct.setInt(1, nrProcesso);
		
		ResultSet result = struct.executeQuery();
		while(result.next()){
			LancaHonorario lancaHonorario = new LancaHonorario();
			lancaHonorario.setCodigoLancamento(result.getInt("CD_LANCAMENTO"));
			lancaHonorario.setCodigoTipoTarefa(result.getInt("CD_TIPO_TAREFA"));
			lancaHonorario.setCodigoProcesso(result.getInt("NR_PROCESSO"));
			lancaHonorario.setDataHonorario(result.getString("DT_HONORARIO"));
			lancaHonorario.setQuantidadeHora(result.getDouble("QT_HORA"));
			lancaHonorario.setObservacao(result.getString("DS_OBSERVACAO"));
			listHonorario.add(lancaHonorario);
		}
		result.close();
		struct.close();
		return listHonorario;
	}
    
    public LancaHonorario search(int numeroProcesso, Connection c) throws Exception{
        LancaHonorario lancaHonorario = new LancaHonorario();
        PreparedStatement struct = c.prepareStatement("SELECT * FROM T_AM_ART_LANCA_HONORARIO WHERE NR_PROCESSO = ? ");
        //struct.setInt(1, codigoLancamento);
        struct.setInt(1, numeroProcesso);
        ResultSet result = struct.executeQuery();
        if (result.next()){
            lancaHonorario.setCodigoLancamento(result.getInt("CD_LANCAMENTO"));
            lancaHonorario.setCodigoTipoTarefa(result.getInt("CD_TIPO_TAREFA"));
            lancaHonorario.setCodigoProcesso(result.getInt("NR_PROCESSO"));
            lancaHonorario.setDataHonorario(result.getString("DT_HONORARIO"));
            lancaHonorario.setQuantidadeHora(result.getDouble("QT_HORA"));
            lancaHonorario.setObservacao(result.getString("DS_OBSERVACAO"));
         }
         result.close();
         struct.close();
         return lancaHonorario;
    }

    public LancaHonorario buscaHonorario(int numeroProcesso, int codigoLancamento, Connection c) throws Exception{
        LancaHonorario lancaHonorario = new LancaHonorario();
        PreparedStatement struct = c.prepareStatement("SELECT * FROM T_AM_ART_LANCA_HONORARIO WHERE CD_LANCAMENTO = ? AND NR_PROCESSO = ? ");
        struct.setInt(1, codigoLancamento);
        struct.setInt(2, numeroProcesso);
        ResultSet result = struct.executeQuery();
        if (result.next()){
            lancaHonorario.setCodigoLancamento(result.getInt("CD_LANCAMENTO"));
            lancaHonorario.setCodigoTipoTarefa(result.getInt("CD_TIPO_TAREFA"));
            lancaHonorario.setCodigoProcesso(result.getInt("NR_PROCESSO"));
            lancaHonorario.setDataHonorario(result.getString("DT_HONORARIO"));
            lancaHonorario.setQuantidadeHora(result.getDouble("QT_HORA"));
            lancaHonorario.setObservacao(result.getString("DS_OBSERVACAO"));
         }
         result.close();
         struct.close();
         return lancaHonorario;
    }
    
	public int update(int codigoLanca, String data, Double hours, String obs, Connection c) throws Exception{
		
		PreparedStatement struct = c.prepareStatement("update T_AM_ART_LANCA_HONORARIO SET DT_HONORARIO = ?, QT_HORA = ? , DS_OBSERVACAO = ? WHERE CD_LANCAMENTO = ?");
		
		struct.setString(1, data);
		struct.setDouble(2, hours);
		struct.setString(3, obs);
		struct.setInt(4, codigoLanca);
		
		int saida = struct.executeUpdate();
		struct.close();
		return saida;
	}

	public void delete(Connection c, int codigoLancamento) throws Exception{
		PreparedStatement struct = c.prepareStatement("delete FROM  T_AM_ART_LANCA_HONORARIO where CD_LANCAMENTO = ?");
		struct.setInt(1, codigoLancamento);
		struct.execute();
		struct.close();
	}
}