/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;
/**
 *
 * @author NandoFilter
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0, total = 0, par = 0, impar = 0, cem = 0, media;
        
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número: <br><em>(Valor 0 Interrompe)</em></html>"));
            s += n;
            
            if(n != 0){
                total++;
                
                if(n % 2 == 0){
                    par++;
                }else{
                    impar++;
                }
                
                if(n > 100){
                    cem++;
                }
            }
            
        }while(n != 0);
        
        media = s / total;
        
        JOptionPane.showMessageDialog(null, "<html>Resultado: <br><hr>" +
                 "Total de Valores: " + total + 
                "<br> Total de Pares: " + par +
                "<br> Total de Impares: " + impar +
                "<br> Acima de 100: " + cem +
                "<br> Média de Valores: " + media + "</html>");
    }
    
}
