package aula03;
import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int days,year,startday;
        String month;
        
        System.out.println("Mês:???");
        month = sc.nextLine();
        System.out.println("Ano:???");
        year = sc.nextInt();
        System.out.println("Começa:???");
        startday = sc.nextInt();

        switch (month){
            case "novembro":
            case "abril":
            case "junho":
            case "setembro":
                days = 30;
                break;
            case "fevereiro":
                if ((year%4 == 0) && (year%100 != 0) || (year%400 == 0)){
                    days = 29;
                } else { 
                    days = 28;
                } break;
            default: days = 31; 
        }
        
        System.out.println("----------------------");
        System.out.printf("|%2s %2s %2s %2s %2s %2s %2s|\n","Mo","Tu","We","Th","Fr","Sa","Su" );
        System.out.println("----------------------");
        
        for(int i=0;i<startday-1;i++){
            System.out.print("   ");
        }
        for (int i=1;i<=days;i++){
            System.out.printf("%3s",i);
            if(((i + startday-1) % 7 == 0) || (i == days)){
                System.out.println();
            }
        }
        System.out.println("----------------------");








    sc.close();
    }
    
}
