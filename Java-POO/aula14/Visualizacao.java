package aula14;

/**
 * @author NandoFilter
 * @date 06/05/2021
 */

public class Visualizacao {

    private Aluno espectador;
    private Video filme;

    public Visualizacao(Aluno espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistidos(this.espectador.getTotAssistidos() + 1);
        this.filme.setView(this.filme.getView() + 1);
    }

    @Override
    public String toString() {
        return "Visualizacao{" +
                "espectador=" + espectador +
                ", filme=" + filme +
                '}';
    }

    public Aluno getEspectador() {
        return espectador;
    }

    public void setEspectador(Aluno espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    public void avaliar(){
        this.filme.setAvaliacao(5);
    }

    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }

    public void avaliar(float porc){
        int tot = 0;

        if(porc <= 20) {
            tot = 3;
        } else if (porc <= 50) {
            tot = 5;
        } else if (porc <= 90) {
            tot = 8;
        } else {
            tot = 10;
        }

        this.filme.setAvaliacao(tot);
    }
}
