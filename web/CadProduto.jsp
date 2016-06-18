<%-- 
    Document   : cadproduto
    Created on : 28/05/2016, 22:27:59
    Author     : CASA-PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PRODUTOS</title>
    </head>
    <body background="http://vivisaludable.com/wp-content/uploads/2014/08/como-elegir-perfume.jpg">
        <!-- JavaScript -->
       
<!-- FAZ UMA REQUISIÇÃO, ATRAVÉS NO MÉTODO POST, AO SERVIDOR PARA INCLUSÃO DE DADOS -->
<script language="javascript" type="text/javascript">
	function validar() {
                var quantidade = produto.quantidade.value;
                var preco = produto.preco.value;
		var desc = produto.descricao.value;
                var marca = produto.marca.value;
                
                <!-- SE A QUANTIDADE NÃO FOR NUMÉRICA OU VAZIO OU IGUAL A ZERO -->
                <!-- RETORNA FALSE E EXIBE UMA MENSAGEM -->
                
                if (isNaN(quantidade) || (quantidade === "") || (quantidade===0))
                {   
                    produto.quantidade.value =0;
                    if (isNaN(preco) || (preco === "") || (preco===0))
                    {
                        produto.preco.value=0;
                    }
                    alert('Quantidade inválida!');
                    return false;
                }
                
                if (isNaN(preco) || (preco === "") || (preco===0))
                {
                    produto.preco.value=0;
                    alert('Preço inválido!');
                    return false;
                }
                
    <!-- SE O CAMPO ESTIVER VAZIO, RETORNA FALSO E EXIBE UMA MENSAGEM -->
               
                if (desc === "") {
			alert('Preencha o campo descrição!');
		
			return false;
                }
                if (marca === "") {
			alert('Preencha o campo marca!');
		
			return false;
                }
    }
    </script>
    
        <center>
        <c:import url="Cabecalho.jsp" />
        <p> <b> CADASTRO DE PRODUTOS </b><br/><br/>
  
  <!-- FAZ UMA REQUISIÇÃO, ATRAVÉS NO MÉTODO POST, AO SERVIDOR PARA INCLUSÃO DE DADOS -->
         
        <!-- DEFINE O FORMULÁRIO QUE SERÁ PROCESSADO NO SERVLET -->
        <form method="post" action="ExibeProduto.jsp" name="produto">
            <table border="0">
                <tr> <td> Descrição </td> <td> <input type="text" name="descricao" size="30"/> </td></tr>
                <tr> <td> Marca </td> <td> <input type="text" name="marca" size="15"/> </td></tr>
                <tr> <td> Quantidade </td> <td> <input type="text" name="quantidade" size="15"/>
                </td></tr>
                <tr> <td> Preço </td> <td> <input type="text" name="preco" size="5"/> </td></tr>
                 <!-- validar: função java script que valida os dados -->
                 <tr> <td> <input type="submit" value="Continuar" onclick="validar()"/> </td></tr>
             </table>
            
        </form>
        ${erro}
        <br>
        <a href="Principal.jsp">Voltar</a>
    </center>

    </body>
</html>
