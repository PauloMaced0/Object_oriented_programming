package aula06;

public class Carro {
    private String tipomotor;
    private char classe;
    private boolean disponibilidade;
    private static int n = 0;
    private int codigo;
    String[] motor = { "gasolina", "diesel", "híbrido", "elétrico" };
    char[] clas = { 'A', 'B', 'C', 'D', 'E', 'F' };

    Carro() {
        setTipomotor(typesmotor());
        setClasse(typesclass());
        this.disponibilidade = true;
        setCodigo(n++);
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setClasse(char classe) {
        this.classe = classe;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setTipomotor(String tipomotor) {
        this.tipomotor = tipomotor;
    }

    public char getClasse() {
        return classe;
    }

    public String getTipomotor() {
        return tipomotor;
    }

    public String typesmotor() {
        int index = (int) ((Math.random() * 3) + 1);
        return motor[index];
    }

    public char typesclass() {
        int index = (int) ((Math.random() * 4) + 1);
        return clas[index];
    }

    @Override
    public String toString() {
        return "Código: "+getCodigo()+" Classe: " + getClasse() + " Tipo de motorização: " + getTipomotor();
    }

}
