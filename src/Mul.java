public class Mul extends Funct2 {

    public Mul(Function x, Function y) {
        this.x = x;
        this.y = y;
    }

    public double getValue() {
        return this.x.getValue() * this.y.getValue();
    }

    public String toString() {
        String result = "(" + this.x.toString() + " * " + this.y.toString() + ")";
        return result;
    }
}