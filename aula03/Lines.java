package aula03;
// import java.util.ArrayList;
import java.util.Scanner;

public class Lines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("!!!Texto!!!");
        String line; 
        line = sc.nextLine();
        sc.close();
        
        // usando arralist
        // ArrayList<String> wordlist = new ArrayList<>(); 
        // String [] words = line.split("[ ,]+");

        // em caso de parágrafo dar print a cada linha e contar o nº de frases
        // int phrasecount = 0;
        // for(String a : words){
        //     wordlist.add(a);
        //     System.out.print(a+" ");
        //     if(a.substring(a.length()-1).matches("\\!|\\.|\\?")){
        //         System.out.println(a.length()-1);
        //         phrasecount +=1;
        //         System.out.println();
        //     }
        // }
        
        // System.out.format("Contém %s palavras\n",wordlist.size());
        // System.out.println("Nº de frases:"+phrasecount);
        
        // tornando a string num array
        // String [] stringvector = line.split(" +"); 
        // for (String word : stringvector){
        //     System.out.print(word.toLowerCase()+" ");
        // } 
        System.out.println("Minúsculas");
        System.out.println(line.toLowerCase());

        System.out.println("Última letra");
        System.out.println(line.substring(line.length()-1));
        
        System.out.println("3 primeiras letras");
        System.out.println(line.substring(0,3));
        
        System.out.println("Acaba com . ");
        System.out.println(line.endsWith("."));
        
        System.out.println("Nº de carateres");
        System.out.println(line.length());
        
        System.out.println("Troca de espaço por !");
        System.out.println(line.replace(" ", "!"));

    }
}
