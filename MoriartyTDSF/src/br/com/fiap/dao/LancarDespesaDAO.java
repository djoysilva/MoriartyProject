package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.LancaDespesa;
import br.com.fiap.beans.Processo;
import br.com.fiap.beans.TipoDespesa;

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
            String comando = "INSERT INTO T_AM_ART_LANCA_DESPESA (CD_LANCAMENTO, CD_TIPO_DESPESA, NR_PROCESSO, DT_DESPESA, VL_DESPESA, DS_OBSERVACAO) values (SQ_AM_ART_LANCA_DESPESA.nextval, ?, ?, ?, ?, ?)";
            
            PreparedStatement struct = c.prepareStatement(comando);
           
            struct.setInt(1, lancaDespesa.getNumero());
        	struct.setInt(2, lancaDespesa.getCodigoTipoDespesa());
            struct.setString(3, lancaDespesa.getDataDespesa());
            struct.setDouble(4, lancaDespesa.getValorDespesa());
            struct.setString(5, lancaDespesa.getDescricao());
            struct.execute();         
            struct.close();
            
            System.out.println("Gravado com sucesso!");
        }
        
        public List<LancaDespesa> readList(int nrProcesso, Connection c) throws Exception{
            List<LancaDespesa> listDespesa = new ArrayList<LancaDespesa>();
            
            PreparedStatement struct = c.prepareStatement("SELECT * FROM T_AM_ART_LANCA_DESPESA WHERE NR_PROCESSO = ?");
            
            struct.setInt(1, nrProcesso);
            
            ResultSet result = struct.executeQuery();
            while (result.next()){
            	
            	LancaDespesa lancaDespesa = new LancaDespesa();
            	
            	lancaDespesa.setCodigoLancamento(result.getInt("CD_LANCAMENTO"));
            	lancaDespesa.setCodigoTipoDespesa(result.getInt("CD_TIPO_DESPESA"));
            	lancaDespesa.setNumero(result.getInt("NR_PROCESSO"));
            	lancaDespesa.setDataDespesa(result.getString("DT_DESPESA"));
                lancaDespesa.setValorDespesa(result.getDouble("VL_DESPESA"));
                lancaDespesa.setDescricao(result.getString("DS_OBSERVACAO"));
                listDespesa.add(lancaDespesa);               
            }
            result.close();
            struct.close();
            return listDespesa;           
        }
        
        public LancaDespesa search(int numeroProcesso, Connection c) throws Exception{
            LancaDespesa lancaDespesa = new LancaDespesa();
            PreparedStatement struct = c.prepareStatement("select NR_PROCESSO from T_AM_ART_LANCA_DESPESA where NR_PROCESSO = ?");
            struct.setInt(1, numeroProcesso);
            
            ResultSet result = struct.executeQuery();
            if(result.next()){
                lancaDespesa.setCodigoLancamento(result.getInt("CD_LANCAMENTO"));
                lancaDespesa.setCodigoTipoDespesa(result.getInt("CD_TIPO_DESPESA"));
                lancaDespesa.setNumero(result.getInt("NR_PROCESSO"));
                lancaDespesa.setDataDespesa(result.getString("DT_DESPESA"));
                lancaDespesa.setValorDespesa(result.getDouble("VL_DESPESA"));
            }
            result.close();
            struct.close();
            return lancaDespesa;
        }
        
        public int update(int codigoDespesa, String data, Double valor, String desc, Connection c) throws Exception{
            PreparedStatement struct = c.prepareStatement("update T_AM_ART_LANCA_DESPESA set DT_DESPESA = ?, VL_DESPESA = ?, DS_OBSERVACAO = ? where CD_LANCAMENTO = ?");
            struct.setString(1, data);
            struct.setDouble(2, valor);
            struct.setString(3, desc);
            struct.setInt(4, codigoDespesa);
            int saida = struct.executeUpdate();
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
    
