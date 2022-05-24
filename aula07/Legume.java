package aula07;

public class Legume extends Alimento {
    private String nome;

    public Legume(String nome, double proteinas, double calorias, double peso) {
        super(proteinas, calorias, peso);
        this.nome = nome;
    }

    public double getCalorias() {
        return calorias;
    }

    public String getNome() {
        return nome;
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    @Override
	public String toString() {
		return "Legume " + nome + ", " + super.toString();
	}
}
