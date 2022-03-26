package aula03;
import java.util.Scanner;

public class Phrase {

    private static int countdigits(String string1){
        int digits = 0;
        for(int i = 0;i < string1.length();i++){
            if(Character.isDigit(string1.charAt(i))){
                digits += 1;
            }
        }
        return digits;
    }
    private static int countchar(String string1) {
        int len_string1 = string1.length();
        return len_string1;
    }
    private static void lastchar(String string1){
        char lastchar1 = string1.charAt(string1.length()-1); 
        System.out.println("last char: "+lastchar1);
        
    }
    private static boolean dot(String string2){
        return(string2.endsWith("."));
    }
    private static boolean lowercase(String string1){
        for(int i = 0;i < string1.length();i++){
            if(Character.isUpperCase(string1.charAt(i))){
                return false;
            }
        }
        return true;
    }
    private static void toupper(String string1) {
        System.out.println(string1.toUpperCase());
        
    }
    private static void spaces(String string1){
        string1 = string1.replaceAll("( )+"," ");
        System.out.println(string1);
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
        System.out.println("STRING???");
        String string = sc.nextLine();
        sc.close();
        
        System.out.println(); 
        System.out.println("Nº de dígitos");
        System.out.println(countdigits(string));       

        System.out.println("Nº de carateres");
        System.out.println(countchar(string));

        System.out.println("Última letra");
        lastchar(string);

        System.out.println("Acaba com ponto?");
        System.out.println(dot(string));

        System.out.println("Só contém minúsculas?");
        System.out.println(lowercase(string));

        System.out.println("Tudo em Maiúsculas");
        toupper(string);

        System.out.println("Retirar espaços a mais");
        spaces(string);

        System.out.println("É políndromo");
        System.out.println(polidrome(string)); 
    }
}
