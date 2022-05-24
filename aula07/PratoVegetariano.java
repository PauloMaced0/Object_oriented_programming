package aula07;

public class PratoVegetariano extends Prato{
    
    PratoVegetariano(String nome){
        super(nome);
    }

    public String toString(){
        return super.toString()+" - Prato Vegetariano";
    }
}
