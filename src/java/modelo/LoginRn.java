/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import dao.LoginDao;
/**
 *
 * @author CASA-PC
 */
public class LoginRn {
    
     public Boolean loginSenha(String usuario, String senha)
     {
        Boolean retorno=false;
        LoginDao dao= new LoginDao();

        retorno = dao.acesso(usuario, senha);
        
        return retorno;
     }
     
     public Boolean cadstrarLoginDao(Login login)
     {
         Boolean retorno=false;
         LoginDao dao= new LoginDao();
         
         if (login.getNome()=="" || login.getSenha()=="")
         {
             retorno=false;
         }
         else
         {
            retorno=dao.cadastrarLogin(login);
         }
         return retorno;
     }
     
 
}
