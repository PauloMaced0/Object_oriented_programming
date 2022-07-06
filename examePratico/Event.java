package examePratico;

import java.time.LocalDate;
import java.util.ArrayList;

public class Event implements IEvent {
    LocalDate date;

    ArrayList<Activity> atividades = new ArrayList<>();

    public void setAtividades(ArrayList<Activity> atividades) {
        this.atividades = atividades;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public Event addActivity(Activity activity) {
        atividades.add(activity);
        return null;
    }

    @Override
    public LocalDate getDate() {
        return date;
    }

    @Override
    public double eventPrice() {
        return 0;
    }
}
