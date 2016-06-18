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
import modelo.ProdutoRn;

/**
 *
 * @author CASA-PC
 */
@WebServlet(name = "ExcluirProduto", urlPatterns = {"/ExcluirProduto"})
public class ExcluirProduto extends HttpServlet {

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
        String mensagem= null;
        /** cria atributo que recebe a requisição */
        int id = Integer.parseInt(request.getParameter("id"));
        
         /** instancia a classe login REGRA DE NEGÓCIO*/
        ProdutoRn produtorn = new ProdutoRn();
        
        /** cria uma variável para receber o resultado do método "excluir_produto_dao"*/
        boolean retorno= produtorn.excluirProdutoDao(id);
        
        /** Se excluiu corretamente, retorna para a lista de produtos*/
        if (retorno ==true)
        {
            response.sendRedirect("ListaProduto.jsp");
        }else
        {
             /** Senão mensagem de erro
            PrintWriter out = response.getWriter();
            out.print("<html>");
            out.print("<h2>Erro ao excluir o registro!!</h2>");
            out.print("<br>");
            out.print("<a href='listaproduto.jsp'>Voltar</a>");
            out.print("</html>");  
            * */
                mensagem = "Erro ao excluir o registro!!!";
                request.setAttribute("erro", mensagem);
                RequestDispatcher rd = request.getRequestDispatcher("/ExcluirProduto.jsp");
                rd.forward(request, response);
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
