<%-- 
    Document   : login
    Created on : 26/05/2016, 16:22:43
    Author     : CASA-PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PERFUMES</title>
    </head>
    <body background="http://vivisaludable.com/wp-content/uploads/2014/08/como-elegir-perfume.jpg">
         
        <c:set var="sentence" value="SEJA BEM VINDO A FABI.COM!" />
        
        <center>     
            <h1> <c:out value="${sentence}" /> </h1>
            <br>
            <br>
            <form method="post" action="validaLogin.do">
                <table border="1" rules="all">
                    <tr>
                        <td bgcolor="#e0e0e0">Usuário: <input type="text" name="login" ></td>
                        <td bgcolor="#e0e0e0">Senha:   <input type="password" name="senha" value=""></td>
                    </tr>
                </table>
                <br>
                <p><input  type="submit" value="Fazer Login"></p>
                ${erro}
            </form>
              
        </center>
    </body>
</html>
