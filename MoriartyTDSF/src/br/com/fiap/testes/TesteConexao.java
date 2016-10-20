package br.com.fiap.testes;

import java.sql.Connection;

import br.com.fiap.conexao.ConnectionFactory;

public class TesteConexao {

	public static void main(String[] args) {
		Connection c = null;
		
		try {
			c = new ConnectionFactory().controlarInstancia().getConnection();
			System.out.println("abriu");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("aaa");
		}

	}

}
