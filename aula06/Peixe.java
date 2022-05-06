package aula06;

public class Peixe extends Animal {
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void mover() {
        System.out.println("Nadar");
    }

    @Override
    public void alimentar() {
        System.out.println("Comer substâncias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Não faz som");
    }

    public void fazerBolhas() {
        System.out.println("Fazer Bolhas");
    }
}
