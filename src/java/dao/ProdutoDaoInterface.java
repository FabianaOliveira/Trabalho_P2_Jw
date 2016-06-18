/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import modelo.Produto;
import util.JavaWebException;
/**
 *
 * @author CASA-PC
 */
public interface ProdutoDaoInterface {
    
    public boolean inserir(Produto produto) throws Exception;
    public List<Produto> listar() throws Exception; 
    public boolean excluirProduto(int id) throws Exception;
    
}
