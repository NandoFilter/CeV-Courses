/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao01;

/**
 *
 * @author NandoFilter
 */
public class TesteFuncao01 {

    /**
     * @param args the command line arguments
     */
    
    static void soma(int a, int b){ // Método
        int s = a + b;
        System.out.println("[Metodo] A soma é " + s);
    }
    
    static int calc(int a, int b){ // Função
        int s = a + b;
        return s;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        soma(5,2);
        
        int sm = calc(7,3);
        
        System.out.println("[Funcao] A soma vale " + sm);
    }
    
}
