package aula04;

import java.util.ArrayList;

public class User {
    ArrayList<TupleData> emprest = new ArrayList<TupleData>();
    private String nome;
    private int nMec;
    private String curso;

    public User(String nome, int nMec, String curso) {
        this.curso = curso;
        this.nMec = nMec;
        this.nome = nome;
    }

    public User() {
    }

    public User(int nMec) {
        this.nMec = nMec;
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

    public String toString() {
        return "Aluno: " + getnMec() + "; " + getNome() + "; " + getCurso();
    }


    public void list_of_given_books(int idbook) {
        emprest.add(new TupleData(getnMec(), idbook));
    }

    public void remover_emprestimo(int id) {
        for (int i = 0; i < emprest.size();) {
            if (emprest.get(i).getIdbook() == id)
                emprest.remove(i);
        }
    }
    public Boolean verifyemprest(int nMec){
        int count = 0;
        for(int i = 0; i < emprest.size();i++){
            if(emprest.get(i).getNumermec() == getnMec()){
                count +=1;
            }
        }
        if(count == 3){
            return false;
        }
        return true;
    }
}