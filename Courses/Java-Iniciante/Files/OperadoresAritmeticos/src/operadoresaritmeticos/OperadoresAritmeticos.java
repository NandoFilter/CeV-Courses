/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

/**
 *
 * @author NandoFilter
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2)/2;
        System.out.println("A média é igual a " + m);*/
       
       /* int numero = 10;
        int valor = 4 + numero--;
        System.out.println(valor);
        System.out.println(numero);*/
       
       /* int x = 4;
          x *= 2; // x = x * 2
          System.out.println(x);*/
       
       /* float v = 8.5f;
       int up = (int) Math.ceil(v);
       int down = (int) Math.floor(v);
       int ar = (int) Math.round(v);
       
       System.out.println(up);
       System.out.println(down);
       System.out.println(ar); */
       
       double ale = Math.random();
       int n = (int) (5 + ale * (10-5)); // Numeros de 5 a 10
       System.out.println(n);
    }
    
}
