package aula06;

public class Retangulo extends Forma {

    public Retangulo() {
        comprimento = 1;
        altura = 1;
        cor = "azul";
    }
    public Boolean valid(){
        return getAltura()>0 && getComprimento()>0;
    }
    public double area(){
        return getAltura()*getComprimento();
    }
    public double perimetro(){
        return 2*getAltura()+2*getComprimento();
    }
    public String toString(){
        return "Retângulo com Altura:"+getAltura()+" Comprimento:"+getComprimento()+" Área:"+area()+" Perimetro"+perimetro();
    }
    public Boolean equals(double a,double c,String cor){
        return getAltura() == a && getComprimento()==c && cor == getCor();
    }
}
