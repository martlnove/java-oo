/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgbyte.bank;

/**
 *
 * @author Lenovo
 */
public class ControleBonificacao {
    private double soma;
    
    public void registra(Funcionario f){
        double boni = f.getBonificacao();
        this.soma = this.soma + boni;
        
    }
    public double getSoma(){
            return soma;
        }
    
}
