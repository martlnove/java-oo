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
       ContaCorrente cc = new ContaCorrente(222,333);
       cc.deposita(100.0);
       
       SeguroDeVida seguro = new SeguroDeVida();
       
       CalculadorImposto calc = new CalculadorImposto();
       calc.registra(cc);
       calc.registra(seguro);
       
    }
    
}
