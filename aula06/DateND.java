package aula06;

public class DateND extends DateYMD {

    DateND(int day,int month,int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int difDays(){
        int difdays = 0;
        for(int y = 2000;y<=getYear();y++){
            if(y == getYear()){
                for(int m = 1;m<=getMonth();m++){
                    difdays += monthDays(m,y);
                }
            } else {
                for(int m = 1;m<=12;m++){
                    difdays += monthDays(m,y);
                }
            }
        }
        return difdays-(monthDays(getMonth(), getYear())-getDay());
    }
    @Override
    public String toString(){
        return super.toString()+" "+difDays() +" dias desde 1 de janeiro de 2000";
    }
}
