<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alterar despesa</title>
<%@ include file = "includes.jsp" %>
</head>
<body>
<%@ include file = "menu.jsp" %>
<div class = "container">
 <h1>Alterar despesa</h1>
 
 <div class = "col-md-6">
  <form action = "buscaServlet" method = "post">
  <input type = "hidden" name = "acao" value = "alterarDespesa">
   <div class = "form-group">
    <label for = "idCodDesp">C�digo Lan�amento</label>
    <input type = "text" name = "codigoLancamentoDespesa" id = "idCodDesp" class = "form-control" value = "${chaveDespesaAlterada.codigoLancamento}" readonly>
   </div>
   <div class = "form-group">
    <label for = "idCodTarefa">C�digo Tipo Despesa</label>
    <input type = "text" name = "codigoTipoDespesa" id = "idCodTarefa" class = "form-control" value = "${chaveDespesaAlterada.codigoTipoDespesa}" >
   </div>
   <div class = "form-group">
    <label for = "idCodProcesso">C�digo Processo</label>
    <input type = "text" name = "codigoProcesso" id = "idCodProcesso" class = "form-control" value = "${chaveDespesaAlterada.numero}" readonly >
   </div>
   <div class = "form-group">
    <label for = "idDataDespesa">Data Despesa/label>
    <input type = "text" name = "dataDespesa" id = "idDataDespesa" class = "form-control" value = "${chaveDespesaAlterada.dataDespesa}" >
   </div>
   <div class = "form-group">
    <label for = "idValorDespesa">Valor despesa</label>
    <input type = "text" name = "valorDespesa" id = "idValorDespesa" class = "form-control" value = "${chaveDespesaAlterada.valorDespesa}" >
   </div>
   <div class = "form-group">
   <label for = "idDescricao">Descri��o</label>
   <input type = "text" name = "descricao" id = "idDescricao" class = "form-control" value = "${chaveDespesaAlterada.descricao}" >
   </div>
   <input type = "submit" value = "Alterar" class = "btn btn-primary">
  </form>
 </div>
</div>
</body>
</html>