package aula04;

public class Book {
    private static int idcount = 99;
    private int id;
    private String titulo;
    private String tipoEmprestimo;

    public Book(String titulo,String tipoEmprestimo){
        this.titulo = titulo;
        this.tipoEmprestimo = tipoEmprestimo;
        setId(++idcount);
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setTipoEmprestimo(String tipoEmprestimo) {
        this.tipoEmprestimo = tipoEmprestimo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getId() {
        return id;
    }
    public String getTipoEmprestimo() {
        return tipoEmprestimo;
    }
    public String getTitulo() {
        return titulo;
    }
    public String toString(){
        return "Livro "+getId()+"; "+getTitulo()+"; "+getTipoEmprestimo();
    }
}
