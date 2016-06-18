<%-- 
    Document   : listaproduto
    Created on : 28/05/2016, 22:33:07
    Author     : CASA-PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<%@page import="modelo.ProdutoRn"%>
<%@page import="java.util.List"%>
<%@page import="modelo.Produto"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PRODUTOS</title>
    </head>
    <body background="http://vivisaludable.com/wp-content/uploads/2014/08/como-elegir-perfume.jpg">
        <center>     
            <c:import url="Cabecalho.jsp" />
            <h1>Lista de Produtos</h1>
        </center>
        
        <%
        ProdutoRn produtorn = new ProdutoRn();
        %>
        
        <center>
            <form name="listaexcluirproduto" method="post" action="excluirproduto.jsp">
                <table border="1">

                        <tr>
                            <td class="produto" bgcolor="#e0e0e0" size="50">ID</td>
                            <td class="produto" bgcolor="#e0e0e0" size="50">Descrição</td>
                            <td class="produto" bgcolor="#e0e0e0" size="30">Marca</td>
                            <td class="produto" bgcolor="#e0e0e0" size="8">Quantidade</td>
                            <td class="produto"  bgcolor="#e0e0e0" size="15">Preço</td>
                            <td class="produto" bgcolor="#e0e0e0" colspan=1>Action</td>
                        </tr>


                        <jsp:useBean id="xdao" class="modelo.ProdutoRn"/>

                         <%

                            List<Produto> produto = produtorn.listar();

                            for (Produto produtos : produto ) {
                            %>
                            <tr>

                            <c:if test="${not produtos.getId()}"> <td class="produto" bgcolor="#f0f0f0"><%=produtos.getId()%></td> </c:if>
                            <c:if test="${not produtos.getDescricao()}"><td class="produto" bgcolor="#f0f0f0"><%=produtos.getDescricao()%></td></c:if>
                            <c:if test="${not produtos.getMarca()}"><td class="produto" bgcolor="#f0f0f0"><%=produtos.getMarca() %></td></c:if>
                            <c:if test="${not produtos.getQuantidade()}"><td class="produto" bgcolor="#f0f0f0"><%=produtos.getQuantidade() %></td></c:if>
                            <c:if test="${not produtos.getPreco()}"><td class="produto" bgcolor="#f0f0f0"><%=produtos.getPreco() %></td></c:if>
                            
                            <td bgcolor="#f0f0f0"><a href="ExcluirProduto.jsp?id=<%=produtos.getId()%>">Excluir</a> </td>

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
