import static java.lang.Math.*;

public class Sqrt extends Funct1{

    public Sqrt(Function x) {
        this.x = x;
    }

    public double getValue() {
        return sqrt(this.x.getValue());
    }

    public String toString() {
        String result = "Math.sqrt(" + this.x.toString() + ")";
        return result;
    }

}
