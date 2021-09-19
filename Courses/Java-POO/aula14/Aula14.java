package aula14;

/**
 * @author NandoFilter
 * @date 06/05/2021
 */

public class Aula14 {
    public static void main(String[] args) {

        Video[] v = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");

        Aluno[] a = new Aluno[2];
        a[0] = new Aluno("Jubileu", 22, 'M', "juba");
        a[1] = new Aluno("Creuza", 12, 'F', "creuzita");

     /* System.out.println(v[0].toString());
        System.out.println(a[0].toString()); */

        Visualizacao[] vis = new Visualizacao[5];

        vis[0] = new Visualizacao(a[0], v[2]);  // Assiste HTML
        vis[0].avaliar();
        System.out.println(vis[0].toString());

        vis[1] = new Visualizacao(a[0], v[1]);  // Assiste PHP
        vis[1].avaliar(87.0f);
        System.out.println(vis[1].toString());

    }
}
