/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor03;

import java.util.Arrays;

/**
 *
 * @author NandoFilter
 */
public class Vetor03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num[] = {3, 7, 6, 1, 9, 4, 2};
        
        // Arrays.sort(num);
        
        for(int valor: num){
            System.out.print(valor + " ");
        }
        
        int pos = Arrays.binarySearch(num, 1);
        System.out.println("\nEncontrei o valor na posição " + pos);
    }
    
}
