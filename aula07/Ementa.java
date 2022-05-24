package aula07;

import java.util.ArrayList;

public class Ementa {
    protected String nome;
    protected String local;
    protected ArrayList<Object> pratoslist = new ArrayList<>();

    Ementa(String nome, String local) {
        this.nome = nome;
        this.local = local;
    }

    public String getLocal() {
        return local;
    }

    public String getNome() {
        return nome;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void addPrato(Prato prato,DiaSemana diaSemana){
        pratoslist.add(prato);
        pratoslist.add(diaSemana);
    }

    @Override
	public String toString() {
		
		String text = "";
		
		for(Object elemento : pratoslist) {
			text += (elemento.toString() + "\n");
		}
		
		return text;
	}
}
