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
public abstract interface Autenticavel{
    
    public abstract void setSenha(int senha);
    
    public abstract boolean autentica(int senha);
    
}
