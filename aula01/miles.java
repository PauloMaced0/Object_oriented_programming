package aula01;
import java.util.Scanner;

public class miles{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km,miles;
        System.out.print("Distância em Km:"); 
        km = sc.nextDouble();
        miles = km /1.609;
        System.out.println("Distância em milhas é:" + miles);
        sc.close();
    }

}
