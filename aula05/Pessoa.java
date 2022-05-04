package aula05;

public abstract class Pessoa {
    private String name;
    private int cc;
    private Date birthdate;

    Pessoa(String name, int cc,Date birthDate){
        this.name = name;
        this.cc = cc;
        this.birthdate = birthDate; 
    }
    public Date getBirthdate() {
        return birthdate;
    }

    public int getCc() {
        return cc;
    }

    public String getName() {
        return name;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return getName()+"; CC: "+getCc()+"; Data de Nascimento: "+getBirthdate();
    }

}
