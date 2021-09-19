/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador01;

/**
 *
 * @author NandoFilter
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cc = 0;
        while(cc < 10){
            cc++;
            if(cc == 2 || cc == 4){
                continue; // Interrompe o Fluxo Natural e Retorna pro While
            }
            if(cc == 7){
                break; // Sai do Laço de Repetição
            }
            System.out.println("Cambalhota " + cc);
        }
    }
    
}
