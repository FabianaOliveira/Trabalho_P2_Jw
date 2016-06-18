/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author CASA-PC
 */

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/** Importa a classe modelo*/
import modelo.Produto;


public class ProdutoDao implements ProdutoDaoInterface{
    
    /** cria o método para inserir os dados na tabela produto*/
    public boolean inserir(Produto produto){
        Boolean retorno = false;
        String sql;
        /** instãncia o método conexão para se conectar com a base*/
        Conexao conn = new Conexao();
        try{
            
            /** instãncia o método Statement para realizar a inserção*/
            Statement stmt = (Statement) conn.getConn().createStatement();
            
            sql ="insert into produto(descricao,marca,quantidade,preco)values('";
            sql = sql + produto.getDescricao() + "','";
            sql = sql + produto.getMarca() + "',";
            sql = sql + produto.getQuantidade() + ",";
            sql = sql + produto.getPreco() + ")";
            /** executa a inserção*/
            stmt.execute(sql);
            
            retorno = true;
            
        }catch(Exception e){
            e.fillInStackTrace();
        }finally{
            conn.fechaConexao();
        }
        
        return retorno;
    }
    
     /** cria o método listar para listar os produtos*/
    public List<Produto> listar()
    {
       Conexao conn = new Conexao();
       /** cria o atributo produto, através do método List, para retorna uma lista*/
       List<Produto> produto= new ArrayList<Produto>();
        
        try{
            
            Statement stmt = (Statement) conn.getConn().createStatement();
            /** instancia o método ResultSet para selecionar informações da tabela*/
            ResultSet rs = stmt.executeQuery("select * from produto");
            
             /** enquanto existir informação, realiza o loop*/
            while (rs.next())
            { 
                /** Instancia a classe produto */
                Produto produtos = new Produto();
                /** "alimenta" os atributos da classe produto com os dados da tabela*/
                produtos.setId(rs.getInt("id")); 
                produtos.setDescricao(rs.getString("descricao"));
                produtos.setMarca(rs.getString("marca")); 
                produtos.setQuantidade(rs.getInt("quantidade"));
                produtos.setPreco(rs.getFloat("preco")); 
                /** "alimenta" a lista criada anteriormente*/
                produto.add(produtos);
            }
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        finally{
            conn.fechaConexao();
        }
        
        /** retorna a lista*/
        return produto;
    }
    
     /** cria o método excluir produto*/
    public boolean excluirProduto(int id)
    {
        boolean retorno = false;
        /** instancia o metodo conexao*/
        Conexao conn = new Conexao();
        
        try{
            /** instancia o método Statement */
            Statement stmt = (Statement) conn.getConn().createStatement();
            /** executa a exclusão*/
            stmt.execute("delete from produto where id=" + id);
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
