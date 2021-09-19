package aula06;

public class ControleRemoto implements Controlador{
    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // Métodos Especiais
    public ControleRemoto(){
        setVolume(50);
        setLigado(false);
        setTocando(false);
    }

    private int getVolume(){
        return(volume);
    }

    private boolean getLigado(){
        return(ligado);
    }

    private boolean getTocando(){
        return(tocando);
    }

    private void setVolume(int v){
        volume = v;
    }

    private void setLigado(boolean l){
        ligado = l;
    }

    private void setTocando(boolean t){
        tocando = t;
    }

    // Métodos Abstratos
    @Override
    public void ligar() {
        setLigado(true);
    }

    @Override
    public void desligar() {
        setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("------- MENU -------");
        System.out.println("Está ligado? " + getLigado());
        System.out.println("Está tocando? " + getTocando());
        System.out.print("Volume: " + getVolume() + " ");
        for (int i = 1; i <= getVolume(); i += 10) {
            System.out.print("∎");
        }
        System.out.println();
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if(getLigado()){
            if(getVolume() >= 0 && getVolume() < 100){
                setVolume(getVolume() + 5);
            }
        }
    }

    @Override
    public void menosVolume() {
        if(getLigado()){
            if(getVolume() > 0 && getVolume() <= 100){
                setVolume(getVolume() - 5);
            }
        }
    }

    @Override
    public void ligarMudo() {
        if(getLigado() && getVolume() > 0){
            setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(getLigado() && getVolume() == 0){
            setVolume(50);
        }
    }

    @Override
    public void play() {
        if(getLigado() && !(getTocando())){
            setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(getLigado() && getTocando()){
            setTocando(false);
        }
    }

}
