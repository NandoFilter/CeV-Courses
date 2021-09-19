package aula11;

/**
 * @author NandoFilter
 * @date 06/02/2021
 */

public class Professor extends Pessoa{

    private String especialidade;
    private float salario;

    public void receberAumento(float valor){
        this.salario += valor;
        System.out.println(this.getNome() + " teve seu salário aumentado para R$" + this.salario);
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
}
