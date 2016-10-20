package br.com.fiap.servlets;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.beans.LancaDespesa;
import br.com.fiap.beans.LancaHonorario;
import br.com.fiap.beans.Processo;
import br.com.fiap.conexao.ConnectionFactory;
import br.com.fiap.dao.LancarDespesaDAO;
import br.com.fiap.dao.LancarHonorarioDAO;
import br.com.fiap.dao.ProcessoDAO;

@WebServlet("/buscaServlet")
public class BuscaServlet extends HttpServlet{

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Connection c = null;
		String acao = req.getParameter("acao");
		int numero = Integer.parseInt(req.getParameter("numeroProcesso"));
		String nome = req.getParameter("nomeCliente");
		String periodoInicial = req.getParameter("periodoInicial");
		String periodoFinal = req.getParameter("periodoFinal");
		

		ProcessoDAO processoDAO = new ProcessoDAO();
		LancarHonorarioDAO lhDAO = new LancarHonorarioDAO();
		LancarDespesaDAO ldDAO = new LancarDespesaDAO();

		switch (acao) {
		case "listarProcesso":
			
			try {
				c = new ConnectionFactory().controlarInstancia().getConnection();
				
				Processo processo = processoDAO.buscarPorNumeroProcesso(numero, c);
				req.setAttribute("chaveNumero", processo);
				
				LancaDespesa lancaDespesa = ldDAO.search(numero, c);
				req.setAttribute("chaveDespesa", lancaDespesa);

				LancaHonorario lancaHonorario = lhDAO.search(numero, c);
				req.setAttribute("chaveHonorario", lancaHonorario);
				
				req.getRequestDispatcher("listaProcesso.jsp").forward(req, resp);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		
			break;
			
		case "abrirFormHonorario":

			req.getRequestDispatcher("lancarHonorario.jsp").forward(req,resp);

			break;

		case "abrirFormDespesa":

			req.getRequestDispatcher("lancarDespesa.jsp").forward(req,resp);

			break;

		case "abrirListaHonorario":

			req.getRequestDispatcher("listaHonorario.jsp").forward(req,resp);

			break;

		case "abrirListaDespesa":

			req.getRequestDispatcher("listaDespesa.jsp").forward(req,resp);

			break;

		default:
			break;
		}
	}
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String acao = req.getParameter("acao");
		
		switch (acao) {
		
		case "alterarDespesa":
			break;
		
		case "alterarHonorario":
			break;
			
		case "lancarHonorario":
			break;
			
		case "lancarDespesa":
			break;
			
		default:
			break;
		}
	}
	
}