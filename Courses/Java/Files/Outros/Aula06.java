package Outros;

import java.util.Scanner;

/**
 * @author  NandoFilter
 * @since   09/07/2020
 */

public class Aula06{
    public static void main(String[] args){

        // Tipos Primitivos e Manipulacao de Dados

        // ------------------------------------------------------
        
        /* Modo Normal

            int idade = 3;
            float sal = 1825.34f;
            char letra = 'F';
            boolean ligado = false;
            
        */
        
        // ------------------------------------------------------

        /* Modo TypeCast

            int idade = (int) 3;
            float sal = (float) 1825.34;
            chat letra = (char) 'F';
            boolean ligado = (boolean) false;

        */

        // ------------------------------------------------------

        /* Modo Wrapper Class (Classe Involucro) / Criando um objeto
        
            Integer idade = new Integer(3);
            Float sal = new Float(1825.34);
            Character letra = new Character('F');
            Boolean ligado = new Boolean(false);
            
        */

        // ------------------------------------------------------

        /* Tipos Inteiro

            [byte]  Tamanho: 1 byte     (ate 127)
            [short] Tamanho: 2 bytes    (ate 32.767)
            [int]   Tamanho: 4 bytes    (ate 2.147.483)
            [long]  Tamanho: 8 bytes    (ate 2^63)

        */

        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = scan.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scan.nextInt();

        System.out.printf("%s tem %d anos.", nome, idade);

        scan.close();

        /* Convertendo valores

            // Int pra String
            int age = 30;
            String valor = Integer.toString(age);
            
            // String pra Int
            String valor1 = "30";
            int idade1 = Integer.parseInt(valor1);

        */
    }
}