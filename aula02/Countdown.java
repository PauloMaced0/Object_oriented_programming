package aula02;
import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número:???");
        int number = sc.nextInt();
        
        
        for(int i = number;i >= 0;i--){
            System.out.println(i);
            
        }
        sc.close();
    }
}
