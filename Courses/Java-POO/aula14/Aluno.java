package aula14;

/**
 * @author NandoFilter
 * @date 06/05/2021
 */

public class Aluno extends Pessoa{

    private String login;
    private int totAssistidos;

    public Aluno(String nome, int idade, char sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistidos = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistidos() {
        return totAssistidos;
    }

    public void setTotAssistidos(int totAssistidos) {
        this.totAssistidos = totAssistidos;
    }

    public void viuMaisUm(){
        this.totAssistidos++;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                super.toString() +
                "\nlogin='" + login + '\'' +
                ", totAssistidos=" + totAssistidos +
                '}';
    }
}
