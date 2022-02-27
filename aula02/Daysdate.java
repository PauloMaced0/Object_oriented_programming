package aula02;
import java.util.Scanner;

public class Daysdate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days,year;
        String month;
        
        System.out.println("Mês:???");
        month = sc.nextLine();
        System.out.println("Ano:???");
        year = sc.nextInt();

        switch (month){
            case "novembro":
                days = 30;
                break;
            case "abril":
                days = 30;
                break;
            case "junho":
                days = 30;
                break;
            case "setembro":
                days = 30;
                break;
            case "fevereiro":
                if ((year%4 == 0) && (year%400 == 0) && (year%100 == 0)){
                    days = 29;
                } else { 
                    days = 28;
                } break;
            default: days = 31; 
        }
        System.out.format("O mês de %s no ano %d tem %d \n",month,year,days);
        sc.close();
    }
    
}
    