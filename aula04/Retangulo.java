package aula04;

public class Retangulo {
    private double altura;
    private double comprimento;

    public Retangulo() {
        comprimento = 1;
        altura = 1;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
    public double getAltura() {
        return altura;
    }
    public double getComprimento() {
        return comprimento;
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
    public Boolean equals(double a,double c){
        return getAltura() == a && getComprimento()==c;
    }
}
