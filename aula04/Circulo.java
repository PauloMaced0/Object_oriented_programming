package aula04;
import java.lang.Math;

public class Circulo {
    private double raio;

    public Circulo(){
        raio = 1;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
    public double getRaio() {
        return raio;
    }
    public Boolean valid(){
        return raio>0;
    }
    public double area(){
        return Math.round(Math.PI*(Math.pow(getRaio(), 2)));
    }
    public double perimetro(){
        return Math.round(2*Math.PI*getRaio());
    }
    public String toString(){
        return "Círculo - Raio:"+getRaio()+" Área:"+area()+" Perimetro:"+perimetro();
    }
    public Boolean equals(double r){
        return r == getRaio();
    }
}
