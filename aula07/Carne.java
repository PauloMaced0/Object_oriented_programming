package aula07;

public class Carne extends Alimento {
    private VariedadeCarne variedadeCarne;

    Carne(VariedadeCarne VariedadeCarne, double proteinas, double calorias, double peso) {
        super(proteinas, calorias, peso);
        this.variedadeCarne = VariedadeCarne;
    }


    public VariedadeCarne getVariedadeCarne() {
        return variedadeCarne;
    }

    public void setVariedadeCarne(VariedadeCarne variedadeCarne) {
        this.variedadeCarne = variedadeCarne;
    }

    public double getCalorias() {
        return calorias;
    }

    public double getPeso() {
        return peso;
    }

    public double getProteinas() {
        return proteinas;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setProteinas(double proteinas) {
        this.proteinas = proteinas;
    }

    @Override
    public String toString() {
        return getVariedadeCarne()+", (Proteinas: " + proteinas + ", Calorias: " + calorias + ", Peso: " + peso + ")";
    }

}
