package examePratico;

import java.time.LocalDate;
import java.util.ArrayList;

public class Event implements IEvent {
    LocalDate date;
    ArrayList<Activity> atividades;

    public Event(LocalDate date){
        this.date = date;
        this.atividades = new ArrayList<>();
    }

    public void setAtividades(ArrayList<Activity> atividades) {
        this.atividades = atividades;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public Event addActivity(Activity activity) {
        if(activity.getClass().equals(Catering.class) && hasCateringActivity()){
            return this;
        }
        
        atividades.add(activity);
        return this;
    }

    public boolean hasCateringActivity() { 
        for(Activity act : atividades)
            if(act.getClass().equals(Catering.class)){
                return true;
            }
        return false;
    }   

    @Override
    public LocalDate getDate() {
        return date;
    }

    @Override
    public double eventPrice() {
        double tot= 0;
        for(Activity act : atividades){
            tot += act.getActPrice() * act.getNrParticipantes();
        }
        return tot;
    }

    @Override
    public String toString(){
        String str = String.format("*** Evento em %s, total=%s euros",getDate(),eventPrice());
        for(Activity act : atividades){
            str += "\n" + act;
        }
        
        return str;
    }
}
