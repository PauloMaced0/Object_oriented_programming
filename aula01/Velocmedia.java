package aula01;
import java.util.Scanner;

public class Velocmedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v1,v2,d1,d2,t1,t2,velocmedia;
        System.out.println("V1(km/h):???");
        v1 = sc.nextDouble();
        System.out.println("D1(km):???");
        d1 = sc.nextDouble();
        System.out.println("V2(km/h):???");
        v2 = sc.nextDouble();
        System.out.println("D2(km):???");
        d2 = sc.nextDouble();
        
        t1 = d1/v1;
        t2 = d2/v2;
        velocmedia = (d1+d2)/(t1+t2);
        System.out.format("Velocidade média final: %4.2f km/h \n",velocmedia);

        sc.close();
        
        
    }
}
