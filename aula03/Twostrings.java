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
    private static boolean equalstrings(String string1,String string2){
        return(string1.equals(string2));
    }
    private static boolean dot(String string2){
        return(string2.endsWith("."));
    }
    private static boolean lowercase(String string2){
        for(int i = 0;i < string2.length();i++){
            if(Character.isUpperCase(string2.charAt(i))){
                return false;
            }
        }
        return true;
    }
    private static void toupper(String string1,String string2) {
        System.out.println(string1.toLowerCase());
        System.out.println(string2.toLowerCase());
        
    }
    private static void spaces(String string1,String string2){
        string1 = string1.replaceAll("( )+"," ");
        string2 = string2.replaceAll("( )+"," ");
        System.out.println(string1);
        System.out.println(string2);
    }
    private static void capitalletter(String string1,String string2){
        System.out.println(string1.substring(0, 1).toUpperCase() + string1.substring(1));
        System.out.println(string2.substring(0, 1).toUpperCase() + string2.substring(1));
    }
    private static boolean polidrome(String string){
        String result = "";
        for(int i = string.length()-1;i>=0;i--){
            result += string.charAt(i);
        }
        if(result.equals(string)){
            return true;
        }
        return false;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First string???");
        String firststring = sc.nextLine();
        System.out.println("Second string???");
        String secondstring = sc.nextLine();
        
        System.out.println(); 
        System.out.println(countchar(firststring,secondstring));
        lastchar(firststring, secondstring);
        System.out.println(equalstrings(firststring, secondstring));
        System.out.println(dot(secondstring));
        System.out.println(lowercase(secondstring));
        toupper(firststring, secondstring);
        spaces(firststring, secondstring);
        capitalletter(firststring, secondstring);
        System.out.println(polidrome(firststring)); 
        System.out.println(polidrome(secondstring)); 
        
    
    sc.close();
    }

}
