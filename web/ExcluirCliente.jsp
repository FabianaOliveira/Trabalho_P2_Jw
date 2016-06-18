<%-- 
    Document   : excluircliente
    Created on : 30/05/2016, 21:41:11
    Author     : CASA-PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CLIENTES</title>
    </head>
    <body background="http://vivisaludable.com/wp-content/uploads/2014/08/como-elegir-perfume.jpg">

        <center>
            <c:import url="Cabecalho.jsp" />
            <p> <b> EXCLUSÃO DE CLIENTES </b><br/><br/>
                
            <form action="excluircliente.do" method="Post">
                <p>Confirma Exclusão do Cliente?</p>
                <input type="hidden" name="id" value="<%=Integer.parseInt(request.getParameter("id"))%>">
                <input type="submit" value="remover"> 
            </form>
            <a href="ListaCliente.jsp">Voltar</a>
            ${erro}
        </center>
    </body>
</html>
