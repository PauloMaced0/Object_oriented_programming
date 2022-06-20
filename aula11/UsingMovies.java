package aula11;

import java.io.*;
import java.util.*;

public class UsingMovies {
    public static void main(String[] args) throws IOException{
        ArrayList<Movie> ListMovies = new ArrayList<Movie>();
        Set<String> ListGenre = new HashSet<>();
        Scanner sc = new Scanner(new FileReader("movies.txt"));

        sc.nextLine();
        while(sc.hasNextLine()){
            String [] data = sc.nextLine().split("\t");
            ListMovies.add(new Movie(data[0],Double.parseDouble(data[1]), data[2], data[3],Integer.parseInt(data[4])));
        }
        System.out.format("%-38s %-5s %-6s %-9s %-4s \n","Name","Score","Rating","Genre","Running time");
        ListMovies.forEach(element -> {System.out.println(element);});
        System.out.println("-------------------------------------------");

        System.out.format("%-38s %-5s %-6s %-9s %-4s \n","Name","Score","Rating","Genre","Running time");
        ListMovies.sort(Comparator.comparing(Movie :: getName));
        ListMovies.forEach(element -> {System.out.println(element);});
        System.out.println("-------------------------------------------");

        System.out.format("%-38s %-5s %-6s %-9s %-4s \n","Name","Score","Rating","Genre","Running time");
        ListMovies.sort(Comparator.comparing(Movie :: getScore).reversed());
        ListMovies.forEach(element -> {System.out.println(element);});
        System.out.println("-------------------------------------------");

        ListMovies.sort(Comparator.comparing(Movie :: getRunning_time));
        ListMovies.forEach(element -> {System.out.println(element);});
        System.out.println("-------------------------------------------");
        
        ListMovies.forEach(element -> {ListGenre.add(element.getGenre());});
        for(String x : ListGenre){
            System.out.println(x);
        }

        FileWriter writer = new FileWriter("myselection.txt");
        for(Movie element : ListMovies){
            if((element.getScore() > 60) && (element.getGenre().equals("comedy"))){
                try {
                    writer.write(element.getName() + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        writer.close();
    }
}
