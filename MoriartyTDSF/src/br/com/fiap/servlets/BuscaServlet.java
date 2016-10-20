package br.com.fiap.servlets;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.beans.Processo;
import br.com.fiap.conexao.ConnectionFactory;
import br.com.fiap.dao.ProcessoDAO;

@WebServlet("/buscaServlet")
public class BuscaServlet extends HttpServlet{

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String acao = req.getParameter("acao");
		
		switch (acao) {
		case "listarProcesso":
			Connection c = null;
			try {
				c = new ConnectionFactory().controlarInstancia().getConnection("RM75949", "Christo123");

				int numero = Integer.parseInt(req.getParameter("numeroProcesso"));
				String nome = req.getParameter("nomeCliente");
				String periodoInicial = req.getParameter("periodoInicial");
				String periodoFinal = req.getParameter("periodoFinal");

				ProcessoDAO dao = new ProcessoDAO();
				Processo processo = dao.buscarPorNumeroProcesso(numero, c);
				req.setAttribute("chaveNumero", processo);
				req.getRequestDispatcher("alterar.jsp").forward(req, resp);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			break;
			
		case "abrirFormHonorario":
			int numeroListado = Integer.getInteger(req.getParameter("numeroProcesso"));
		}
	}
}
