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
			<c:forEach var="processo" items="${chaveNumero}">
				<tr>
					<td>${processo.numero}</td>
					<td>${processo.codigoAdvogado}</td>
					<td>${processo.codigoCliente}</td>
					<td>${processo.codigoCausa}</td>
					<td>${processo.codigoForum}</td>
					<td>${processo.descricao}</td>
					<td>
					 <fmt:formatDate pattern = "dd/MM/yyyy" value="${processo.dataAbertura.time}"/>
					</td>
					<td>
					 <fmt:formatDate pattern = "dd/MM/yyyy" value="${processo.dataFechamento}"/>
					</td>
					<td>${processo.diaVencimento}</td>
					<td>${processo.resultado}</td>
					<td>${processo.situacao}</td>
					<td>${processo.observacao}</td>
					<td>
					 <c:url value="buscaServlet" var="linkHonorario">
						<c:param name="numeroProcesso" value="${processo.numero}"/>
						<c:param name="acao" value="abrirFormHonorario"/>
					</c:url>
					<a href="${link}" class="btn btn-info btn-sm">Alterar</a>
					</td>
					<td>
					<c:url value="buscaServlet" var="linkTarefa">
						<c:param name="numeroProcesso" value="${processo.numero}"/>
						<c:param name="acao" value="abrirFormDespesa"/>
				    </c:url>
				    <a href="${link}" class="btn btn-info btn-sm">Alterar</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>