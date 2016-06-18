/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import dao.ClienteDao;
import java.util.List;

/**
 *
 * @author CASA-PC
 */

public class ClienteRn {
    
    public boolean cadastroClienteDao(Cliente cliente){
        
        Boolean retorno = false;
        ClienteDao dao = new ClienteDao();
        
         if (cliente.getNome()=="" || cliente.getCpf()=="" || cliente.getEndereco()=="" || cliente.getBairro()=="" || cliente.getCidade()=="" || cliente.getCep()=="" || cliente.getTelefone()=="")
        {
           retorno =false;
           
        }else
        {
           
               
            retorno=dao.inserir(cliente);
        }
        return retorno;
    }
    
   public boolean existeClienteDao(String cpf) throws Exception
   {    
        ClienteDao dao = new ClienteDao();
        
        return dao.existeCliente(cpf);
    
   }
   
   public boolean excluirClienteDao(int id) throws Exception
   {
       ClienteDao dao = new ClienteDao();
       return dao.excluirCliente(id);
   }
   
   public List<Cliente> listar()
   {
        
        ClienteDao dao = new ClienteDao();
        
        List<Cliente> clientes= dao.listar();
        
        return clientes;
        
   }
    
}
