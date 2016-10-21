package br.com.fiap.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

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
		
		
		try {
			c = new ConnectionFactory().controlarInstancia().getConnection();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		ProcessoDAO processoDAO = new ProcessoDAO();
		LancarHonorarioDAO lhDAO = new LancarHonorarioDAO();
		LancarDespesaDAO ldDAO = new LancarDespesaDAO();

		switch (acao) {
		case "listarProcesso":
			
			try {
				int numero = Integer.parseInt(req.getParameter("numeroProcesso"));
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
			
			try{
				int processoRecebido = Integer.parseInt(req.getParameter("numeroProcessoRecebido"));
				
				req.setAttribute("chaveProcessoRecebido", processoRecebido);
				
				req.getRequestDispatcher("lancarHonorario.jsp").forward(req,resp);
			}
			catch(Exception e) {
				e.printStackTrace();
			}

			break;

		case "abrirFormDespesa":

			try {
				int processoRecebido = Integer.parseInt(req.getParameter("numeroProcessoRecebido"));

				req.setAttribute("chaveProcessoRecebido", processoRecebido);
				req.getRequestDispatcher("lancarDespesa.jsp").forward(req,resp);
			}
			catch(Exception e){
				e.printStackTrace();
			}

			break;
			
		case "alterarDespesaForm":
			
			try {
				int codigoLancamento = Integer.parseInt(req.getParameter("codigoLancamento"));
				int numeroProcesso = Integer.parseInt(req.getParameter("numeroProcesso"));
				
				LancaDespesa despesaAlterada = ldDAO.buscaDespesa(numeroProcesso, codigoLancamento, c);
				
				req.setAttribute("chaveDespesaAlterada", despesaAlterada);
				
				req.getRequestDispatcher("alterarDespesa.jsp").forward(req, resp);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			break;
			
		case "alterarHonorarioForm":
			
			try {
				int codigoLancamento = Integer.parseInt(req.getParameter("codigoLancamento"));
				int numeroProcesso = Integer.parseInt(req.getParameter("numeroProcesso"));
				
				LancaHonorario honorarioAlterado = lhDAO.buscaHonorario(numeroProcesso, codigoLancamento, c);
				
				req.setAttribute("chaveHonorarioAlterado", honorarioAlterado);
				
				req.getRequestDispatcher("alterarHonorario.jsp").forward(req, resp);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			break;

		case "abrirListaHonorario":
			
			try{
				int processoRecebido = Integer.parseInt(req.getParameter("numeroProcessoRecebido"));
				
				List<LancaHonorario> listaHonorario = lhDAO.readList(processoRecebido, c);
				
				req.setAttribute("chaveListaHonorario", listaHonorario);
				
				req.getRequestDispatcher("listaHonorario.jsp").forward(req,resp);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			break;

		case "abrirListaDespesa":
			
			try{
			int processoRecebido = Integer.parseInt(req.getParameter("numeroProcessoRecebido"));
				
				
			List<LancaDespesa> listaDespesa = ldDAO.readList(processoRecebido, c);
			
			req.setAttribute("chaveListaDespesa", listaDespesa);
			
			req.getRequestDispatcher("listaDespesa.jsp").forward(req,resp);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			break;

		default:
			break;
		}
	}
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Connection c = null;
		LancarHonorarioDAO lhDAO = new LancarHonorarioDAO();
		LancarDespesaDAO ldDAO = new LancarDespesaDAO();
		
		try {
			c = new ConnectionFactory().controlarInstancia().getConnection();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		String acao = req.getParameter("acao");
		
		switch (acao) {
		
		case "alterarDespesa":
			try {
				int codigoLancamento = Integer.parseInt(req.getParameter("codigoLancamentoDespesa"));
				int codigoTipoDespesa = Integer.parseInt(req.getParameter("codigoTipoDespesa"));
				int numero = Integer.parseInt(req.getParameter("codigoProcesso"));
				String data = req.getParameter("dataDespesa");
				double valor = Double.parseDouble(req.getParameter("valorDespesa"));
				String descricao = req.getParameter("descricao");
				
				LancaDespesa despesaAtualizada = new LancaDespesa(codigoLancamento, codigoTipoDespesa, numero, data, valor, descricao);
				
				
				int u = ldDAO.update(codigoLancamento, data, valor, descricao, c);
				
				req.setAttribute("mensagem", "Alterado");
				req.getRequestDispatcher("listaDespesa.jsp").forward(req, resp);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			break;
		
		case "alterarHonorario":
			try {
				int codigoLancamento = Integer.parseInt(req.getParameter("codigoLancamentoHonorario"));
				int codigoTipoTarefa = Integer.parseInt(req.getParameter("codigoTipoTarefa"));
				int numero = Integer.parseInt(req.getParameter("codigoProcesso"));
				String data = req.getParameter("dataHonorario");
				double quantHoras = Double.parseDouble(req.getParameter("quantidadeHora"));
				String descricao = req.getParameter("observacao");
				
				LancaHonorario honorarioAtualizado = new LancaHonorario(codigoLancamento, codigoTipoTarefa, numero, data, quantHoras, descricao);
				
				int u = lhDAO.update(codigoLancamento, data, quantHoras, descricao, c);
				
				req.setAttribute("mensagem", "Alterado");
				req.getRequestDispatcher("listaHonorario.jsp").forward(req, resp);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			break;
			
		case "lancarHonorario":
			
			try {
				int codigoTipoTarefa = Integer.parseInt(req.getParameter("codigoTipoTarefa"));
				int codigoProcesso = Integer.parseInt(req.getParameter("codigoProcesso"));
				String dataHonorario = req.getParameter("dataHonorario");
				double quantidadeHora = Double.parseDouble(req.getParameter("quantidadeHora"));
				String observacao = req.getParameter("observacao");
				
				LancaHonorario honorarioCriado = new LancaHonorario();
				honorarioCriado.setCodigoTipoTarefa(codigoTipoTarefa);
				honorarioCriado.setCodigoProcesso(codigoProcesso);
				honorarioCriado.setDataHonorario(dataHonorario);
				honorarioCriado.setQuantidadeHora(quantidadeHora);
				honorarioCriado.setObservacao(observacao);
				
				lhDAO.create(honorarioCriado, c);
                List<LancaHonorario> listaHonorario = lhDAO.readList(codigoProcesso, c);
				
                listaHonorario.add(honorarioCriado);
				req.setAttribute("chaveListaHonorario", listaHonorario);
				req.setAttribute("mensagem", "Gravado com sucesso");
				
				req.getRequestDispatcher("listaHonorario.jsp").forward(req, resp);

			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			break;
			
		case "lancarDespesa":
			
			try {
				int codigoTipoDespesa = Integer.parseInt(req.getParameter("codigoTipoDespesa"));
				int codigoProcesso = Integer.parseInt(req.getParameter("codigoProcesso"));
				String dataDespesa = req.getParameter("dataDespesa");
				double valorDespesa = Double.parseDouble(req.getParameter("valorDespesa"));
				String descricao = req.getParameter("descricao");
				
				LancaDespesa despesaCriada = new LancaDespesa();
				despesaCriada.setCodigoTipoDespesa(codigoTipoDespesa);
				despesaCriada.setNumero(codigoProcesso);
				despesaCriada.setDataDespesa(dataDespesa);
				despesaCriada.setValorDespesa(valorDespesa);
				despesaCriada.setDescricao(descricao);
				
				ldDAO.create(despesaCriada, c);
				
				List<LancaDespesa> listaDespesa = ldDAO.readList(codigoProcesso, c);
				listaDespesa.add(despesaCriada);
				
				req.setAttribute("mensagem", "Gravado com sucesso");
				req.setAttribute("chaveListaDespesa", listaDespesa);
				
				req.getRequestDispatcher("listaDespesa.jsp").forward(req, resp);

			}
			catch(Exception e) {
				e.printStackTrace();
			}
			break;
			
			
		case "excluirHonorario":
			
			try {
				int codigoLancamento = Integer.parseInt(req.getParameter("codigoLancamento"));
				
				lhDAO.delete(c, codigoLancamento);
				
				req.setAttribute("mensagem", "Excluído");
				
				req.getRequestDispatcher("listaHonorario.jsp").forward(req, resp);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			break;
			
		case "excluirDespesa":
			
			try {
				int codigoLancamento = Integer.parseInt(req.getParameter("codigoLancamento"));
				
				ldDAO.delete(codigoLancamento, c);
				
				req.setAttribute("mensagem", "Excluído");
				
				req.getRequestDispatcher("listaDespesa.jsp").forward(req, resp);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			break;
			
		default:
			break;
		}
	}
	
}