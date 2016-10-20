<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alterar processo</title>
<%@ include file = "includes.jsp" %>
</head>
<body>
<%@ include file = "menu.jsp" %>
<div class = "container">
 <h1>Cadastro de processo</h1>
 
 <div class = "col-md-6">
  <form action = "processoServlet" method = "post">
  <input type = "hidden" name = "acao" value = "cadastrar">
   <div class = "form-group">
    <label for = "idNumero">Número</label>
    <input type = "text" name = "numeroProcesso" id = "idNumero" class = "form-control" value = "${chaveNumero.numero}"readonly>
   </div>
   <div class = "form-group">
    <label for = "idDescricao">Descrição</label>
    <input type = "text" name = "descricao" id = "idDescricao" class = "form-control">
   </div>
   <div class = "form-group">
    <label for = "idDataAbertura">Data de abertura</label>
    <input type = "text" name = "dataAbertura" id = "idDataAbertura" class = "form-control">
   </div>
   <div class = "form-group">
    <label for = "idDataFechamento">Data de fechamento</label>
    <input type = "text" name = "dataFechamento" id = "idDataFechamento" class = "form-control">
   </div>
   <div class = "form-group">
    <label for = "idDiaVencimento">Dia do vencimento</label>
    <input type = "text" name = "diaVencimento" id = "idDiaVencimento" class = "form-control">
   </div>
   <div class = "form-group">
   <label for = "idResultado">Resultado da causa</label>
   <input type = "text" placeholder = "Ganha ou Perdida" name = "resultado" id = "idResultado" class = "form-control">
   </div>
   <div class = "form-group">
    <label for = "idObservacao">Observações</label>
    <textarea rows = 5 name = "observacao" class = "form-control"></textarea>
   </div>
   <div class = "form-group">
    <label for = "idSituacao">Situação</label>
    <input type = "text" placeholder = "Bloqueado ou Liberado" name = "situacao" id = "idSituacao" class = "form-control">
   </div>
   <input type = "submit" value = "Alterar" class = "btn btn-primary">
  </form>
 </div>
</div>
</body>
</html>