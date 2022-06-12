package aula10;

import java.io.*;
import java.util.*;

public class Voos {
    private String hora;
    private String voo;
    private String origem;
    private String atraso;
    private String companhia;
    private String observaçao;

    private HashMap<String, String> companhias = new HashMap<>();

    public Voos(String hora, String voo, String origem, String atraso) throws FileNotFoundException {
        this.atraso = atraso;
        this.hora = hora;
        this.origem = origem;
        this.voo = voo;
        setCompanhia(getCompanhias().get(getVoo().substring(0, 2)));
        setObservaçao(Obs(atraso));
    }

    public Voos(String hora, String voo, String origem) throws FileNotFoundException {
        this.hora = hora;
        this.origem = origem;
        this.voo = voo;
        setCompanhia(getCompanhias().get(getVoo().substring(0, 2)));
        setAtraso("");
        setObservaçao("");
    }

    public String getObservaçao() {
        return observaçao;
    }

    public void setObservaçao(String observaçao) {
        this.observaçao = observaçao;
    }

    public HashMap<String, String> getCompanhias() throws FileNotFoundException {
        listaCompanhias();
        return companhias;
    }

    public void setCompanhias(HashMap<String, String> companhias) {
        this.companhias = companhias;
    }

    public String getCompanhia() {
        return companhia;
    }

    public String getAtraso() {
        return atraso;
    }

    public String getHora() {
        return hora;
    }

    public String getOrigem() {
        return origem;
    }

    public String getVoo() {
        return voo;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }

    public void setAtraso(String atraso) {
        this.atraso = atraso;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public void setVoo(String voo) {
        this.voo = voo;
    }

    protected void listaCompanhias() throws FileNotFoundException {
        Scanner sc = new Scanner(new FileReader("companhias.txt"));
        sc.nextLine();
        while (sc.hasNextLine()) {
            String[] data = sc.nextLine().split("\t");
            companhias.put(data[0], data[1]);
        }
    }

    private String Obs(String atraso) {
        int horaPrevista = Integer.parseInt(getHora().substring(0, 2)) + Integer.parseInt(getAtraso().substring(0, 2));
        int minutosPrevistos = Integer.parseInt(getHora().substring(3, 5))
                + Integer.parseInt(getAtraso().substring(3, 5));

        if (minutosPrevistos >= 60) {
            horaPrevista += 1;
            minutosPrevistos -= 60;
        }
        if (horaPrevista >= 24) {
            horaPrevista -= 24;
        }
        return String.format("Previsto: %02d:%02d", horaPrevista, minutosPrevistos);
    }

    public String toString() {
        return String.format("%-7s %-8s %-21s %-21s %-7s %-7s", getHora(), getVoo(), getCompanhia(), getOrigem(), getAtraso(),
                getObservaçao());
    }
}