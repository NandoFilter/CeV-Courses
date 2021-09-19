package aula13;

/**
 * @author NandoFilter
 * @date 06/05/2021
 */

public class Cachorro extends Lobo {

    public void reagir(String frase) {
        if (frase.toUpperCase().equals("TOMA COMIDA") || frase.toUpperCase().equals("OLÁ")) {
            System.out.println("Abanar e Latir");
        } else {
            System.out.println("Rosnar");
        }
    }

    public void reagir(int hora, int min) {
        if (hora < 12) {
            System.out.println("Abanar");
        } else if (hora >= 18) {
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar e Latir");
        }
    }

    public void reagir(boolean isDono) {
        if (isDono) {
            System.out.println("Abanar");
        } else {
            System.out.println("Rosnar e Latir");
        }
    }

    public void reagir(int idade, float peso) {
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
            }
        } else {
            if (peso < 10) {
                System.out.println("Rosnar");
            } else {
                System.out.println("Ignorar");
            }
        }
    }

    @Override
    public void emitirSom() {
        System.out.println("Latindo");
    }

}
