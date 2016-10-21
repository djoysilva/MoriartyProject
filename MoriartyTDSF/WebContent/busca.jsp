<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Busca</title>
<%@ include file = "includes.jsp" %>
</head>
<body>
<%@ include file = "menu.jsp" %>
<div class = "container">
 <h1>Buscar processo</h1>
 
 
 <div class = "col-md-6">
  <div class = "row">
  <form method = "get" action = "buscaServlet">
  <input type = "hidden" name = "acao" value = "listarProcesso">
   <div class = "form-group">
    <label>Número do processo:</label>
    <input type = "text" name = "numeroProcesso" class = "form-control">
   </div>
   <div class = "form-group">
    <input type = "submit" value = "Buscar" class = "btn btn-primary">
   </div>
  </form>
  </div>
 </div>
</div>
</body>
</html>