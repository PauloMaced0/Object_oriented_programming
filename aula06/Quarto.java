package aula06;

import java.lang.Math;

public class Quarto extends Alojamento {
    private String tipo;
    String[] tipos = { "single", "double", "twin", "triple" };

    Quarto(String Cod, String nome, String local, double preço) {
        super(Cod, nome, local, preço);
        setTipo(types());
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String types() {
        int index = (int) ((Math.random() * 3) + 1);
        return tipos[index];
    }

    @Override
    public String toString() {
        return super.toString()+" Tipo: " + getTipo();
    }
}
