package examePratico;

public class Catering extends Activity {
    Catering.Option op;

    Catering(Option op,int nrParticipantes) {
        super(nrParticipantes, 25);
        this.op = op;        
    }

    public Catering.Option getOp() {
        return op;
    }

    public void setOp(Catering.Option op) {
        this.op = op;
    }
    
    enum Option {
        FULL_MENU ("Full menu"), DRINKS_AND_SNACKS("Drinks and Snacks"),LIGHT_BITES("Light bites");

        private final String name;

        private Option(String s){
            name = s;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }

    @Override
    public String toString() {
        return String.format("      '%s' for %s participants.",getOp(),getNrParticipantes());
    }

}
