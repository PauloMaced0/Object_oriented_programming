package aula09;

import java.util.*;

public class UsingConjterm {
    public static void main(String[] args) {
        ArrayList<Conjterm> conj = new ArrayList<>();

        Conjterm t1 = new Conjterm("branco", "Que tem cor da neve");
        Conjterm t2 = new Conjterm("preto", "Que tem cor da grafite");
        Conjterm t3 = new Conjterm("verde", "Que tem cor da maça");
        Conjterm t4 = new Conjterm("azul", "Que tem cor do céu");
        Conjterm t5 = new Conjterm("vermelho", "Que tem cor do sangue");

        conj.add(t1);
        conj.add(t2);
        conj.add(t3);
        conj.add(t4);
        conj.add(t5);

        for(Conjterm ele : conj){
            System.out.println(ele);
        }
    }
}
