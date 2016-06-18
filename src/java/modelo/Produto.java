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

/** Classe que contem os atributos da tabela produto, além de protegê-los */
/** encapsulando-os restringindo sua manipulação ao(s) gets e sets */

public class Produto {
    
    private int id;
    private String descricao;
    private String marca;
    private int quantidade;
    private float preco;
    
    public int getId(){
        return id;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public String getDescricao(){
        
        return descricao;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public String getMarca(){
        
        return marca;
    }
    public void setMarca(String marca)
    {
        this.marca= marca;
    }
    
    public int getQuantidade(){
        return quantidade;
    }
    
    public void setQuantidade(int quantidade)
    {
        this.quantidade= quantidade;
    }
    
    public float getPreco()
    {
        return preco;
    }
    
    public void setPreco(float preco)
    {
        this.preco = preco;
    }
}
