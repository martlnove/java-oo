/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgbyte.bank2;

/**
 *
 * @author Lenovo
 */
public class Cliente {
    private String nome;
    private String cpf;
    private String profissao;
    
    public String getNome(){
        return nome;
    };
    public void setNome(String nome){
        this.nome = nome;
    };
    public String getCpf(){
        return cpf;
    };
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getProfissao(){
        return profissao;
    }
    public void setProfissao(String profissao){
        this.profissao = profissao;
    }

}
