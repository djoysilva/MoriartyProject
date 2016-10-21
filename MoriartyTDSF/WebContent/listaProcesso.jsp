<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista processo</title>
<%@ include file="includes.jsp"%>
</head>
<body>
	<%@ include file="menu.jsp"%>
	<div class="container">
		<h1>Lista de processos</h1>
		
		
		<table class="table">
			<tr>
				<th>Número</th>
				<th>Código advogado</th>
				<th>Código cliente</th>
				<th>Código causa</th>
				<th>Código fórum</th>
				<th>Descrição</th>
				<th>Data abertura</th>
				<th>Data fechamento</th>
				<th>Dia vencimento</th>
				<th>Resultado</th>
				<th>Situacao</th>
				<th>Observacao</th>
				<th></th>
				<th></th>
			</tr>
				<tr>
					<td>${chaveNumero.numero}</td>
					<td>${chaveNumero.codigoAdvogado}</td>
					<td>${chaveNumero.codigoCliente}</td>
					<td>${chaveNumero.codigoCausa}</td>
					<td>${chaveNumero.codigoForum}</td>
					<td>${chaveNumero.descricao}</td>
					<td>${chaveNumero.dataAbertura}</td>
					<td>${chaveNumero.dataFechamento}</td>
					<td>${chaveNumero.diaVencimento}</td>
					<td>${chaveNumero.resultado}</td>
					<td>${chaveNumero.situacao}</td>
					<td>${chaveNumero.observacao}</td>
					<td>
					 <c:url value = "buscaServlet" var = "linkLancarHonorario">
						<c:param name = "numeroProcessoRecebido" value = "${chaveNumero.numero}"/>
						<c:param name = "acao" value = "abrirFormHonorario"/>
					</c:url>
					<a href = "${linkLancarHonorario}" class = "btn btn-info btn-sm">Lançar Honorário</a>

					<c:url value = "buscaServlet" var = "linkConsultarHonorario">
						<c:param name = "numeroProcessoRecebido" value = "${chaveNumero.numero}"/>
						<c:param name = "acao" value = "abrirListaHonorario"/>
					</c:url>
					<a href = "${linkConsultarHonorario}" class = "btn btn-info btn-sm">Consultar Honorário</a>
					</td>
					<td>
					<c:url value = "buscaServlet" var = "linkLancarDespesa">
						<c:param name = "numeroProcessoRecebido" value = "${chaveNumero.numero}"/>
						<c:param name = "acao" value = "abrirFormDespesa"/>
				    </c:url>
				    <a href = "${linkLancarDespesa}" class = "btn btn-info btn-sm">Lançar Despesa</a>

				    <c:url value = "buscaServlet" var = "linkConsultarDespesa">
						<c:param name = "numeroProcessoRecebido" value = "${chaveNumero.numero}"/>
						<c:param name = "acao" value = "abrirListaDespesa"/>
					</c:url>
					<a href = "${linkConsultarDespesa}" class = "btn btn-info btn-sm">Consultar Despesa</a>
					</td>
				</tr>
		</table>
	</div>
</body>
</html>