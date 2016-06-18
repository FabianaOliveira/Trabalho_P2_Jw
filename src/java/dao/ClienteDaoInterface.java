/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import modelo.Cliente;
import util.JavaWebException;
import java.util.List;

/**
 *
 * @author CASA-PC
 */
public interface ClienteDaoInterface {
    
    public boolean inserir(Cliente c) throws Exception;
    public List<Cliente> listar() throws Exception;  
    public boolean existeCliente(String cpf) throws Exception;
    public boolean excluirCliente(int id) throws Exception;
    
}
