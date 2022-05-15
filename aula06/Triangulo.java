package aula06;

public class Triangulo extends Forma {

    public Triangulo() {
        lado1 = 1;
        lado2 = 1;
        lado3 = 1;
        cor = "preto";
    }

    public Boolean valid() {
        return (getLado1() > 0 && getLado2() > 0 && getLado3() > 0) && (getLado1() + getLado2() > getLado3())
                && (getLado1() + getLado3() > getLado2()) && (getLado2() + getLado3() > getLado1());
    }

    public double perimetro() {
        return getLado1()+getLado2()+getLado3();
    }

    public String toString() {
        return "Triangulo com Lados:"+getLado1()+" "+getLado2()+" "+getLado3()+" Área:"+area(getLado1(),getLado2(),getLado3())+" Perimetro:"+perimetro(getLado1(),getLado2(),getLado3());
    }

    public Boolean equals(double l1,double l2,double l3,String cor) {
        return l1 == getLado1() && l2 == getLado2() && l3 == getLado3() && cor == getCor();
    }

}
