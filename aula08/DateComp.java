package aula08;

public class DateComp implements Comparable<DateComp> {
    private int day;
    private int month;
    private Integer year;

    public DateComp(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return getDay() + "/" + getMonth() + "/" + getYear();
    }

    @Override
    public int compareTo(DateComp o) {
        return this.year.compareTo(o.year);
    }
}
