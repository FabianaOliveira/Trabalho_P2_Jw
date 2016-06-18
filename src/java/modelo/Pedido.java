/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author CASA-PC
 */
public class Pedido {
    
    private int id;
    private String nome;
    private String cpf;
    private String produto;
    private float valor;
    
    public int getId()
    {
        return id;
    }
    
    public void setId(int id)
    {
        this.id= id;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public void setNome(String nome)
    {
        this.nome= nome;
    }
    
    public String getCpf()
    {
        return cpf;
    }
    
    public void setCpf(String cpf)
    {
        this.cpf= cpf;
    }
    
    public String getProduto()
    {
        return produto;
    }
    
    public void setProduto(String produto)
    {
        this.produto= produto;
    }
    
    public float getValor()
    {
        return valor;
    }
    
    public void setValor(float valor)
    {
        this.valor= valor;
    }
}
