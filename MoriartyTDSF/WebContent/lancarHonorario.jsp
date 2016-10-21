<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lançar honorário</title>
<%@ include file = "includes.jsp" %>
</head>
<body>
<%@ include file = "menu.jsp" %>
<div class = "container">
 <h1>Lançar honorário</h1>
 
 <div class = "col-md-6">
  <form action = "buscaServlet" method = "post">
  <input type = "hidden" name = "acao" value = "lancarHonorario">
   <div class = "form-group">
    
    <input type = "hidden" name = "codigoLancamentoHonorario" id = "idCodHon" class = "form-control">
   </div>
   <div class = "form-group">
    <label for = "idCodTarefa">Código Tipo Tarefa</label>
    <input type = "text" placeholder = "1, 2, 3 ou 4" name = "codigoTipoTarefa" id = "idCodTarefa" class = "form-control">
   </div>
   <div class = "form-group">
    <label for = "idCodProcesso">Código Processo</label>
    <input type = "text" name = "codigoProcesso" id = "idCodProcesso" class = "form-control" value = "${chaveProcessoRecebido}" readonly>
   </div>
   <div class = "form-group">
    <label for = "idDataHonorario">Data Honorário</label>
    <input type = "text" name = "dataHonorario" id = "idDataHonorario" class = "form-control">
   </div>
   <div class = "form-group">
    <label for = "idQuantHora">Quantidade Horas</label>
    <input type = "text" name = "quantidadeHora" id = "idQuantHora" class = "form-control">
   </div>
   <div class = "form-group">
   <label for = "idObs">Observação</label>
   <input type = "text" name = "observacao" id = "idObs" class = "form-control">
   </div>
   <input type = "submit" value = "Lançar" class = "btn btn-primary">
  </form>
 </div>
</div>
</body>
</html>