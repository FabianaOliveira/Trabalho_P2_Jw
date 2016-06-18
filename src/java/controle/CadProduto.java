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
import modelo.Produto;
/**
 *
 * @author CASA-PC
 */
@WebServlet(name = "CadProduto", urlPatterns = {"/CadProduto"})
public class CadProduto extends HttpServlet {

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
        String mensagem= null;
         /** cria atributos que recebem as requisições */
        String descricao = request.getParameter("descricao");
        String marca = request.getParameter("marca");
        int quantidade = Integer.parseInt(request.getParameter("quantidade"));
        Float preco = Float.parseFloat(request.getParameter("preco"));
        
        /** instancia a classe produto */
        Produto produto = new Produto();
        
        /** lança as informações na classe produto através do método set */
        produto.setDescricao(descricao);
        produto.setMarca(marca);
        produto.setQuantidade(quantidade);
        produto.setPreco(preco);
        
        /** instancia a classe produto REGRA DE NEGÓCIO*/
        ProdutoRn produtorn = new ProdutoRn();
         
        /** cria uma variável para receber o resultado do método "cadastro_produto_dao"*/
        Boolean retorno = produtorn.cadastroProdutoDao(produto);
        
        /** Se cadastrou corretamente, retorna para a lista de produtos*/
        if (retorno.equals(true))
                {
                
                    response.sendRedirect("ListaProduto.jsp");
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
                /** Senão redireciona para tela de cadastro*/
             
             mensagem = "Erro ao Cadastrar o Produto!";
             request.setAttribute("erro", mensagem);
             RequestDispatcher rd = request.getRequestDispatcher("/CadProduto.jsp");
             rd.forward(request, response);
                 /** 
                  PrintWriter out = response.getWriter();
                  out.print("<html>");
                  out.print("<h2> Erro!</h2>");
                  out.print("</html>");
                  * */
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
