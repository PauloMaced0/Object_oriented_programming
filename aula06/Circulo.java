package aula06;
import java.lang.Math;

public class Circulo extends Forma {

    public Circulo(){
        raio = 1;
        cor = "laranja";
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
        return "Círculo - Raio:"+getRaio()+" Área:"+area(getRaio())+" Perimetro:"+perimetro(getRaio());
    }
    public Boolean equals(double r,String cor){
        return r == getRaio() && cor == getCor();
    }
}
