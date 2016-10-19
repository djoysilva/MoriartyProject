package br.com.fiap.testes;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.LancaDespesa;
import br.com.fiap.conexao.ConnectionFactory;
import br.com.fiap.dao.LancarDespesaDAO;

public class Teste {

	public static void main(String[] args) {
		Connection conexao = null;
		
		try {
			conexao = ConnectionFactory.controlarInstancia().getConnection("", "");
			System.out.println("deu bom");
			
			List<LancaDespesa> lista = new ArrayList<LancaDespesa>();
			
			LancarDespesaDAO dao = new LancarDespesaDAO();
			lista = dao.readList(conexao);
			
			/*for(LancaDespesa obj: lista) {
				System.out.println(obj.getTudo() + "\n");
			}*/
			
			LancaDespesa teste = new LancaDespesa();
			teste.setCodigoLancamento(666);
			teste.setDataDespesa("22/06/1988");
			teste.setDescricao("nao aguet omais");
			teste.setValorDespesa(666.6);
			dao.create(teste, conexao);
			
			for(LancaDespesa obj: lista) {
				System.out.println(obj.getTudo() + "\n");
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("deu ruim");
		}
		try {
			conexao.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
