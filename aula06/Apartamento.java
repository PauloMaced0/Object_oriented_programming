package aula06;

public class Apartamento extends Alojamento {
    private int numQuartos;

    Apartamento(String Cod, String nome, String local, double preço, int numQuartos) {
        super(Cod, nome, local, preço);
        this.numQuartos = numQuartos;
    }

    public int getNumQuartos() {
        return numQuartos;
    }

    public void setNumQuartos(int numQuartos) {
        this.numQuartos = numQuartos;
    }

    public String toString() {
        return super.toString()+" Nº de quartos: " + getNumQuartos();
    }
}
