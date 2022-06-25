public class Catering extends Activity {
    Catering.Option op;
    Integer val;

    Catering(Option op, Integer val) {
        this.op = op;
        this.val = val;
    }

    public Catering.Option getOp() {
        return op;
    }

    public Integer getVal() {
        return val;
    }

    public void setOp(Catering.Option op) {
        this.op = op;
    }

    public void setVal(Integer val) {
        this.val = val;
    }

    enum Option {
        FULL_MENU, DRINKS_AND_SNACKS
    }

}
