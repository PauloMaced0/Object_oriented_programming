package aula06;

public class DateYMD extends Date {

    public DateYMD() {
        this.day = 2;
        this.month = 7;
        this.year = 2002;
    }

    public String toString() {
        return getYear() + "-" + getMonth() + "-" + getDay();
    }
}
    