/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import dao.PedidoDao;
import java.util.List;

/**
 *
 * @author CASA-PC
 */
public class PedidoRn {
    
    public List<Pedido> listar()
    
    {
        PedidoDao dao = new PedidoDao();
        List<Pedido> pedido = dao.listar();

        return pedido;
    }
}