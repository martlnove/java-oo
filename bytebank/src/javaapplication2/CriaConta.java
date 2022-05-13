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
public class CriaConta {
    public static void main(String[] args){
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        
        
        
        primeiraConta.saldo += 100;
        
        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;
    }
    
}
