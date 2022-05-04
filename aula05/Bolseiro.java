package aula05;

public class Bolseiro extends Aluno {
    private int Bolsa;

    Bolseiro(String name, int cc, Date birthDate, int Bolsa) {
        super(name, cc, birthDate);
        this.Bolsa = Bolsa;
    }

    public int getBolsa() {
        return Bolsa;
    }

    public void setBolsa(int bolsa) {
        Bolsa = bolsa;
    }

    @Override
    public String toString() {
        return super.toString()+"; Bolsa: "+getBolsa();
    }
}
