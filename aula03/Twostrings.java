package aula03;
import java.util.Scanner;
import java.lang.String;


public class Twostrings {

    private static int countchar(String string1, String string2) {
        int len_string1 = string1.length();
        int len_string2 = string2.length();
        return len_string1 + len_string2;
    }
    private static void lastchar(String string1,String string2){
        char lastchar1 = string1.charAt(string1.length()-1); 
        char lastchar2 = string2.charAt(string2.length()-1); 
        System.out.println("last char: "+lastchar1);
        System.out.println("last char: "+lastchar2);
        
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First string???");
        String firststring = sc.next();
        System.out.println("Second string???");
        String secondstring = sc.next();
        
        System.out.println(countchar(firststring,secondstring));
        lastchar(firststring, secondstring);
    
    
    
    
    
    
    sc.close();
    }

}
