<%-- 
    Document   : exibecliente
    Created on : 11/06/2016, 17:19:09
    Author     : CASA-PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CLIENTE</title>
    </head>
    <body background="http://vivisaludable.com/wp-content/uploads/2014/08/como-elegir-perfume.jpg">
          <center>
        <c:import url="Cabecalho.jsp" />
        <p> <b> CONFIRMAR CADASTRO </b><br/><br/>
        
        <form name="exibecliente" action="exibecliente.do" method="post">
            <table border="0" bgcolor="#e0e0e0">

                    <tr> <td bgcolor="#e0e0e0"> Nome </td> <td bgcolor="#e0e0e0"> <input type="text"  name="nome" size="30" value="${param.nome}"/>  </td></tr>
                    <tr> <td bgcolor="#e0e0e0"> CPF </td> <td bgcolor="#e0e0e0"> <input type="text"  name="cpf" size="30" value="${param.cpf}"/> </td></tr>
                    <tr> <td bgcolor="#e0e0e0"> Endereço </td> <td> <input type="text"  name="endereco" size="30" value="${param.endereco}"/></td></tr>
                    <tr> <td bgcolor="#e0e0e0"> Bairro </td> <td bgcolor="#e0e0e0"> <input type="text" name="bairro" size="30" value="${param.bairro}"/> </td></tr>
                    <tr> <td bgcolor="#e0e0e0"> Cidade </td> <td bgcolor="#e0e0e0"> <input type="text"  name="cidade" size="30" value="${param.cidade}"/>  </td></tr>
                    <tr> <td bgcolor="#e0e0e0"> Cep </td> <td bgcolor="#e0e0e0"> <input type="text"  name="cep" size="30" value="${param.cep}"/> </td></tr>
                    <tr> <td bgcolor="#e0e0e0"> Telefone </td> <td bgcolor="#e0e0e0"> <input type="text"  name="telefone" size="30" value="${param.telefone}"/></td></tr>
                    <tr> <td bgcolor="#e0e0e0"> Celular </td> <td bgcolor="#e0e0e0"> <input type="text" name="celular" size="30" value="${param.celular}"/> </td></tr>

                    <tr> <td> <input type="submit" value="Confirmar"/> </td></tr>
                    
            </table>
            <a href="Principal.jsp">Cancelar</a>
        </form>   
       </center>
    </body>
</html>
