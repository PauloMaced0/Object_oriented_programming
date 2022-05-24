package aula07;

public class Cereal extends Alimento {
    private String nome;

    public Cereal(String nome, double proteinas, double calorias, double peso) {
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

    public void setProteinas(double proteinas) {
        this.proteinas = proteinas;
    }
    public String toString() {
        return getNome()+", (Proteinas: " + proteinas + ", Calorias: " + calorias + ", Peso: " + peso + ")";
    }

}
