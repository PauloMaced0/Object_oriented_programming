package aula06;

import java.util.Scanner;

public class UsingDate {
    public static void main(String[] args) {
        DateYMD date = new DateYMD();
        int day, month, year, d, m, y, operation;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Date operations:");
            System.out.println("1 - create new date");
            System.out.println("2 - show current date");
            System.out.println("3 - increment date");
            System.out.println("4 - decrement date");
            System.out.println("5 - Diferança de dias(desde 1 de janeiro de 2000)");
            System.out.println("0 - exit");
            operation = sc.nextInt();
            switch (operation) {
                case 0:
                    break;
                case 1:
                    System.out.println("Dia");
                    day = sc.nextInt();
                    System.out.println("Mês");
                    month = sc.nextInt();
                    System.out.println("Ano");
                    year = sc.nextInt();
                    
                    if (date.valid(day, month, year)) {
                        date.setDay(day);
                        date.setMonth(month);
                        date.setYear(year);
                    }
                    break;
                case 2:
                    System.out.println(date.toString());
                    break;
                case 3:
                    date.increment();
                    break;
                case 4:
                    date.decrement();
                    break;
                case 5:
                    System.out.println("Dia?");
                    d = sc.nextInt();
                    System.out.println("Mês?");
                    m = sc.nextInt();
                    System.out.println("Ano?");
                    y = sc.nextInt();
                    DateND difDate = new DateND(d, m, y);
                    System.out.println(difDate); 
                    break;
                default:
                    System.out.println("BYE!!!");
                }
            } while(operation !=0);
            sc.close();
        }
}
