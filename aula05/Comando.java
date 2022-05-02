package aula05;

public class Comando implements Interface {
    private int volume;
    private boolean ligado;
    private boolean tocar;

    public Comando(){
        this.volume = 50;
        this.ligado = false;
        this.tocar = false;

    }
    public int getVolume() {
        return volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public boolean isTocar() {
        return tocar;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void setTocar(boolean tocar) {
        this.tocar = tocar;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

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
        System.out.println("Está ligado? "+isLigado());
        System.out.println("Está a tocar? "+isTocar());
        System.out.println("Volume: "+getVolume());
        for(int i = 0;i< getVolume();i+=10){
            System.out.println("[]");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechar Menu...");
    }

    @Override
    public void maisvolume() {
        if(isLigado()){
            setVolume(getVolume()+5);
        }
    }

    @Override
    public void menosVolume() {
        if(isLigado()){
            setVolume(getVolume()-5);
        }
    }

    @Override
    public void ligarMute() {
        if(isLigado() && getVolume()>0){
            setVolume(0);
        }
    }

    @Override
    public void desligarMute() {
        if(isLigado() && getVolume() == 0){
            setVolume(50);
        }
    }
    @Override
    public void play() {
        if(isLigado() && !isTocar()){
            setTocar(true);
        }        
    }
    @Override
    public void pause() {
        if(isLigado() && isTocar()){
            setTocar(false);
        }        
    }
}
