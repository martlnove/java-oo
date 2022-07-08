/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgbyte.bank;

public class SistemaInterno {
    private int senha = 2222;
    public void autentica(Autenticavel fa){
        boolean autenticou = fa.autentica(this.senha);
        if (autenticou){
            System.out.println("Pode entrar no sistema");
        }else{
            System.out.println("Não pode entrar no sistema");
        }
    }
    
}
