package aula13;

/**
 * @author NandoFilter
 * @date 06/05/2021
 */

public class Mamifero extends Animal{

    protected String corPelo;

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamífero");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
