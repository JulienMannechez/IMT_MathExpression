import org.junit.Test;

import static org.junit.Assert.*;

public class test_Function {

    @Test
    public void testPlus() {
        System.out.println("----------TEST PLUS----------");

        // 5 + 6 = 11
        Function h = new Plus(new Val(5), new Val(6));
        System.out.println(h);
        assertEquals(11, h.getValue(), 0.0);

    }

    @Test
    public void testMinus() {
        System.out.println("----------TEST MINUS----------");

        Function h = new Minus(new Val(5), new Val(6));
        System.out.println(h);

        assertEquals(-1, h.getValue(), 0.0);
    }

    @Test
    public void testMul() {
        System.out.println("----------TEST MUL----------");

        Function h = new Mul(new Val(5), new Val(6));
        System.out.println(h);

        assertEquals(30, h.getValue(), 0.0);
    }

    @Test
    public void testSinus() {
        System.out.println("----------TEST SINUS----------");

        Var x = new Var("x");
        Var y = new Var("y");
        Var z = new Var("z");

        Function h = new Plus(new Sin(x), new Sin(y));
        // Sin(0) = 0
        System.out.println(h);
        assertEquals(0, h.getValue(), 0.0);

        x.setValue(5);
        // On met la valeur de x à 5
        // 0 + Sin(5)
        assertNotEquals(-0.95892427466314, h.getValue());
    }

    @Test
    public void testCosinus() {
        System.out.println("----------TEST COS----------");

        Var x = new Var("x");
        Var y = new Var("y");
        Var z = new Var("z");

        Function h = new Plus(new Cos(x), new Cos(y));
        System.out.println(h);
        // cos(0) = 1
        assertEquals(2, h.getValue(), 0.0);

        x.setValue(5);
        // On met la valeur de x à 5
        // 1 + cos(5)
        assertEquals(1.28366218546323, h.getValue(), 0.5);
    }

    @Test
    public void testSqr() {
        System.out.println("----------TEST SQR----------");

        Var x = new Var("x");
        Var y = new Var("y");
        Var z = new Var("z");

        Function g = new Plus(new Sqrt(x), new Plus(new Sqrt(y), new Sqrt(z)));
        System.out.println(g);
        assertEquals(0, g.getValue(), 0.0);

        x.setValue(9);
        y.setValue(25);
        // x = 9 et y = 25
        Function h = new Plus(new Sqrt(x), new Sqrt(y));
        // 3 + 5
        System.out.println(h);
        assertEquals(8, h.getValue(), 0.0);
    }

    @Test
    public void testExercice5() {
        System.out.println("----------TEST Exercice 5----------");
        Var x = new Var("x");

        x.setValue(-3);
        Function k0 = new Plus(new Sqr(new Sin(x)),new Sqr(new Cos(x)));
        System.out.println("Pour x = " + x.getValue() + " -> " + k0 + " = " + k0.getValue());
        assertEquals(1, k0.getValue(), 0.1);

        x.setValue(-2.13000);
        Function k1 = new Plus(new Sqr(new Sin(x)),new Sqr(new Cos(x)));
        System.out.println("Pour x = " + x.getValue() + " -> " + k1 + " = " + k1.getValue());
        assertEquals(1, k1.getValue(), 0.1);

        x.setValue(-1.26000);
        Function k2 = new Plus(new Sqr(new Sin(x)),new Sqr(new Cos(x)));
        System.out.println("Pour x = " + x.getValue() + " -> " + k2 + " = " + k2.getValue());
        assertEquals(1, k2.getValue(), 0.1);

        x.setValue(-0.39000);
        Function k3 = new Plus(new Sqr(new Sin(x)),new Sqr(new Cos(x)));
        System.out.println("Pour x = " + x.getValue() + " -> " + k3 + " = " + k3.getValue());
        assertEquals(1, k3.getValue(), 0.1);

        x.setValue(0.48000);
        Function k4 = new Plus(new Sqr(new Sin(x)),new Sqr(new Cos(x)));
        System.out.println("Pour x = " + x.getValue() + " -> " + k4 + " = " + k4.getValue());
        assertEquals(1, k4.getValue(), 0.1);

        x.setValue(1.35000);
        Function k5 = new Plus(new Sqr(new Sin(x)),new Sqr(new Cos(x)));
        System.out.println("Pour x = " + x.getValue() + " -> " + k5 + " = " + k5.getValue());
        assertEquals(1, k5.getValue(), 0.1);

        x.setValue(5.70000);
        Function k6 = new Plus(new Sqr(new Sin(x)),new Sqr(new Cos(x)));
        System.out.println("Pour x = " + x.getValue() + " -> " + k6 + " = " + k6.getValue());
        assertEquals(1, k6.getValue(), 0.1);
    }

    @Test
    public void Exercice6() {
        System.out.println("----------TEST Exercice 6----------");

        Function h = new Plus(new Val(5), new Val(6), new Val(10));
        System.out.println(h);
        assertEquals(21, h.getValue(), 0.0);

        Var x = new Var("x");
        Var y = new Var("y");
        Var z = new Var("z");

        Function x2 = new Sqr(x);
        Function y2 = new Sqr(y);
        Function z2 = new Sqr(z);
        Function g = new Plus(x2,y2,z2);
        System.out.println(g);

    }


}
