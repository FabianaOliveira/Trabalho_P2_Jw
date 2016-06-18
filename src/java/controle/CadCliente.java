/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

/**
 importa as classes do pacote modelo
 */ 
import modelo.Cliente;
import modelo.ClienteRn;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author CASA-PC
 */
@WebServlet(name = "CadCliente", urlPatterns = {"/CadCliente"})
public class CadCliente extends HttpServlet {


    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        String mensagem =null;
        /** cria atributos que recebem as requisições */
        String nome = request.getParameter("nome");
        String cpf = request.getParameter("cpf");
        String endereco = request.getParameter("endereco");
        String bairro = request.getParameter("bairro");
        String cidade = request.getParameter("cidade");
        String cep = request.getParameter("cep");
        String telefone = request.getParameter("telefone");
        String celular = request.getParameter("celular");
        
        /** instancia a classe cliente */
        Cliente clnt = new Cliente();
        /** lança as informações na classe cliente através do método set */
        clnt.setNome(nome);
        clnt.setCpf(cpf);
        clnt.setEndereco(endereco);
        clnt.setBairro(bairro);
        clnt.setCidade(cidade);
        clnt.setCep(cep);
        clnt.setTelefone(telefone);
        clnt.setCelular(celular);
         
         /** instancia a classe cliente REGRA DE NEGÓCIO*/
         ClienteRn cliente = new ClienteRn();
         
         /** cria uma variável para receber o resultado do método "cadastro_cliente_dao"*/
         Boolean retorno = false;
         
         /** Verifica se o cliente já foi cadastrado"*/
         if (cliente.existeClienteDao(cpf)== false)
         {
             /** insere os dados na tabela cliente*/
            retorno = cliente.cadastroClienteDao(clnt);
         }
  
        /** Se cadastrou corretamente, retorna para a tela lista de clientes*/
        if (retorno.equals(true))
                {
                    response.sendRedirect("ListaCliente.jsp");
                    /**  
                  PrintWriter out = response.getWriter();
                  out.print("<html>");
                  out.print("<h2> Registro inserido com sucesso!</h2>");
                  out.print("<br>");
                  out.print("</html>");
                  */
                  
                }
        else
        {   
                /** Senão, redireciona oara a pagina cadastro de usuarioss
                response.sendRedirect("CadUsuario.jsp");
                 
                  PrintWriter out = response.getWriter();
                  out.print("<html>");
                  out.print("<h2> Erro!</h2>");
                  out.print("</html>");
                  */
                mensagem = "Erro ao Cadastrar o Cliente!";
                request.setAttribute("erro", mensagem);
                RequestDispatcher rd = request.getRequestDispatcher("/CadUsuario.jsp");
                rd.forward(request, response);
        }
       
    
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(CadCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(CadCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
