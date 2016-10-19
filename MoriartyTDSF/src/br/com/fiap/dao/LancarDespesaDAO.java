package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
 
    public class LancarDespesaDAO{
        public void create(LancaDespesa lancaDespesa, Connection c) throws Exception{
            String comando = "INSERT INTO T_AM_ART_LANCA_DESPESA (CD_LANCAMENTO, CD_TIPO_DESPESA, NR_PROCESSO, DT_DESPESA, VL_DESPESA, DS_OBSERVACAO values (?, ?, ?, ?, ?, ?))";
            PreparedStatement struct = c.prepareStatement(comando);
            struct.setInt(1, lancaDespesa.getCodigoLancamento());
            struct.setInt(2, lancaDespesa.getCodigoTipoDespesa().getCodigo());
            struct.setInt(3, lancaDespesa.getNumero().getNumero());
            struct.setstring(4, lancaDespesa.getDataDespesa());
            struct.setDouble(5, lancaDespesa.getValorDespesa());
            struct.setString(6, lancaDespesa.getDescricao());
            struct.execute();         
            struct.close();
        }
        
        public List<LancaDespesa> readList(LancaDespesa lancaDespesa, Connection c) throws Exception{
            List<LancaDespesa> listDespesa = new ArrayList<LancaDespesa>();
            PreparedStatement struct = c.prepareStatement("select * from T_AM_ART_LANCA_DESPESA INNER JOIN T_AM_ART_PROCESSO USING (NR_PROCESSO)");
            ResultSet result = struct.executeQuery();
            while (result.next()){
                LancaDespesa lancaDespesa = new LancaDespesa();
                lancaDespesa.setCodigoLancamento(result.getInt("CD_LANCAMENTO"));
                lancaDespesa.getCodigoTipoDespesa().setInt(result.getInt("CD_TIPO_DESPESA"));
                lancaDespesa.getNumero().setInt(result.getInt("NR_PROCESSO"));
                lancaDespesa.setDataDespesa(result.getString("DT_DESPESA"));
                lancaDespesa.setValorDespesa(result.getString("VL_DESPESA"));
                listDespesa.add(lancaDespesa);               
            }
            result.close();
            struct.close();
            return listDespesa;           
        }
        
        public int update(String data, Double valor, Connection c) throws Exception{
            PreparedStatement struct = c.prepareStatement("update T_AM_ART_LANCA_DESPESA set DT_DESPESA = ?, VL_DESPESA = ? ");
            struct.setString(1, data);
            struct.setDouble(2, valor);
            int saida = struct.executeQuery();
            struct.close();
            return saida;
             
        }
        
        public void delete(int codigoLanca, Connection c) throws Exception{
            PreparedStatement struct = c.prepareStatement("delete from T_AM_ART_LANCA_DESPESA where CD_LANCAMENTO = ?");
            struct.setInt(1, codigoLanca);
            struct.execute();
            struct.close();
        }
        
    }
    
