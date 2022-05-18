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
public class TestaBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente paulo = new Cliente();
        paulo.nome = "Paulo Silveira";
        paulo.cpf = "111111111-11";
        paulo.profissao = "Estudante";
        
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.deposita(100);
        contaDoPaulo.titular = paulo;
        // TODO code application logic here
    }
    
}
