package examePratico;

public class Culture extends Activity {
    Culture.Option op;
    Integer val;

    Culture(Option op,int nrParticipantes) {
        super(nrParticipantes, 22);
        this.op = op;
    }

    public Culture.Option getOp() {
        return op;
    }

    public Integer getVal() {
        return val;
    }

    public void setOp(Culture.Option op) {
        this.op = op;
    }

    public void setVal(Integer val) {
        this.val = val;
    }

    public enum Option {
        ARCHITECTURAL_TOUR ("Architectural tour"), ART_MUSEUM ("Art museum"), RIVER_TOUR ("River tour"), WINE_TASTING ("Wine tasting");

        private final String name;

        private Option(String s){
            name = s;
        }

        @Override
        public String toString(){
            return this.name;
        }

    }

    @Override
    public String toString() {
        return String.format("      %s with %s participants.",getOp(),getNrParticipantes());
    }

}
