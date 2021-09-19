package aula12;

/**
 * @author NandoFilter
 * @date 06/03/2021
 */

public class Cachorro extends Mamifero{

    @Override
    public void emitirSom() {
        System.out.println("Latindo");
    }

    public void abanarRabo(){
        System.out.println("Abanando rabo");
    }
}
