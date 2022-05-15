package aula06;

import java.lang.Math;

public abstract class Forma {
    protected String cor;
    protected double altura;
    protected double comprimento;
    protected double lado1;
    protected double lado2;
    protected double lado3;
    protected double raio;

    public double area(double altura, double comprimento) {
        return altura * comprimento;
    }

    public double area(double lado1, double lado2, double lado3) {
        double s = (lado1 + lado2 + lado3) * 2;
        return Math.round(Math.sqrt(s * (s - getLado1()) * (s - getLado2()) * (s - getLado3())));
    }

    public double area(double raio) {
        return Math.round(Math.PI * (Math.pow(getRaio(), 2)));
    }

    public double perimetro(double altura,double comprimento) {
        return 2*altura + 2* comprimento;
    }

    public double perimetro(double lado1,double lado2,double lado3) {
        return lado1+lado2+lado3;
    }

    public double perimetro(double raio){
        return  Math.round(2*Math.PI*raio);
    }

    public double getAltura() {
        return altura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public double getRaio() {
        return raio;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
