public class Var extends Funct0 {

    private String name;

    public Var(String name) {
        this.val = 0;
        this.name = name;
    }

    public double getValue() {
        return this.val;
    }

    public void setValue(double val) {
        this.val = val;
    }

    public String toString() {
        String result = "" + this.name + "";
        return result;
    }


}
