package aula04;

public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo() {
        lado1 = 1;
        lado2 = 1;
        lado3 = 1;
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

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public Boolean valid() {
        return (getLado1() > 0 && getLado2() > 0 && getLado3() > 0) && (getLado1() + getLado2() > getLado3())
                && (getLado1() + getLado3() > getLado2()) && (getLado2() + getLado3() > getLado1());
    }

    public double area(){
        double s =(getLado1()+getLado2()+getLado3())/2;
        return Math.round(Math.sqrt(s*(s-getLado1())*(s-getLado2())*(s-getLado3()))) ;
    }

    public double perimetro() {
        return getLado1()+getLado2()+getLado3();
    }

    public String toString() {
        return "Triangulo com Lados:"+getLado1()+" "+getLado2()+" "+getLado3()+" Área:"+area()+" Perimetro:"+perimetro();
    }

    public Boolean equals(double l1,double l2,double l3) {
        return l1 == getLado1() && l2 == getLado2() && l3 == getLado3();
    }

}
