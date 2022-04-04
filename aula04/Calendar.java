package aula04;

public class Calendar {
    private int year;
    private int firstWeekdayOfYear;
    private int month;

    public Calendar() {
        firstWeekdayOfYear = 7;
        month = 1;
        year = 2000;
    }

    private int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    private int getFirstWeekdayOfYear() {
        return firstWeekdayOfYear;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setfirstWeekdayOfYear(int firstWeekdayOfYear) {
        this.firstWeekdayOfYear = firstWeekdayOfYear;
    }

    public void setYear(int year) {
        this.year = year;
    }

    private Boolean leapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
    }

    private int monthDays(int month, int year) {
        if (leapYear(year)) {
            int[] days = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
            return days[month - 1];
        } else {
            int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
            return days[month - 1];
        }
    }

    private int FirstWeekdayOfMonth(int month) {
        int totaldays = getFirstWeekdayOfYear();
        for (int i = 1; i < month; i++) {
            totaldays += monthDays(i, year);
        }
        if (totaldays % 7 == 0) {
            return 7;
        }
        return totaldays % 7;
    }

    public void printMonth(int month) {
        String[] stringmonth = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio",
                "Junho", "julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" };
        System.out.printf(" %10s de %4s\n", stringmonth[month - 1], getYear());
        System.out.printf("%3s%3s%3s%3s%3s%3s%3s\n", "Mo", "Tu", "We", "Th", "Fr", "Sa", "Su");
        for (int i = 0; i < FirstWeekdayOfMonth(month) - 1; i++) {
            System.out.print("   ");
        }
        for (int i = 1; i <= monthDays(month, year); i++) {
            System.out.printf("%3s", i);
            if (((i + FirstWeekdayOfMonth(month) - 1) % 7 == 0) || (i == monthDays(month, year))) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public String toString() {
        for (int i = 1; i <= 12; i++) {
            printMonth(i);
        }

        return "";
    }
}
