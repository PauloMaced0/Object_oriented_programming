package aula04;

import java.util.Scanner;

public class UsingCalendar {
    public static void main(String[] args) {

        int operation, start, month, year;
        Scanner sc = new Scanner(System.in);
        Calendar date = new Calendar();
        do {
            System.out.println("Calendar operations:");
            System.out.println("1 - create new calendar");
            System.out.println("2 - print calendar month");
            System.out.println("3 - print calendar");
            System.out.println("0 - exit");
            operation = sc.nextInt();
            switch (operation) {
                case 0:
                    break;
                case 1:
                    System.out.println("Dia em que começa");
                    start = sc.nextInt();
                    System.out.println("Mês");
                    month = sc.nextInt();
                    System.out.println("Ano");
                    year = sc.nextInt();
                    date.setfirstWeekdayOfYear(start);
                    date.setMonth(month);
                    date.setYear(year);
                    break;
                case 2:
                    System.out.println("Mês");
                    month = sc.nextInt();
                    date.setMonth(month);
                    date.printMonth(month);
                    break;
                case 3:
                    date.toString();
                    break;
                default:
                    System.out.println("BYE!!!");
            }
        } while (operation != 0);
        sc.close();

    }
}
