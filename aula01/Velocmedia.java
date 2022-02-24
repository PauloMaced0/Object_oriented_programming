package aula01;
import java.util.Scanner;

public class Velocmedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v1,v2,vmedia;
        System.out.println("V1:???");
        v1 = sc.nextDouble();
        System.out.println("V2:???");
        v2 = sc.nextDouble();
        vmedia = (v1+v2)/2;
        System.out.println("Velocidade média:"+vmedia);
        sc.close();
        
        
    }
}
