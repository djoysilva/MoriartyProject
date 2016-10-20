package br.com.fiap.testes;

import java.sql.Connection;

import br.com.fiap.beans.LancaDespesa;
import br.com.fiap.beans.LancaHonorario;
import br.com.fiap.beans.Processo;
import br.com.fiap.conexao.ConnectionFactory;
import br.com.fiap.dao.LancarDespesaDAO;
import br.com.fiap.dao.ProcessoDAO;

public class Teste {

	public static void main(String[] args) {
		Connection conexao = null;
		
		try {
			conexao = ConnectionFactory.controlarInstancia().getConnection("", "");
			System.out.println("deu bom");
			
			ProcessoDAO dao = new ProcessoDAO();
		
			Processo p =  dao.buscarPorNumeroProcesso(4, conexao);
			
			LancaDespesa ld = new LancaDespesa(66, 4, 4, "22/06/1988", 666.6, "ojisadsad");
			LancarDespesaDAO ldDAO =new LancarDespesaDAO();
			ldDAO.create(p, 4, conexao);
			
			
			
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
