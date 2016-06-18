<%-- 
    Document   : principal
    Created on : 28/05/2016, 10:35:28
    Author     : CASA-PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PERFUMES</title>
        <link rel="stylesheet" type="text/css" href="aj.css" />
    </head>
    <body background="http://vivisaludable.com/wp-content/uploads/2014/08/como-elegir-perfume.jpg">
        
      <center>
         <h1>MENU PRINCIPAL</h1>
      </center>  
            <ul class="menu">
            <li><a href="#">Clientes</a>
                <ul>
                    <li><a href="ListaCliente.jsp">Listar</a></li>
                    <li><a href="CadUsuario.jsp">Cadastrar</a></li>
                </ul>
            </li>
            <li><a href="#">Produto</a>
                <ul>
                    <li><a href="ListaProduto.jsp">Listar</a></li>
                    <li><a href="CadProduto.jsp">Cadastrar</a></li>
                </ul>
            </li>
            <li><a href="#">Pedido</a>
                <ul>
                    <li><a href="ListaPedido.jsp">Listar</a></li>
                </ul>
            </li>
            <li><a href="Login.jsp">Login</a>
                <ul>
                    <li><a href="CadLogin.jsp">Cadastrar</a></li>
                </ul>
            </li>
            
    </body>
</html>
