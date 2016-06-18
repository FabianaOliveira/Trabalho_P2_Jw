/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import modelo.Login;
import util.JavaWebException;

/**
 *
 * @author CASA-PC
 */
public interface LoginDaoInterface {
    
    public boolean acesso(String usuario,String senha) throws Exception;
    public Boolean cadastrarLogin(Login login) throws Exception;
}
