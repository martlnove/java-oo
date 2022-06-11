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
       g.setNome("Lucas");
       g.setCpf("000 000 000");
       g.setSalario(5000.0);
       
       boolean autenticou = g.autentica(22);
        System.out.println(autenticou);
       
    }
    
}
