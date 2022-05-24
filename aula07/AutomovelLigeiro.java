package aula07;

public class AutomovelLigeiro implements KmpercorridosInterface {
    protected String matricula;
    protected String modelo;
    protected int potencia;
    protected String marca;
    protected int numdoQuadro;
    protected double capcidadeBagageira;

    protected int quilometros;

    AutomovelLigeiro(String matricula, String modelo, int potencia, String marca, int numdoQuadro,
            double capcidadeBagageira,int quilometros) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.potencia = potencia;
        this.marca = marca;
        this.numdoQuadro = numdoQuadro;
        this.capcidadeBagageira = capcidadeBagageira;
        this.quilometros = quilometros;
    }

    public double getCapcidadeBagageira() {
        return capcidadeBagageira;
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

    public int getNumdoQuadro() {
        return numdoQuadro;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setCapcidadeBagageira(int capcidadeBagageira) {
        this.capcidadeBagageira = capcidadeBagageira;
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

    public void setNumdoQuadro(int numdoQuadro) {
        this.numdoQuadro = numdoQuadro;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getQuilometros() {
        return quilometros;
    }

    public void setQuilometros(int quilometros) {
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
        return "Matricula: " + getMatricula() + ", Modelo: " + getModelo() + ", Marca: " + getMarca() + ", Potência: "
                + getPotencia() + ", Nº do quadro: " + getNumdoQuadro() + ", Cap. da bagageira: "
                + getCapcidadeBagageira();
    }
}
