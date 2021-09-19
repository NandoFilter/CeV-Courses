package aula08;

import aula07.Lutador;

import java.util.Random;

/**
 * @author NandoFilter
 * @date 05/30/2021
 */

public class Luta {

    // Atributos
    private Lutador desafiado, desafiante;
    private int round;
    private boolean aprovada;

    // Métodos Especias
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    // Métodos
    public void marcarLuta(Lutador desafiado, Lutador desafiante) {
        if (desafiado.getCategoria().equals(desafiante.getCategoria()) && (desafiado != desafiante)) {
            this.aprovada = true;
            this.desafiado = desafiado;
            this.desafiante = desafiante;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (this.aprovada) {
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();

            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();

            Random random = new Random();
            int vencedor = random.nextInt(3); // 0 1 2

            System.out.println("--------- RESULTADO ---------");
            switch (vencedor) {
                case 0: // Empate
                    System.out.println("Empatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: // Ganhou Desafiado
                    System.out.println("Vitória do " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: // Ganhou Desafiante
                    System.out.println("Vitória do " + this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
            System.out.println("-----------------------------");
        } else {
            System.out.println("A luta não pode acontecer.");
        }
    }

}
