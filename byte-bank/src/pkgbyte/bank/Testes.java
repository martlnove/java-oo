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
       Gerente g1 = new Gerente();
       g1.setNome("Lucas");
       g1.setSalario(5000);
       
       Funcionario f1 = new Funcionario();
       f1.setNome("Martins");
       f1.setSalario(2000);
       
       Funcionario ev = new EditorVideo();
       ev.setNome("Jorge");
       ev.setSalario(2500);
       
       Funcionario d = new Designer();
       d.setNome("Claudio");
       d.setSalario(2000);
       
       ControleBonificacao controle = new ControleBonificacao();
       controle.registra(g1);
       controle.registra(f1);
       controle.registra(ev);
       controle.registra(d);
       
        System.out.println(controle.getSoma());
 
 
       

       
    }
    
}
