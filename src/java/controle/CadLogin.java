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
/**
 importa as classes do pacote modelo
 */ 
import modelo.LoginRn;
import modelo.Login;

/**
 *
 * @author CASA-PC
 */
@WebServlet(name = "CadLogin", urlPatterns = {"/CadLogin"})
public class CadLogin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * try (PrintWriter out = response.getWriter()) {
            TODO output your page here. You may use following sample code. 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CadLogin</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CadLogin at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        /** cria atributos que recebem as requisições */
        String login = request.getParameter("usuario");
        String senha = request.getParameter("senha");
        String mensagem=null;
        /** instancia a classe login */
        Login log = new Login();
        
        /** lança as informações na classe login através do método set */
        log.setNome(login);
        log.setSenha(senha);
        
        /** instancia a classe login REGRA DE NEGÓCIO*/
        LoginRn loginrn = new LoginRn();
        
         /** cria uma variável para receber o resultado do método "cadstrar_login_dao"*/
        Boolean retorno = loginrn.cadstrarLoginDao(log);
        
        /** Se cadastrou corretamente, retorna para a tela principal*/
        if (retorno.equals(true))
                {
                
                    response.sendRedirect("Principal.jsp");
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
                 
                mensagem = "Erro ao Cadastrar o Login!";
                request.setAttribute("erro", mensagem);
                RequestDispatcher rd = request.getRequestDispatcher("/CadLogin.jsp");
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
