/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import modelo.Cliente;

/**
 *
 * @author CASA-PC
 */
/** tornei uma classe abstrata para implementar a interface */
public class ClienteDao  implements ClienteDaoInterface{
    
    /** cria o método para inserir os dados na tabela cliente*/
    public boolean inserir(Cliente clnt)
    {
        Boolean retorno= false;
        String sql;
        /** instãncia o método conexão para se conectar com a base*/
        Conexao conn= new Conexao();
        
        try{
            
            /** instãncia o método Statement para realizar a inserção*/
            Statement stmt = (Statement) conn.getConn().createStatement();
  
            sql="insert into cliente (nome,cpf,endereco,bairro,cidade,cep,telefone,celular)";
            sql = sql + "values('" + clnt.getNome() + "','";
            sql = sql + clnt.getCpf() + "','";
            sql = sql + clnt.getEndereco() + "','";
            sql = sql + clnt.getBairro()+ "','";
            sql = sql + clnt.getCidade() + "','";
            sql = sql + clnt.getCep()+ "','";
            sql = sql + clnt.getTelefone() + "','";
            sql = sql + clnt.getCelular() + "')";
            
            /** executa a inserção*/
            stmt.execute(sql);
            retorno= true;
            
        }catch(Exception e)
        {
            e.printStackTrace();;
        }finally{
            conn.fechaConexao();
        }
        
        return retorno;
    }
    
    /** cria o método listar para listar os clientes*/
    public List<Cliente> listar()
    {   
        /** cria o atributo cliente, através do método List, para retorna uma lista*/
        List<Cliente> clientes= new ArrayList<Cliente>();
        
        Conexao conn = new Conexao();
        
        try{
            
            Statement stmt = (Statement) conn.getConn().createStatement();
            /** instancia o método ResultSet para selecionar informações da tabela*/
            ResultSet rs = stmt.executeQuery("select * from cliente where id >0");
            
            /** enquanto existir informação, realiza o loop*/
            while (rs.next())
            {
                 /** Instancia a classe cliente */
                Cliente clnt = new Cliente();
                
                 /** "alimenta" os atributos da classe cliente com os dados da tabela*/
                clnt.setId(rs.getInt("id")); 
                clnt.setNome(rs.getString("nome"));
                clnt.setCpf(rs.getString("cpf")); 
                clnt.setEndereco(rs.getString("endereco"));
                clnt.setBairro(rs.getString("bairro")); 
                clnt.setCidade(rs.getString("cidade"));
                clnt.setCep(rs.getString("cep")); 
                clnt.setTelefone(rs.getString("telefone"));
                clnt.setCelular(rs.getString("celular")); 
 
                 /** "alimenta" a lista criada anteriormente*/
                clientes.add(clnt);
                
            }
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        finally{
            conn.fechaConexao();
        }
        /** retorna a lista*/
        return clientes;
    }
    
    /** cria o método existe_cliente cujo objetivo é evitar duplicidade de cadastro*/
    public boolean existeCliente(String cpf)
    {   
        /** instancia o metodo conexao*/
        Conexao conn= new Conexao();
        Boolean retorno= false;
        
        try{
        /** cria o método Statement */
        Statement stmt = (Statement) conn.getConn().createStatement();
        /** cria o método ResultSet para verificar se o cpf ja foi cadastrado */
        ResultSet rs = stmt.executeQuery("select * from cliente where cpf='" + cpf + "'");
        
        /** Se existir registro, retorna true */
        if (rs.next())
        {
            retorno=true;
        }
        
        }catch(Exception e)
        {
            e.fillInStackTrace();
        }finally{
            conn.fechaConexao();
        }
        
        return retorno;
        
    }
    
    /** cria o método excluir cliente*/
    public boolean excluirCliente(int id)
    {
        boolean retorno = false;
         /** instancia o metodo conexao*/
        Conexao conn = new Conexao();
        
        try{
            /** instancia o método Statement */
            Statement stmt = (Statement) conn.getConn().createStatement();
            /** executa a exclusão*/
            stmt.execute("delete from cliente where id=" + id);
            retorno= true;  
            
        }catch(Exception e)
        {
            e.fillInStackTrace();
        }finally{
            conn.fechaConexao();
        }
      
        return retorno;
        
    }

}
