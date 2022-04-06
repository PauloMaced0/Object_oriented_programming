package aula04;

public class User {
    private String nome;
    private int nMec;
    private String curso;

    public User(String nome, int nMec, String curso) {
        this.curso = curso;
        this.nMec = nMec;
        this.nome = nome;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setnMec(int nMec) {
        this.nMec = nMec;
    }

    public String getCurso() {
        return curso;
    }

    public String getNome() {
        return nome;
    }

    public int getnMec() {
        return nMec;
    }
    public String toString(){
        return "Aluno: "+getnMec()+"; "+getNome()+"; "+getCurso();
    }
}
