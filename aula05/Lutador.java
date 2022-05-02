package aula05;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double peso, altura;
    private String categoria;
    private int vitorias, derrotas, empates;

    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas,
            int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public void apresentar() {
        System.out.println("Nome: "+getNome());
        System.out.println("Nacionalidade: "+getNacionalidade());
        System.out.println("Idade: "+getIdade());
        System.out.println("Peso: "+getPeso());
        System.out.println(getVitorias()+" vitórias");
        System.out.println(getDerrotas()+" derrotas");
        System.out.println(getEmpates()+ " empates");
    }

    public void status() {
        System.out.println(getNome() +" " +getCategoria());
        System.out.println(getVitorias() +" "+getDerrotas() +" "+ getEmpates());
    }

    public void ganharLuta() {
        setVitorias(getVitorias()+1);
    }

    public void perderLuta() {
        setDerrotas(getDerrotas()+1);
    }

    public void empatarLuta() {
        setEmpates(getEmpates()+1);
    }

    public double getAltura() {
        return altura;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public int getIdade() {
        return idade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    private void setCategoria() {
        if(getPeso()<=52.2){
            categoria = "Inválido";
        } else if(getPeso()<= 70.3){
            categoria = "Leve";
        } else if(getPeso()<= 83.9){
            categoria = "Médio";
        } else if(getPeso()<= 120.2){
            categoria = "Pesado";
        } else {    
            categoria = "Inválido";
        }
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        setCategoria();
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
}