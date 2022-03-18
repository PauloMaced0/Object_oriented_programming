package aula02;

import java.util.Scanner;

public class Invest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tax,invest;
        do{ 
            System.out.println("Investimento???");
            invest = sc.nextInt();
        } while(invest % 1000 != 0 || invest<1000);
        do{
            System.out.println("Taxa de juro (%)???");
            tax = sc.nextDouble();
        } while(tax<0 || tax >5);
        for(int i = 0;i<12;i++){
            invest += (tax/100)*invest;
            System.out.printf("Total = %.3f€\n",invest);
        }
        sc.close();
    }
}
