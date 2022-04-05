package aula04;

import java.util.Scanner;

public class UsingGeometricClasses {
    public static void main(String[] args) {

        int operation;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Geometric operations:");
            System.out.println("1 - create new circule");
            System.out.println("2 - show circule");
            System.out.println("3 - equals(circule)");
            System.out.println("4 - create new rectangle");
            System.out.println("5 - show rectangle");
            System.out.println("6 - equals(rectangle)");
            System.out.println("7 - create new triangle");
            System.out.println("8 - show triangle");
            System.out.println("9 - equals(triangle)");
            System.out.println("0 - exit");
            operation = sc.nextInt();
            switch (operation) {
                case 0:
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
            }
        } while (operation != 0);
        sc.close();
    }
}
