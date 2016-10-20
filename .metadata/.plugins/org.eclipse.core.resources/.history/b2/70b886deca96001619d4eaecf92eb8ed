package br.com.fiap.testes;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.LancaDespesa;
import br.com.fiap.beans.Processo;
import br.com.fiap.beans.TipoDespesa;
import br.com.fiap.conexao.ConnectionFactory;
import br.com.fiap.dao.LancarDespesaDAO;
import br.com.fiap.dao.ProcessoDAO;

public class Teste {

	public static void main(String[] args) {
		Connection conexao = null;
		
		try {
			conexao = ConnectionFactory.controlarInstancia().getConnection("", "");
			System.out.println("Conectado!");
			
			ProcessoDAO dao = new ProcessoDAO();
			Processo p =  dao.buscarPorNumeroProcesso(4, conexao);
			TipoDespesa tipo = new TipoDespesa(1,"Descricao");
			LancaDespesa ld = new LancaDespesa();
			
			ld.setNumero(p.getNumero());
			ld.setCodigoTipoDespesa(tipo.getCodigo());
			ld.setDataDespesa("22/06/1988");
			ld.setValorDespesa(66.6);
			ld.setDescricao("Descricao");
			
			LancarDespesaDAO ldDAO =new LancarDespesaDAO();
			ldDAO.create(ld, conexao);
			
			//teste readList
			
			List<LancaDespesa> listaLanca = new ArrayList<LancaDespesa>();
			listaLanca = ldDAO.readList(p.getNumero(), conexao);
			
			for(LancaDespesa lista: listaLanca){
				System.out.println(lista.getCodigoLancamento() + "\n" +
									lista.getCodigoTipoDespesa() + "\n" +
									lista.getNumero() + "\n" +
									lista.getDataDespesa() + "\n" +
									lista.getValorDespesa() + "\n" +
									lista.getDescricao());
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Erro.");
		}
		try {
			conexao.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
