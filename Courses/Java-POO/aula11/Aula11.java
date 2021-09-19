package aula11;

/**
 * @author NandoFilter
 * @date 06/02/2021
 */

public class Aula11 {
    public static void main(String[] args) {

        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo('M');

        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Cláudio");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo('M');
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo('M');
        b1.pagarMensalidade();

        Tecnico t1 = new Tecnico();
        t1.setNome("Fabiana");
        t1.setIdade(18);
        t1.setSexo('F');
        t1.praticar();

        Professor p1 = new Professor();
        p1.setNome("Mariana");
        p1.setIdade(35);
        p1.setSexo('F');
        p1.setSalario(2000);
        p1.setEspecialidade("Matemática");
        p1.receberAumento(500);

    }
}
