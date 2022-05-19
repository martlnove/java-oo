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
public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    
    public void deposita(double valor){
        this.saldo += valor;
    
    }
    public boolean saca(double valor ){
        if (this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }
    
    public boolean transfere(double valor, Conta destino){
        if( this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false; 
    }   
    public double getSaldo(){
    return this.saldo;
    }
    public int getNumero(){
        return this.numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public int getAgencia(){
        return this.agencia;
    }
    public void setAgencia(int agencia){
        this.agencia = agencia;
    }
}
