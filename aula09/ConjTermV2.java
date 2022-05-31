package aula09;

import java.util.*;

public class ConjTermV2 {
    private String termo;
    private String significado;
    TreeMap<String, ArrayList<String>> conj = new TreeMap<>();

    public ConjTermV2() {
    }

    public void add(String termo, String significado) {
        setTermo(termo);
        setSignificado(significado);
        if (conj.containsKey(termo)) {
            conj.get(termo).add(significado);
        } else {
            conj.put(termo, new ArrayList<>());
            conj.get(termo).add(significado);
        }
    }

    public String getSignificado() {
        return significado;
    }

    public void setSignificado(String significado) {
        this.significado = significado;
    }

    public String getTermo() {
        return termo;
    }

    public void setTermo(String termo) {
        this.termo = termo;
    }

    public TreeMap<String, ArrayList<String>> getConj() {
        return conj;
    }

    public void setConj(TreeMap<String, ArrayList<String>> conj) {
        this.conj = conj;
    }

    public String toString() {
        String printstr="";
        for(Map.Entry<String,ArrayList<String>> entry : conj.entrySet())
            for(String str: entry.getValue())    
                printstr += entry.getKey()+" - "+str+"\n";
        return printstr;
    }

}
