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
import modelo.Pedido;
/**
 *
 * @author CASA-PC
 */
public class PedidoDao implements PedidoDaoInterface{
    
     /** cria o método listar para listar os produtos*/
    public List<Pedido> listar()
    {
       Conexao conn = new Conexao();
       /** cria o atributo produto, através do método List, para retorna uma lista*/
       List<Pedido> pedido= new ArrayList<Pedido>();
        
        try{
            
            Statement stmt = (Statement) conn.getConn().createStatement();
            /** instancia o método ResultSet para selecionar informações da tabela*/
            ResultSet rs = stmt.executeQuery("select * from pedido");
            
             /** enquanto existir informação, realiza o loop*/
            while (rs.next())
            { 
                /** Instancia a classe produto */
                Pedido pedidos = new Pedido();
                /** "alimenta" os atributos da classe produto com os dados da tabela*/
                pedidos.setId(rs.getInt("id")); 
                pedidos.setNome(rs.getString("nome"));
                pedidos.setCpf(rs.getString("cpf")); 
                pedidos.setProduto(rs.getString("produto"));
                pedidos.setValor(rs.getFloat("valor")); 
                /** "alimenta" a lista criada anteriormente*/
                pedido.add(pedidos);
            }
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        finally{
            conn.fechaConexao();
        }
        
        /** retorna a lista*/
        return pedido;
    }
    
    
}
