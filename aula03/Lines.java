package aula03;
import java.util.ArrayList;
import java.util.Scanner;

public class Lines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("!!!Texto!!!");
        String paragraph; 
        paragraph = sc.nextLine();
        // paragraph = "O que tu queres sei eu, p**** e vinho verde! Gostas de panados? Ou queres uma pipoca...";
        
        ArrayList<String> wordlist = new ArrayList<>(); 
        String [] words = paragraph.split("[ ,]+");

        int phrasecount = 0;
        for(String a : words){
            wordlist.add(a);
            System.out.print(a+" ");
            if(a.substring(a.length()-1).matches("\\!|\\.|\\?")){
                System.out.println(a.length()-1);
                phrasecount +=1;
                System.out.println();
            }
        }
        System.out.format("Contém %s palavras\n",wordlist.size());
        System.out.println("Nº de frases:"+phrasecount);

    sc.close();
    }
}
