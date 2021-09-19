/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compararstring;

/**
 *
 * @author NandoFilter
 */
public class CompararString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Fernando";
        String nome2 = "Fernando";
        String nome3 = new String("Fernando"); // Mesmo conteudo
        String res, res2;
        
        res = (nome1==nome2)?"Igual":"Diferente"; // Para variaveis
        System.out.println(res);
        
        res2 = (nome1.equals(nome3))?"Igual":"Diferente"; // Para objetos (new)
        System.out.println(res2);
    }
    
}
