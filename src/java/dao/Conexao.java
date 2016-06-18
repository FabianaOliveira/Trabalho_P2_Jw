/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author CASA-PC
 */
public class Conexao {
    
    /** Define o drive utilizado, no caso o mysql.jdbc*/
    private String driver= "com.mysql.jdbc.Driver";
    /** define o endereço da base criada - netbeans - que contem as tabelas*/
    private String url="jdbc:mysql://localhost/netbeans";
    /** Usuario*/
    private String user="root";
    /** senha*/
    private String senha="123";
    private Connection conn;
    
    public Conexao()
    {
        try{
            Class.forName(driver);
 /** Realiza a conexão passando como parametros os dados ora preenchidos(url,user e senha) */
            conn=(Connection) DriverManager.getConnection(url, user, senha);
        }catch(Exception e)
        {
            e.printStackTrace();
            
        }
    }
    
    public Connection getConn()
    {
        /** retorna a conexão criada*/
        return conn;
    }
    
    /** Método para fechar a conexão*/
    public void fechaConexao()
    {
        try{
            conn.close();
        }catch(Exception e){
          e.printStackTrace();  
        }
    }
}
