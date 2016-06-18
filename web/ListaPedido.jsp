<%-- 
    Document   : ListaPedido
    Created on : 17/06/2016, 22:11:17
    Author     : CASA-PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<%@page import="modelo.PedidoRn"%>
<%@page import="java.util.List"%>
<%@page import="modelo.Pedido"%>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pedido</title>
    </head>
    <body background="http://vivisaludable.com/wp-content/uploads/2014/08/como-elegir-perfume.jpg">
       <center>     
            <h1>Lista de Pedidos</h1>
        </center>
       
        <center>
            <form name="listapedido" method="post">
                <table border="1">

                        <tr>
                            <td class="produto" bgcolor="#e0e0e0" size="50">ID</td>
                            <td class="produto" bgcolor="#e0e0e0" size="50">Nome</td>
                            <td class="produto" bgcolor="#e0e0e0" size="30">CPF</td>
                            <td class="produto" bgcolor="#e0e0e0" size="8">Produto</td>
                            <td class="produto"  bgcolor="#e0e0e0" size="15">Valor</td>
                        </tr>
                            

                            <%
                                
                            PedidoRn pedidorn = new PedidoRn();
                            List<Pedido> pedido = pedidorn.listar();

                            for (Pedido pedidos : pedido ) {
                            %>
                            <tr>

                            <c:if test="${not pedidos.getId()}"> <td class="produto" bgcolor="#f0f0f0"><%=pedidos.getId()%></td> </c:if>
                            <c:if test="${not pedidos.getNome()}"><td class="produto" bgcolor="#f0f0f0"><%=pedidos.getNome()%></td></c:if>
                            <c:if test="${not pedidos.getCpf()}"><td class="produto" bgcolor="#f0f0f0"><%=pedidos.getCpf()%></td></c:if>
                            <c:if test="${not pedidos.getProduto()}"><td class="produto" bgcolor="#f0f0f0"><%=pedidos.getProduto() %></td></c:if>
                            <c:if test="${not pedidos.getValor()}"><td class="produto" bgcolor="#f0f0f0"><%=pedidos.getValor() %></td></c:if>
                            
                            </tr>
                            <%
                            }
                        %>

                </table>
            </form>
                    <a href="Principal.jsp">Voltar</a>
        </center>
    </body>
</html>
