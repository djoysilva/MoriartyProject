package br.com.fiap.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.beans.Processo;

@WebServlet("/buscaServlet")
public class BuscaServlet extends HttpServlet{

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int numero = Integer.parseInt(req.getParameter("numeroProcesso"));
		String nome = req.getParameter("nomeCliente");
		String periodoInicial = req.getParameter("periodoInicial");
		String periodoFinal = req.getParameter("periodoFinal");
		
		if (numero != 0) {
			Processo processo = buscarPorNumeroProcesso(numero);
			
			req.setAttribute("chaveNumero", processo);
			
			req.getRequestDispatcher("alterar.jsp").forward(req, resp);
		}
		else {
			if (nome != null) {
				Processo processo = search(nome);
				req.setAttribute("chaveNome", processo);
				req.getRequestDispatcher("alterar.jsp").forward(req, resp);
			}
			else {
				Processo processo = buscarPorPeriodo(periodoInicial, periodoFinal);
				req.setAttribute("chavePeriodo", processo);
				req.getRequestDispatcher("alterar.jsp").forward(req, resp);
			}
		}
		
	}
	
}
