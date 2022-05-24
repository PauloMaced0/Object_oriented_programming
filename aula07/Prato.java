package aula07;

import java.util.*;

public class Prato {
    protected String nome;
    protected ArrayList<Alimento> composição = new ArrayList<>();

    Prato(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public boolean addIngrediente(Alimento al) {
        if ((!composição.contains(al)) ) {
            composição.add(al);
            return true;
        } else {
            return false;
        }
    }

    public double getTotalCalorias() {
        double caloriasTotal = 0;
        for (Alimento ali : composição) {
            caloriasTotal += ali.getCalorias();
        }
        return caloriasTotal;
    }

    public ArrayList<Alimento> getComposição() {
        return composição;
    }

    public void setComposição(ArrayList<Alimento> composição) {
        this.composição = composição;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + ", composição: " + getComposição().size() + " Ingredientes";
    }
}
