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
public class Testes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Gerente g = new Gerente();
       g.setSenha(2222);
       
       SistemaInterno s = new SistemaInterno();
       s.autentica(g);
       
       Autenticavel gerente = new Gerente();
       
    }
    
}
