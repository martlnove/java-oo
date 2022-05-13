/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Lenovo
 */
public class Conta {
    double saldo;
    int agencia;
    int numero;
    String titular;
    
    public void deposita(double valor){
        this.saldo = this.saldo + valor;
    
    }
    public boolean saca(double valor ){
        if (this.saldo >= valor){
            this.saldo = this.saldo - valor;
            return true;
        }else{
            return false;
        }
    }
    
    void transfere(double valor){
        
    }   
}
