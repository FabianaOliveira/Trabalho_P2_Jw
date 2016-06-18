/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 /**importa as classes do pacote modelo
 */ 
import modelo.Login;
import modelo.LoginRn;
/**
 *
 * @author CASA-PC
 */
@WebServlet(name = "LoginUser", urlPatterns = {"/LoginUser"})
public class LoginUser extends HttpServlet {

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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
              String mensagem = null;
            
             /** cria atributos que recebem as requisições */
            String login=  request.getParameter("login");
            String senha= request.getParameter("senha");
            
            /** instancia a classe login REGRA DE NEGÓCIO*/
            LoginRn rn= new LoginRn();
            
            /** cria uma variável para receber o resultado do método "login_senha"*/
            Boolean retorno = rn.loginSenha(login, senha);
            
            if (retorno.equals(true))
            {   
                /** Se a senha estiver correta, tela principal*/
                response.sendRedirect("Principal.jsp");
                
            }else
            {
                
                mensagem = "Usuário ou senha inválido(os)!";
                request.setAttribute("erro", mensagem);
                RequestDispatcher rd = request.getRequestDispatcher("/Login.jsp");
                rd.forward(request, response);
                  /** Senão , senha inválida
                  PrintWriter out = response.getWriter();
                  out.print("<html>");
                  out.print("<h2>Senha ou usuário inválido!</h2>");
                  out.print("<br>");
                  out.print("<a href='login.jsp'>Voltar</a>");
                 */
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
        processRequest(request, response);
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
        processRequest(request, response);
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
