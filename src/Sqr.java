import static java.lang.Math.*;

public class Sqr extends Funct1{

    public Sqr(Function x) {
        this.x = x;
    }

    public double getValue() {
        return pow(this.x.getValue(), 2);
    }

    public String toString() {
        String result = "(" + this.x.toString() + ")^2";
        return result;
    }

}
