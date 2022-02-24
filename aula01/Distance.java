package aula01;
import java.util.Scanner;
import java.lang.Math;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1,y1,x2,y2;
        double dist;
        System.out.println("X1:???");
        x1 = sc.nextInt();
        System.out.println("Y1:???");
        y1 = sc.nextInt();
        System.out.println("X2:???");
        x2 = sc.nextInt();
        System.out.println("Y2:???");
        y2 = sc.nextInt();

        dist = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        System.out.println("Distância entre os dois pontos:"+dist);
        sc.close();
    }    
}
