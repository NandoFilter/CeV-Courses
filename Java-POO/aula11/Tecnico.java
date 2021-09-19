package aula11;

/**
 * @author NandoFilter
 * @date 06/02/2021
 */

public class Tecnico extends Aluno{

    private int registroProfissional;

    public void praticar(){
        System.out.println(this.getNome() + " está praticando!");
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
