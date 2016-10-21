<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de honor�rios</title>
<%@ include file = "includes.jsp" %>
</head>
<body>
<%@ include file = "menu.jsp" %>
<div class = "container">
 <h1>Lista de honor�rios</h1>
 <c:if test="${not empty mensagem }">
		<div class="alert alert-danger">
			${mensagem}
		</div>
	   </c:if>
 
 <table class = "table">
  <tr>
 	<th>C�digo de lan�amento</th>
 	<th>C�digo Tipo Tarefa</th>
 	<th>N�mero do processo</th>
 	<th>Data do honor�rio</th>
 	<th>Quantidade de horas</th>
 	<th>Observa��o</th>
 	<th></th>
 	<th></th>
  </tr>
  <c:forEach var = "listaHonorario" items = "${chaveListaHonorario}">
   <tr>
    <td>${listaHonorario.codigoLancamento}</td>
    <td>${listaHonorario.codigoTipoTarefa}</td>
    <td>${listaHonorario.codigoProcesso}</td>
    <td>${listaHonorario.dataHonorario}</td>
    <td>${listaHonorario.quantidadeHora}</td>
    <td>${listaHonorario.observacao}</td>
    <td>
     <c:url value="buscaServlet" var="link">
						<c:param name="codigoLancamento" value="${listaHonorario.codigoLancamento}"/>
						<c:param name="numeroProcesso" value="${listaHonorario.codigoProcesso}"></c:param>
						<c:param name="acao" value="alterarHonorarioForm"/>
	 </c:url>
     <a href="${link}" class="btn btn-info btn-sm">Alterar</a>
    </td>
    <td>
     <button onclick="idCod.value = ${listaHonorario.codigoLancamento}" type="button" class="btn btn-danger btn-sm" data-toggle="modal" data-target="#myModal">
					  	Remover
	</button>
    </td>
   </tr>
  </c:forEach>
 </table>
 
 <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title" id="myModalLabel">Confirma��o</h4>
	      </div>
	      <div class="modal-body">
	        Voc� realmente deseja excluir o honor�rio?
	      </div>
	      <div class="modal-footer">
	      	<form action="buscaServlet" method="post">
	      		<input type="hidden" name="codigoLancamento" id="idCod">
	      		<input type="hidden" name="acao" value="excluirHonorario">
		        <button type="button" class="btn btn-default" data-dismiss="modal">N�o</button>
		        <button type="submit" class="btn btn-danger">Sim</button>
	        </form>
	      </div>
	    </div>
	  </div>
</div>
</body>
</html>