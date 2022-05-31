package aula09;

public class Conjterm {
    private String termo;
    private String significado;

    public Conjterm(String termo, String significado) {
        this.termo = termo;
        this.significado = significado;
    }

    public String getSignificado() {
        return significado;
    }

    public String getTermo() {
        return termo;
    }

    public void setSignificado(String significado) {
        this.significado = significado;
    }

    public void setTermo(String termo) {
        this.termo = termo;
    }
    
    public String toString(){
        return getTermo() + " - " + getSignificado();
    }
}