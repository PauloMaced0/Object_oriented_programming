package aula01;
import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor1,valor2;
        System.out.println("1º Operando:");
        valor1 = sc.nextDouble();
        System.out.println("2º Operando");
        valor2 = sc.nextDouble();

        System.out.println("\nOperações Possíveis -->");
        System.out.println("Sum(+)");
        System.out.println("Subtraction(-)");
        System.out.println("Multiplication(*)");
        System.out.println("Divison(/)");
        String operação = sc.next();
        
        String ope;
        double calculo = 0;
        switch(operação){
            case "+":
                ope = "Sum";
                calculo = valor1 + valor2;
                break;
            case "-":
                ope = "Subtraction";
                calculo = valor1 - valor2;
                break;
            case "*":
                ope = "Multiplication";
                calculo = valor1 * valor2;
                break;
            case "/":
                ope = "Division";
                calculo = valor1 / valor2;
                break;
            default: ope="ERROR!!!" ;
        }
        System.out.format("%s: %4.2f \n",ope,calculo);
        sc.close();
    }
}