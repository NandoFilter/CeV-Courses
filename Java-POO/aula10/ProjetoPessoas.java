package aula10;

import aula09.Pessoa;

/**
 * @author NandoFilter
 * @date 06/02/2021
 */

public class ProjetoPessoas {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Pedro", 18, 'M');
        Aluno p2 = new Aluno("Maria", 15, 'F', 1, "Informática");
        Professor p3 = new Professor("Fabiana", 35, 'F', "Matemática", 2000);
        Funcionario p4 = new Funcionario("Cláudio", 29, 'M', "Secretaria", true);

        // Método Super Classe
        p1.fazerAniver();
        p2.fazerAniver();

        // Métodos Subclasses
        p2.cancelarMatricula();
        p3.receberAumento(500);
        p4.mudarTrabalho();

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

    }
}
