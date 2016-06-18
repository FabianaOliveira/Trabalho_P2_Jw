/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/** Importa a classe modelo*/
import modelo.Login;

/**
 *
 * @author CASA-PC
 */
public class LoginDao implements LoginDaoInterface{
    
    
    /** cria o método para verificar se o usuario tem permissão*/
    public boolean acesso(String usuario,String senha)
    {   
         /** instãncia o método conexão para se conectar com a base*/
        Conexao conn = new Conexao();
        Boolean retorno=false;
        try{
            /** instãncia o método Statement para realizar a consulta*/
            Statement stmt = (Statement) conn.getConn().createStatement();
            ResultSet rs = stmt.executeQuery("select * from login where usuario='" + usuario + "' and senha='" + senha + "'");
            
            /** Se existir, senha correta*/
            if (rs.next())
            {
                retorno=true;
            }
     
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        finally{
            conn.fechaConexao();
        }
        return retorno;
    }
    
    /** cria o método para cadastrar um novo usuario senha*/
    public Boolean cadastrarLogin(Login login)
    {
        Boolean retorno = false;
        String sql;
        /** instãncia o método conexão para se conectar com a base*/
        Conexao conn = new Conexao();
        try{
            /** instãncia o método Statement para realizar a consulta*/
            Statement stmt = (Statement) conn.getConn().createStatement();
            
            sql ="insert into login(usuario,senha)values('";
            sql = sql + login.getNome()+ "','";
            sql = sql + login.getSenha() + "')";
            stmt.execute(sql);
            
            retorno = true;
            
        }catch(Exception e){
            e.fillInStackTrace();
        }finally{
            conn.fechaConexao();
        }
        
        return retorno;

    }

 
}
