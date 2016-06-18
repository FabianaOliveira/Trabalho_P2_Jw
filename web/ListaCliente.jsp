<%-- 
    Document   : inicio
    Created on : 26/05/2016, 14:14:43
    Author     : CASA-PC
--%>

<%@page language="java" contentType="text/html; charset=UTF-8" 
 pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<%@page import="modelo.ClienteRn"%>
<%@page import="java.util.List"%>
<%@page import="modelo.Cliente"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CLIENTES</title>    
    </head>
    <body background="http://vivisaludable.com/wp-content/uploads/2014/08/como-elegir-perfume.jpg">
        <center>     
            <c:import url="Cabecalho.jsp" />
            <h1>Lista de Clientes</h1>
            
        </center>
        
        <%
            ClienteRn clientern = new ClienteRn();
            %>
            <center>   
                
            <table border="1">
              
                <tr>
                    <td bgcolor="#e0e0e0" size="30">ID</td>
                    <td bgcolor="#e0e0e0" size="30">Nome</td>
                    <td bgcolor="#e0e0e0" size="20">CPF</td>
                    <td bgcolor="#e0e0e0" size="60">Endereço</td>
                    <td bgcolor="#e0e0e0" size="30">Bairro</td>
                    <td bgcolor="#e0e0e0" size="30">Cidade</td>
                    <td bgcolor="#e0e0e0">Cep</td>
                    <td bgcolor="#e0e0e0">Telefone</td>
                    <td bgcolor="#e0e0e0">Celular</td>
                    <td colspan=1 bgcolor="#e0e0e0">Action</td>
                </tr>
                
                    <%

                        List<Cliente> clnt = clientern.listar();

                        for (Cliente cliente : clnt ) {
                        %>
                        <tr>

                        <td bgcolor="#f0f0f0"><%=cliente.getId()%></td>
                        <td bgcolor="#f0f0f0"><%=cliente.getNome()%></td>
                        <td bgcolor="#f0f0f0"><%=cliente.getCpf()%></td>
                        <td bgcolor="#f0f0f0"><%=cliente.getEndereco()%></td>
                        <td bgcolor="#f0f0f0"><%=cliente.getBairro()%></td>
                        <td bgcolor="#f0f0f0"><%=cliente.getCidade()%></td>
                        <td bgcolor="#f0f0f0"><%=cliente.getCep()%></td>
                        <td bgcolor="#f0f0f0"><%=cliente.getTelefone()%></td>
                        <td bgcolor="#f0f0f0"><%=cliente.getCelular()%></td>
                            

                        <td bgcolor="#f0f0f0"><a href="ExcluirCliente.jsp?id=<%=cliente.getId()%>">Excluir</a> </td>
                            
                        </tr>
                        <%
                        }
                    %>
                </table>
                
                <a href="Principal.jsp">Voltar</a>
                
            </center>
        
    </body>
</html>
