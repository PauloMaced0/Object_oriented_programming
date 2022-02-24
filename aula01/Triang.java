package aula01;
import java.util.Scanner;
import java.lang.Math;

public class Triang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double lado_a,lado_b,hypotenuse,angle;
        System.out.println("Lado A:???");
        lado_a = sc.nextDouble();
        System.out.println("Lado B:???");
        lado_b = sc.nextDouble();
        
        hypotenuse = Math.sqrt(Math.pow(lado_a, 2) + Math.pow(lado_b,2));
        angle = Math.toDegrees(Math.acos(lado_a/hypotenuse));
        
        System.out.format("Hypotenuse: %4.2f \n",hypotenuse);
        System.out.format("Angle between hypotenuse and A: %2.1f \n",angle);
        
        sc.close();
    }
}
