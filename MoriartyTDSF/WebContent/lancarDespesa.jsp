<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lançar despesa</title>
<%@ include file = "includes.jsp" %>
</head>
<body>
<%@ include file = "menu.jsp" %>
<div class = "container">
 <h1>Lançar despesa</h1>
 
 <div class = "col-md-6">
  <form action = "buscaServlet" method = "post">
  <input type = "hidden" name = "acao" value = "lancarDespesa">
   <div class = "form-group">
    <label for = "idCodDesp">Código Lançamento</label>
    <input type = "hidden" name = "codigoLancamentoDespesa" id = "idCodDesp" class = "form-control">
   </div>
   <div class = "form-group">
    <label for = "idCodTarefa">Código Tipo Despesa</label>
    <input type = "text" placeholder = "1, 2, 3, 4, 5 ou 6" name = "codigoTipoDespesa" id = "idCodTarefa" class = "form-control" >
   </div>
   <div class = "form-group">
    <label for = "idCodProcesso">Código Processo</label>
    <input type = "text" name = "codigoProcesso" id = "idCodProcesso" class = "form-control" value = "${chaveProcessoRecebido}" readonly >
   </div>
   <div class = "form-group">
    <label for = "idDataDespesa">Data Despesa</label>
    <input type = "text" name = "dataDespesa" id = "idDataDespesa" class = "form-control">
   </div>
   <div class = "form-group">
    <label for = "idValorDespesa">Valor despesa</label>
    <input type = "text" name = "valorDespesa" id = "idValorDespesa" class = "form-control">
   </div>
   <div class = "form-group">
   <label for = "idDescricao">Descrição</label>
   <input type = "text" name = "descricao" id = "idDescricao" class = "form-control">
   </div>
   <input type = "submit" value = "Lançar" class = "btn btn-primary">
  </form>
 </div>
</div>
</body>
</html>