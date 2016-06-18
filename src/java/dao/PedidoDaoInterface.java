/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import modelo.Pedido;

/**
 *
 * @author Junger
 */
public interface PedidoDaoInterface {
 
    public List<Pedido> listar() throws Exception; 
}
