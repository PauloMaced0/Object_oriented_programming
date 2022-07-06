package examePratico;

public class Culture extends Activity {
    Culture.Option op;
    Integer val;

    Culture(Option op, Integer val) {
        this.op = op;
        this.val = val;
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
        ARCHITECTURAL_TOUR, ART_MUSEUM, RIVER_TOUR, WINE_TASTING
    }

}
