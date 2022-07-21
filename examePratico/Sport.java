package examePratico;

public class Sport extends Activity {
    Sport.Modality mod;

    Sport(Modality mod, int nrParticipantes) {
        super(nrParticipantes,30);
        this.mod = mod;
    }

    public Sport.Modality getMod() {
        return mod;
    }

    public void setMod(Sport.Modality mod) {
        this.mod = mod;
    }

    enum Modality {
        KAYAK ("Kayak"), HIKING("Hiking"), BIKE("Bike"), BOWLING("Bowling");

        private final String name;

        private Modality(String s){
            name = s;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }

    @Override
    public String toString() {
        return String.format("      %s sporting activity with %s participants.",getMod(),getNrParticipantes());
    }
}
