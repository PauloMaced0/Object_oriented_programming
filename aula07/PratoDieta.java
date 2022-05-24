package aula07;

public class PratoDieta extends Prato {
    protected double Limcalorias;

    PratoDieta(String nome, double Limcalorias) {
        super(nome);
        this.Limcalorias = Limcalorias;
    }

    public double getLimcalorias() {
        return Limcalorias;
    }

    public void setLimcalorias(double limcalorias) {
        Limcalorias = limcalorias;
    }

    @Override
    public boolean addIngrediente(Alimento al) {
        if (getLimcalorias() < super.getTotalCalorias()) {
            return false;
        } else {
            super.composição.add(al);
            return true;
        }
    }

    public String toString() {
        return super.toString() + " - Dieta (" + getTotalCalorias() + " Calorias)" + ", Lim: " + getLimcalorias();
    }

}
