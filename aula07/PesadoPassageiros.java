package aula07;

public class PesadoPassageiros implements KmpercorridosInterface {
    private String matricula;
    private String modelo;
    private int potencia;
    private String marca;
    private int numdoQuadro;
    private double peso;
    private int numPassageiros;
    private int quilometros;

    PesadoPassageiros(String matricula, String modelo, int potencia, String marca, int numdoQuadro, double peso,
            int numPassageiros) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.potencia = potencia;
        this.marca = marca;
        this.numdoQuadro = numdoQuadro;
        this.peso = peso;
        this.numPassageiros = numPassageiros;

    }

    public String getMarca() {
        return marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public int getNumPassageiros() {
        return numPassageiros;
    }

    public int getNumdoQuadro() {
        return numdoQuadro;
    }

    public double getPeso() {
        return peso;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }

    public void setNumdoQuadro(int numdoQuadro) {
        this.numdoQuadro = numdoQuadro;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }public int getQuilometros() {
        return quilometros;
    }public void setQuilometros(int quilometros) {
        this.quilometros = quilometros;
    }
    @Override
    public void trajeto(int quilometros) {
        System.out.printf("Distância do último trajeto: ", getQuilometros());
    }

    @Override
    public int ultimoTrajeto() {
        return getQuilometros();
    }

    @Override
    public int distanciaTotal() {
        int distanciaTotal = 0;
        return distanciaTotal += ultimoTrajeto();
         
    }
    public boolean equals(String matricula) {
        return getMatricula().equals(matricula);
    }

    public boolean validMatricula(String matricula) {
        boolean valid = false;
        if (matricula.matches("\\w{2}-\\w{2}-\\w{2}")) {
            valid = true;
        } else {
            throw new IllegalArgumentException("Matrícula Inválida");
        }
        return valid;
    }
    public String toString() {
        return "Matriula: " + getMatricula() + ", Modelo: " + getModelo() + ", Marca: " + getMarca() + ", Potência: "
                + getPotencia() + ", Nº do quadro" + getNumdoQuadro() + ", Peso: " + getPeso()
                + ", Nº max de passageiros: " + getNumPassageiros();
    }
}
