import java.util.ArrayList;
import java.util.List;

public class Plus extends Funct2 {

    private List<Function> tab_x = new ArrayList<>();

    public Plus(Function x, Function y) {
        this.x = x;
        this.y = y;
    }

    public Plus(Function... x) {
        for ( Function val : x ) {
            this.tab_x.add(val);
        }
    }

    public double getValue() {
        double result = 0.0;
        if(!this.tab_x.isEmpty()) {
            for ( Function val : this.tab_x ) {
                result += val.getValue();
            }
        } else {
            result = this.x.getValue() + this.y.getValue();
        }
        return result;
    }

    public String toString() {
        String result = "(";
        int compteur = 0;
        if(this.tab_x.size() > 2) {
            for ( Function val : this.tab_x ) {
                result += val.toString();
                compteur ++;
                // Tout ça (le compteur) pour enlever le dernier " + " qui gène a l'affichage
                if(compteur != this.tab_x.size()) result += " + ";
            }
        } else {
            result += this.x.toString() + " + " + this.y.toString();
        }

        return result + ")";
    }
}
