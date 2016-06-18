<%-- 
    Document   : CadUsuario
    Created on : 27/05/2016, 20:35:50
    Author     : CASA-PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CLIENTES</title>
    </head>
    <body background="http://vivisaludable.com/wp-content/uploads/2014/08/como-elegir-perfume.jpg">
        
         <!-- JavaScript -->
          <!-- CRIA UMA FUNÇÃO PARA VALIDAR O FORMULÁRIO -->
<script language="javascript" type="text/javascript">
	function validar() {
                var nome = cliente.nome.value;
                var cpf = cliente.cpf.value;
		var endereco = cliente.endereco.value;
                var bairro = cliente.bairro.value;
                var cidade = cliente.cidade.value;
                var cep = cliente.cep.value;
                var telefone = cliente.telefone.value;
                
                 <!-- SE OS DADOS ESTIVEREM VAZIOS, RETORNA FALSO E EXIBE UMA MENSAGEM -->
                if (nome === "") {
			alert('Preencha o campo nome!');
		
			return false;
                }
                if (cpf === "") {
			alert('Preencha o campo cpf!');
		
			return false;
                }
                if (endereco === "") {
			alert('Preencha o campo endereco!');
		
			return false;
                }
                if (bairro === "") {
			alert('Preencha o campo bairro!');
		
			return false;
                }
                
                 if (cidade === "") {
			alert('Preencha o campo cidade!');
		
			return false;
                }
                if (cep === "") {
			alert('Preencha o campo cep!');
		
			return false;
                }
                if (telefone === "") {
			alert('Preencha o campo telefone!');
		
			return false;
                }
    }
    </script>

    <center>
         <!-- DEFINE UM CABEÇALHO PADRÃO ATRAVES DE UMA TAG JSTL  -->
        <c:import url="Cabecalho.jsp" />
        <p> <b> CADASTRO DE CLIENTES </b><br/><br/>
        
       <!-- FAZ UMA REQUISIÇÃO, ATRAVÉS NO MÉTODO POST, AO SERVIDOR PARA INCLUSÃO DE DADOS -->
       
       <!-- DEFINE O FORMULÁRIO QUE SERÁ PROCESSADO NO SERVLET -->
        <form method="post" action="ExibeCliente.jsp" name="cliente">
            <table border="0">
                <tr> <td> Nome </td> <td> <input type="text" name="nome" size="50"/> </td></tr>
                <tr> <td> CPF </td> <td> <input type="text" name="cpf" size="30"/> </td></tr>
                <tr> <td> Endereço </td> <td> <input type="text" name="endereco" size="80"/>
                </td></tr>
                <tr> <td> Bairro </td> <td> <input type="text" name="bairro" size="30"/> </td></tr>
                <tr> <td> Cidade </td> <td> <input type="text" name="cidade" size="30"/> </td></tr>
                <tr> <td> CEP </td> <td> <input type="text" name="cep" size="30"/> </td></tr>
                <tr> <td> Telefone </td> <td> <input type="text" name="telefone" size="30"/>
                </td></tr>
                <tr> <td> Celular </td> <td> <input type="text" name="celular" size="30"/> </td></tr>
                <!-- validar: função java script que valida os dados -->
                <tr> <td> <input type="submit" value="Confirmar" onclick="validar()"/> </td></tr>
             </table>
            
        </form>
         ${erro}
        <br>
        <a href="Principal.jsp">Voltar</a>
    </center>
    
    </body>
</html>
