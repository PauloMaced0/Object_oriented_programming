package aula04;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date() {
        this.day = 2;
        this.month = 7;
        this.year = 2002;
    }

    private Boolean validMonth(int month) {
        return month >= 1 && month <= 12;
    }

    private Boolean leapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
    }

    public Boolean valid(int day, int month, int year) {
        if (validMonth(month) && monthDays(month, year) >= day && day > 0 && year > 0) {
            return true;
        } else {
            return false;
        }
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

    private int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    private int getMonth() {
        return month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    private int getYear() {
        return year;
    }

    public String toString() {
        return getYear() + "-" + getMonth() + "-" + getDay();
    }

    public void increment() {
        if (getDay() == 31 && getMonth() == 12) {
            setDay(1);
            setMonth(1);
            setYear(year + 1);
        } else if (day == 28 && monthDays(month, year) == 28) {
            setDay(1);
            setMonth(month + 1);
        } else if (day == 29 && monthDays(month, year) == 29) {
            setDay(1);
            setMonth(month + 1);
        } else if (day == 30 && monthDays(month, year) == 30) {
            setDay(1);
            setMonth(month + 1);
        } else if (day == 31 && monthDays(month, year) == 31) {
            setDay(1);
            setMonth(month + 1);
        } else {
            setDay(day + 1);
        }
    }

    public void decrement() {
        if (getDay() == 1 && getMonth() == 1) {
            setDay(31);
            setMonth(12);
            setYear(year - 1);
        } else if (getDay() == 1 && getMonth() == 3 && monthDays(2, year) == 29) {
            setDay(29);
            setMonth(2);
        } else if (getDay() == 1 && getMonth() == 3 && monthDays(2, year) == 28) {
            setDay(28);
            setMonth(2);
        } else if (day == 1 && monthDays(month - 1, year) == 30) {
            setDay(30);
            setMonth(month - 1);
        } else if (day == 1 && monthDays(month - 1, year) == 31) {
            setDay(31);
            setMonth(month - 1);
        } else {
            setDay(day - 1);
        }

    }

}
