package aula02;
import java.util.Scanner;

public class Countingbits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long number;    
        System.out.println("Number:???");
        number = sc.nextLong();
        
        for(long i = 1<<7;i>0;i=i/2){
            if((number & i) !=0){
                System.out.print("1");
            } else {
                System.out.print("0");
            }
        }
        System.out.print("\n");


        sc.close();
    }
}
