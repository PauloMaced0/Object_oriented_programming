package aula04;

import java.util.Scanner;

public class UsingGeometricClasses {
    public static void main(String[] args) {

        double raio, lado1, lado2, lado3, altura, comprimento;
        int operation;
        Scanner sc = new Scanner(System.in);
        Circulo circulo = new Circulo();
        Retangulo retangulo = new Retangulo();
        Triangulo triangulo = new Triangulo();
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
                    System.out.println("Raio:");
                    raio = sc.nextDouble();
                    if (circulo.valid()) {
                        circulo.setRaio(raio);
                    } else {
                        System.out.println("Not Valid!!!");
                    }
                    break;
                case 2:
                    System.out.println(circulo.toString());
                    break;
                case 3:
                    System.out.println("Raio:");
                    raio = sc.nextDouble();
                    System.out.println(circulo.equals(raio));
                    break;
                case 4:
                    System.out.println("Altura");
                    altura = sc.nextDouble();
                    System.out.println("Comprimento");
                    comprimento = sc.nextDouble();
                    if (retangulo.valid()) {
                        retangulo.setAltura(altura);
                        retangulo.setComprimento(comprimento);
                    } else {
                        System.out.println("Not Valid!!!");
                    }
                    break;
                case 5:
                    System.out.println(retangulo.toString());
                    break;
                case 6:
                    System.out.println("Altura");
                    altura = sc.nextDouble();
                    System.out.println("Comprimento");
                    comprimento = sc.nextDouble();
                    System.out.println(retangulo.equals(altura, comprimento));
                    break;
                case 7:
                    System.out.println("Lado1");
                    lado1 = sc.nextDouble();
                    System.out.println("Lado2");
                    lado2 = sc.nextDouble();
                    System.out.println("Lado3");
                    lado3 = sc.nextDouble();
                    if(triangulo.valid()){
                        triangulo.setLado1(lado1);
                        triangulo.setLado2(lado2);
                        triangulo.setLado3(lado3);
                    } else {
                        System.out.println("Not Valid!!!");
                    }
                    break;
                case 8:
                    System.out.println(triangulo.toString());
                    break;
                case 9:
                    System.out.println("Lado1");
                    lado1 = sc.nextDouble();
                    System.out.println("Lado2");
                    lado2 = sc.nextDouble();
                    System.out.println("Lado3");
                    lado3 = sc.nextDouble();
                    System.out.println(triangulo.equals(lado1, lado2, lado3));
                    break;
                default:
                    System.out.println("BYE!!!");
            }
        } while (operation != 0);
        sc.close();
    }
}
