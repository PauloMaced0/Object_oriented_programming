public class Sport extends Activity {
    Sport.Modality mod;
    Integer val;

    Sport(Modality mod, Integer val) {
        this.mod = mod;
        this.val = val;
    }

    public Sport.Modality getMod() {
        return mod;
    }

    public Integer getVal() {
        return val;
    }

    public void setMod(Sport.Modality mod) {
        this.mod = mod;
    }

    public void setVal(Integer val) {
        this.val = val;
    }

    enum Modality {
        KAYAK, HIKING
    }
}
