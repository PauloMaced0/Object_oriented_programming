package aula06;

public class Ave extends Animal {
    private String corPena;

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public void mover() {
        System.out.println("Voar");
    }

    @Override
    public void alimentar() {
        System.out.println("Comer fruta");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }

    public void fazerNinho() {
        System.out.println("Fazer ninho");
    }

}
