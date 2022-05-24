package aula07;

public class Motociclo implements KmpercorridosInterface {
    private String matricula;
    private String modelo;
    private int potencia;
    private String marca;
    private String tipo;
    private int quilometros;

    Motociclo(String matricula, String modelo, int potencia, String marca, String tipo) {
        setMatricula(matricula);
        this.modelo = modelo;
        this.potencia = potencia;
        this.marca = marca;
        this.tipo = tipo;
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

    public int getPotencia() {
        return potencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQuilometros() {
        return quilometros;
    }

    public void setQuilometros(int quilometros) {
        this.quilometros = quilometros;
    }

    public void setMatricula(String matricula) {
        if (validMatricula(matricula)) {
            this.matricula = matricula;
        }
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    @Override
    public String toString() {
        return "Matricula: " + getMatricula() + ", Modelo: " + getModelo() + ", Marca: " + getMarca() + ", Potência: "
                + getPotencia() + ", Tipo: " + getTipo();
    }

}