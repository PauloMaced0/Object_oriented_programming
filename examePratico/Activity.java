package examePratico;

public class Activity {
    Integer nrParticipantes;
    double actPrice;

    public Activity(Integer nrParticipantes, double actPrice) {
        this.nrParticipantes = nrParticipantes;
        this.actPrice = actPrice;
    }

    public double getActPrice() {
        return actPrice;
    }

    public Integer getNrParticipantes() {
        return nrParticipantes;
    }

    public void setActPrice(double actPrice) {
        this.actPrice = actPrice;
    }

    public void setNrParticipantes(Integer nrParticipantes) {
        this.nrParticipantes = nrParticipantes;
    }

}
