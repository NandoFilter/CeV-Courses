package aula12;

/**
 * @author NandoFilter
 * @date 06/03/2021
 */

public class Aula12 {
    public static void main(String[] args) {

        Canguru c = new Canguru();
        Cachorro k = new Cachorro();

        Cobra cb = new Cobra();
        Tartaruga t = new Tartaruga();

        Goldfish g = new Goldfish();

        Arara a = new Arara();

        System.out.println("---- Mamíferos ----");

        c.locomover();
        k.locomover();
        c.emitirSom();
        k.emitirSom();

        System.out.println("\n---- Répteis ----");

        cb.locomover();
        t.locomover();

        System.out.println("\n---- Peixes ----");

        g.locomover();
        g.alimentar();
        g.emitirSom();

        System.out.println("\n---- Aves ----");

        a.locomover();
        a.alimentar();
        a.emitirSom();

    }
}
