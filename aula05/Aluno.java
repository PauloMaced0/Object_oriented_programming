package aula05;

import java.util.Calendar;

public class Aluno extends Pessoa {
    private static int nMec = 100;
    private Date resgDate;
    private int NMec;

    Aluno(String name,int cc,Date birthDate,Date resgDate){
        super(name,cc,birthDate);
        this.resgDate = resgDate;
        this.NMec = nMec;
        nMec ++;
    }
    Aluno(String name,int cc,Date birthDate){
        super(name, cc, birthDate);
        this.NMec = nMec;
        nMec ++;
        Calendar cal = Calendar.getInstance();
		this.resgDate = new Date(cal.get(Calendar.DAY_OF_MONTH), cal.get(Calendar.MONTH), cal.get(Calendar.YEAR));
    }

    public int getNMec() {
        return NMec;
    }
    public Date getResgDate() {
        return resgDate;
    }
    public void setNMec(int nMec) {
        NMec = nMec;
    }
    public void setResgDate(Date resgDate) {
        this.resgDate = resgDate;
    }

    @Override
    public String toString(){
        return super.toString()+"; Data de inscrição: "+getResgDate()+"; nMec: "+getNMec();
    }
}
