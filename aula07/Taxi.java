package aula07;

public class Taxi extends AutomovelLigeiro {
    private int numLicença;

    Taxi(String matricula, String modelo, int potencia, String marca, int numdoQuadro, double capcidadeBagageira,int numLicença,int quilometros) {
        super(matricula, modelo, potencia, marca, numdoQuadro, capcidadeBagageira,quilometros);
        this.numLicença = numLicença;
    }

    public int getNumLicença() {
        return numLicença;
    }

    public void setNumLicença(int numLicença) {
        this.numLicença = numLicença;
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
    public String toString() {
        return super.toString()+"Nº de Licença: "+getNumLicença();
    }
}
