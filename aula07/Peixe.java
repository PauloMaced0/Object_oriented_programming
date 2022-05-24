package aula07;

public class Peixe extends Alimento {
    private TipoPeixe tipoPeixe;

    Peixe(TipoPeixe tipoPeixe, double proteinas, double calorias, double peso) {
        super(proteinas, calorias, peso);
        this.tipoPeixe = tipoPeixe;
    }

    public TipoPeixe getTipoPeixe() {
        return tipoPeixe;
    }

    public void setTipoPeixe(TipoPeixe tipoPeixe) {
        this.tipoPeixe = tipoPeixe;
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
		return "Peixe " + getTipoPeixe() + ", " + super.toString();
	}

}
