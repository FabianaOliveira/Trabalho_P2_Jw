<%-- 
    Document   : exibeproduto
    Created on : 11/06/2016, 15:54:06
    Author     : CASA-PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PRODUTO</title>
    </head>
    <body background="http://vivisaludable.com/wp-content/uploads/2014/08/como-elegir-perfume.jpg">
       <center>
        <c:import url="Cabecalho.jsp" />
        <p> <b> CONFIRMAR CADASTRO </b><br/><br/>
        
        <form name="exibeproduto" action="exibeproduto.do" method="post">
            <table border="0" bgcolor="#e0e0e0">

                    <tr> <td bgcolor="#e0e0e0"> Descrição </td> <td bgcolor="#e0e0e0"> <input type="text"  name="descricao" size="30" value="${param.descricao}"/>  </td></tr>
                    <tr> <td bgcolor="#e0e0e0"> Marca </td> <td bgcolor="#e0e0e0"> <input type="text"  name="marca" size="30" value="${param.marca}"/> </td></tr>
                    <tr> <td bgcolor="#e0e0e0"> Quantidade </td> <td> <input type="text"  name="quantidade" size="30" value="${param.quantidade}"/>
                    </td></tr>
                    <tr> <td bgcolor="#e0e0e0"> Preço </td> <td bgcolor="#e0e0e0"> <input type="text" name="preco" size="30" value="${param.preco}"/> </td></tr>

                    <tr> <td> <input type="submit" value="Confirmar"/> </td></tr>
                    
            </table>
            <a href="Principal.jsp">Cancelar</a>
        </form>   
       </center>
    </body>
</html>
