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

/** Classe que contem os atributos da tabela login, além de protegê-los */
/** encapsulando-os restringindo sua manipulação ao(s) gets e sets */

public class Login {
    
    private String nome;
    private String senha;
    
    public String getNome()
    {
        return nome;
    }
    
    public void setNome(String nome)
    {
        this.nome= nome;
    }
    
    public String getSenha(){
        return senha;
    }
    
    public void setSenha(String senha)
    {
        this.senha= senha;
    }
    
}
