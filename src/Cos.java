import static java.lang.Math.*;

public class Cos extends Funct1 {

    public Cos(Function x) {
        this.x = x;
    }

    public double getValue() {
        return cos(this.x.getValue());
    }

    public String toString() {
        String result = "Cos(" + this.x.toString() + ")";
        return result;
    }
}
