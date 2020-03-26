public class Val extends Funct0 {

    public Val(double value) {
        this.val = value;
    }

    public double getValue() {
        return this.val;
    }

    public String toString() {
        String result = "" + this.val + "";
        return result;
    }

}
