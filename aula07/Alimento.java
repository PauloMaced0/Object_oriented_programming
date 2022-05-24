package aula07;

public class Alimento {

    protected double proteinas = 100;
    protected double calorias = 100;
    protected double peso = 100;

    public Alimento(double proteinas, double calorias, double peso) {
        this.proteinas = proteinas;
        this.calorias = calorias;
        this.peso = peso;
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
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (int) getCalorias();
        hash = 31 * hash + (int) getProteinas();
        hash = 31 * hash + (int) getPeso();

        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Alimento alimento = (Alimento) obj;
        if (getCalorias() != alimento.getCalorias())
            return false;
        if (getPeso() != alimento.getPeso())
            return false;
        if (getProteinas() != alimento.getProteinas())
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "(Proteinas: " + getProteinas() + ", Calorias: " + getCalorias() + ", Peso: " + getPeso() + ")";
    }
}
