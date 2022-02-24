package aula01;
import java.util.Scanner;

public class Farenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius,farenheit;
        System.out.println("Celsius:???");
        celsius = sc.nextDouble();
        farenheit = 1.8*celsius + 32;
        System.out.println("Celsius em Farenheit:"+farenheit); 
        sc.close();

    }
}
