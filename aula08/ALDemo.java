package aula08;

import aula05.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ALDemo {
    public static void main(String[] args) {
        ArrayList<Integer> c1 = new ArrayList<>();
        for (int i = 10; i <= 100; i += 10) {
            c1.add(i);
        }
        System.out.println("Size: " + c1.size());
        for (int i = 0; i < c1.size(); i++) {
            System.out.println("Elemento: " + c1.get(i));
        }

        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Vento");
        c2.add("Calor");
        c2.add("Frio");
        c2.add("Chuva");
        System.out.println(c2);
        Collections.sort(c2);
        System.out.println(c2);
        c2.remove("Frio");
        c2.remove(0);
        System.out.println(c2);

        c2.add("Blá");
        System.out.println("Lista c2");
        System.out.println("--Método Contains--");
        System.out.println(c2.contains("Vento"));
        System.out.println("--Método IndexOf(\"ups\")--");
        System.out.println(c2.indexOf("ups"));
        System.out.println("--Método IndexOf(\"Chuva\")--");
        System.out.println(c2.indexOf("Chuva"));
        System.out.println("--Método lastIndexOf(\"uv\")--");
        System.out.println(c2.get(0).lastIndexOf("uv"));

        System.out.println("Lista c1");
        System.out.println("--Método hashCode(lista c1)--");
        System.out.println(c1.hashCode());
        System.out.println("--Método lastIndexOf(20)--");
        System.out.println(c1.lastIndexOf(20));
        System.out.println("--Método SubList--");
        System.out.println(c1.subList(1, c1.size() - 1));

        System.out.println("HashSet");
        Set<Pessoa> c3 = new HashSet<>();

        Pessoa p1 = new Pessoa("Abél", 123321, new Date(12, 3, 1999));
        Pessoa p2 = new Pessoa("Climélia", 123098, new Date(1, 2, 1988));
        Pessoa p3 = new Pessoa("Maria", 122837, new Date(3, 3, 1981));
        Pessoa p4 = new Pessoa("Bino", 479812, new Date(13, 8, 1977));
        Pessoa p5 = new Pessoa("Zeca", 754839, new Date(30, 5, 1963));

        c3.add(p1);
        c3.add(p2);
        c3.add(p3);
        c3.add(p4);
        c3.add(p5);
        c3.add(p5);

        for (Iterator<Pessoa> i = c3.iterator(); i.hasNext();) {
            System.out.println(i.next());
        }

        System.out.println("TreeSet");
        Set<Date> c4 = new TreeSet<>();

        Date d1 = new Date(12, 4, 2000);
        Date d2 = new Date(23, 7, 2001);
        Date d3 = new Date(16, 9, 1991);
        Date d4 = new Date(9, 1, 2017);
        Date d5 = new Date(29, 11, 1981);

        c4.add(d1);
        c4.add(d2);   // completar DateComp
        c4.add(d3);
        c4.add(d4);
        c4.add(d5);

        System.out.println(c4);
        for (Iterator<Date> i = c4.iterator(); i.hasNext();) {
            System.out.println(i.next());
        }

    }

}