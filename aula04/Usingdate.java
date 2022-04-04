package aula04;

import java.util.Scanner;

public class Usingdate {
    public static void main(String[] args) {
        Date date = new Date();
        int day, month, year, operation;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Date operations:");
            System.out.println("1 - create new date");
            System.out.println("2 - show current date");
            System.out.println("3 - increment date");
            System.out.println("4 - decrement date");
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
                default:
                    System.out.println("BYE!!!");
            }
        } while(operation !=0);
        sc.close();
    }
}
