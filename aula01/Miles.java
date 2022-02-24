package aula01;
import java.util.Scanner;

public class Miles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km , miles;
        System.out.println("Km:???");
        km = sc.nextDouble();
        miles = km / 1.609;
        System.out.println("Em milhas:"+miles);
        sc.close();
    }
}
