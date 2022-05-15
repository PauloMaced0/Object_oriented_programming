package aula06;

import java.lang.Math;

public class Alojamento {
    protected String Cod;
    protected String nome;
    protected String local;
    protected double preço;
    protected boolean disponibilidade;
    protected double avaliação;

    Alojamento(String Cod, String nome, String local, double preço) {
        this.Cod = Cod;
        this.nome = nome;
        this.local = local;
        this.preço = preço;
        this.disponibilidade = true;
        setAvaliação((Math.random() * 4.0) + 1.0);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setCod(String cod) {
        Cod = cod;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public void setAvaliação(double avaliação) {
        this.avaliação = avaliação;
    }

    public String getNome() {
        return nome;
    }

    public double getPreço() {
        return preço;
    }

    public String getLocal() {
        return local;
    }

    public double getAvaliação() {
        return avaliação;
    }

    public String getCod() {
        return Cod;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    @Override
    public String toString() {
        return "Código: " + getCod() + ", Nome: " + getNome() + ", Local: " + getLocal() + ", Preço: " + getPreço()
                + " Avaliação: " + String.format("%3.1f",getAvaliação());
    }
}
