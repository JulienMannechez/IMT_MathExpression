import static java.lang.Math.*;

public class Sin extends Funct1 {

    public Sin(Function x) {
        this.x = x;
    }

    public double getValue() {
        return sin(this.x.getValue());
    }

    public String toString() {
        String result = "Sin(" + this.x.toString() + ")";
        return result;
    }
}
