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
public class Gerente extends Funcionario {
    
    private int senha;
    
    
    public Gerente(){
        
    }
    
    public boolean autentica(int senha){
        if(this.senha == senha){
            return true;
        }else{
            return false;
        }
    }
    
    public void setSenha(int senha){
        this.senha = senha;
    }
    
//    public double getBonificacao(){
//        return this.salario;
//    }
    
    
}
