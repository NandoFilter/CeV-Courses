package aula12;

/**
 * @author NandoFilter
 * @date 06/03/2021
 */

public class Canguru extends Mamifero{

    @Override
    public void locomover() {
        System.out.println("Saltando");
    }

    public void usarBolsa(){
        System.out.println("Usando bolsa");
    }
}
