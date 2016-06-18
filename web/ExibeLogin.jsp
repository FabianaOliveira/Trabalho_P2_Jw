<%-- 
    Document   : exibelogin
    Created on : 11/06/2016, 17:42:56
    Author     : CASA-PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LOGIN</title>
    </head>
    <body background="http://vivisaludable.com/wp-content/uploads/2014/08/como-elegir-perfume.jpg">
    <center>
       <c:import url="Cabecalho.jsp" />
        <p> <b> CONFIRMAR CADASTRO </b><br/><br/>
        
        <form name="exibelogin" action="exibelogin.do" method="post">
            <table border="0" bgcolor="#e0e0e0">

                    <tr> <td bgcolor="#e0e0e0"> Usuario </td> <td bgcolor="#e0e0e0"> <input type="text"  name="usuario" size="30" value="${param.usuario}"/>  </td></tr>
                    <tr> <td bgcolor="#e0e0e0"> Senha </td> <td bgcolor="#e0e0e0"> <input type="text"  name="senha" size="30" value="${param.senha}"/> </td></tr>
                    
                    <tr> <td> <input type="submit" value="Confirmar"/> </td></tr>
                    
            </table>
            <a href="Principal.jsp">Cancelar</a>
        </form>   
       </center>
    </body>
</html>
