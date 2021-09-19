package aula10;

import aula09.Pessoa;

/**
 * @author NandoFilter
 * @date 06/02/2021
 */

public class Professor extends Pessoa {

    private String especialidade;
    private float salario;

    public Professor(String nome, int idade, char sexo, String especialidade, float salario) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void receberAumento(float valor){
        this.salario += valor;
    }

}
