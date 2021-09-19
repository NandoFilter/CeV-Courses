package aula09;

/**
 * @author NandoFilter
 * @date 05/30/2021
 */

public class Livro implements Publicacao{
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.leitor = leitor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public String detalhes() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                "\nautor='" + autor + '\'' +
                "\ntotPaginas=" + totPaginas +
                ", pagAtual=" + pagAtual +
                "\naberto=" + aberto +
                "\nleitor=" + leitor.getNome() +
                ", idade=" + leitor.getIdade() +
                ", sexo=" + leitor.getSexo() +
                '}';
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int pag) {
        if(pag > this.totPaginas) {
            this.pagAtual = 0;
        } else {
            this.pagAtual = pag;
        }
    }

    @Override
    public void avancarPag() {
        if(this.pagAtual < this.totPaginas) {
            this.pagAtual++;
        }
    }

    @Override
    public void voltarPag() {
        if(this.pagAtual > 0) {
            this.pagAtual--;
        }
    }
}
