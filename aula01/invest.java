package aula01;
import java.util.Scanner;

public class invest {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double investment,tax,mes_1,mes_2,mes_3;
    System.out.println("Investimento:???");
    investment = sc.nextDouble();
    System.out.println("Taxa de juro:???");
    tax = sc.nextDouble();
    mes_1 = (investment*(tax/100))+investment;
    mes_2 = (mes_1*(tax/100))+mes_1;
    mes_3 = (mes_2*(tax/100))+mes_2;
    System.out.format("Total = %.3f€\n",mes_3);
    
    sc.close();            
    }
}
