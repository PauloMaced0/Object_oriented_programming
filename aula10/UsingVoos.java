package aula10;

import java.io.*;
import java.util.*;

public class UsingVoos {
    public static String content3 = "";
    public static String content2 = "";
    public static String content = "";
    public static ArrayList<Voos> V = new ArrayList<Voos>();

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileReader("voos.txt"));
        sc.nextLine();
        while (sc.hasNextLine()) {
            String[] values = sc.nextLine().split("\t");
            if (values.length == 4) {
                V.add(new Voos(values[0], values[1], values[2], values[3]));
            } else {
                V.add(new Voos(values[0], values[1], values[2]));
            }
        }

        try {
            File myObj = new File("Infopublico.txt");
            FileWriter myWriter = new FileWriter("Infopublico.txt");
            myWriter.write(info_voos());
            myWriter.close();
            myObj.createNewFile();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            File myObj2 = new File("cidades.txt");
            FileWriter writer = new FileWriter("cidades.txt");
            writer.write(chegadascidades());
            writer.close();
            myObj2.createNewFile();
        } catch (Exception a) {
            a.printStackTrace();
        }

        System.out.println(info_voos());
        System.out.println(media_atrasos(atrasomedio()));

    }

    public static String info_voos() {

        String headtable = String.format("%-7s %-8s %-21s %-21s %-7s %-7s \n", "Hora", "Voo", "Companhia", "Origem",
                "Atraso", "Obs");
        V.forEach(elemets -> content += elemets + "\n");

        return headtable + content;
    }

    public static String chegadascidades() {
        TreeMap<String, Integer> S = new TreeMap<String, Integer>();
        V.forEach(elements -> {
            if (!S.containsKey(elements.getOrigem())) {
                S.put(elements.getOrigem(), 1);
            } else {
                S.put(elements.getOrigem(), S.get(elements.getOrigem()) + 1);
            }
        });

        String headertable = String.format("%-21s %-5s \n", "Origem", "Voos");
        for (Map.Entry<String, Integer> entry : S.entrySet())
            content2 += String.format("%-21s %-5s \n", entry.getKey(), entry.getValue());
        return headertable + content2;
    }

    public static String media_atrasos(TreeMap<String, String> TreeMap) {
        String headtable = String.format("%-21s %-7s \n", "Companhia", "Atraso médio");
        TreeMap.forEach((key, atraso) -> content3 += String.format("%-21s %-7s \n", key,atraso));
        return headtable + content3;
    }

    public static TreeMap<String, String> atrasomedio() {
        HashMap<String, ArrayList<Integer>> AM = new HashMap<String, ArrayList<Integer>>();
        TreeMap<String, String> treemap = new TreeMap<>();
        V.forEach(elements -> {
            if (!elements.getAtraso().equals("")) {
                int hora = Integer.parseInt(elements.getAtraso().substring(0, 2)) * 60;
                int min = Integer.parseInt(elements.getAtraso().substring(3, 5));

                if (!AM.containsKey(elements.getCompanhia())) {
                    AM.put(elements.getCompanhia(), new ArrayList<>());
                    AM.get(elements.getCompanhia()).add(hora + min);
                } else {
                    AM.get(elements.getCompanhia()).add(hora + min);
                }
            }
        });
        AM.forEach((key, array) -> {
            int hora_atrasomedio;
            int min_atrasomedio;
            int atraso_medio = 0;
            for (int number : array) {
                atraso_medio += number;
            }
            atraso_medio = atraso_medio / array.size();

            hora_atrasomedio = atraso_medio / 60;
            min_atrasomedio = atraso_medio % 60;
            String atraso = String.format("%02d:%02d", hora_atrasomedio, min_atrasomedio);
            treemap.put(key, atraso);
        });

        return treemap;
    }
}
