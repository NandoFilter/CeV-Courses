package aula07;

public class Lutador implements InterfaceLutador {

    private String nome, nacionalidade, categoria;
    private int idade, wins, loses, ties;
    private double altura, peso;

    public Lutador(String name, String nac, int age, double height, double weight, int wins, int loses, int ties) {
        this.nome = name;
        this.nacionalidade = nac;
        this.idade = age;
        this.altura = height;
        this.setPeso(weight);
        this.wins = wins;
        this.loses = loses;
        this.ties = ties;
    }

    // Métodos Privados
    public String getNome() {
        return this.nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setNacionalidade(String n) {
        this.nacionalidade = n;
    }

    public String getCategoria() {
        return this.categoria;
    }

    private void setCategoria(double peso) {
        if (peso < 52.2) {
            this.categoria = "Inválido";
        } else if (peso <= 70.3) {
            this.categoria = "Leve";
        } else if (peso <= 83.9) {
            this.categoria = "Médio";
        } else if (peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int i) {
        this.idade = i;
    }

    public int getWins() {
        return this.wins;
    }

    public void setWins(int w) {
        this.wins = w;
    }

    public int getLoses() {
        return this.loses;
    }

    public void setLoses(int l) {
        this.loses = l;
    }

    public int getTies() {
        return this.ties;
    }

    public void setTies(int t) {
        this.ties = t;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double h) {
        this.altura = h;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double p) {
        this.peso = p;
        setCategoria(p);
    }

    // Métodos Públicos
    @Override
    public void apresentar() {
        System.out.println("----------------------");
        System.out.println("Nome: " + getNome());
        System.out.println("Nacionalidade: " + getNacionalidade());
        System.out.println("Idade: " + getIdade());
        System.out.println("Altura: " + getAltura() + "m");
        System.out.println("Peso: " + getPeso() + "kg");
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Vitórias: " + getWins());
        System.out.println("Derrotas: " + getLoses());
        System.out.println("Empates: " + getTies());
        System.out.println("----------------------\n");
    }

    @Override
    public void statusLutador() {
        System.out.print(getNome() + " é um peso " + getCategoria() + " | ");
        System.out.println(getWins() + " Vitórias | " + getLoses() + " Derrotas | " + getTies() + " Empates");
    }

    @Override
    public void ganharLuta() {
        setWins(getWins() + 1);
    }

    @Override
    public void perderLuta() {
        setLoses(getLoses() + 1);
    }

    @Override
    public void empatarLuta() {
        setTies(getTies() + 1);
    }
}
