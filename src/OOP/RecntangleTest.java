package OOP;

class Rectangle9 {

    private double length;

    private double breadth;

    public Rectangle9() {
        length = 1;
        breadth = 1;
    }

    public Rectangle9(double l, double b) {
        length = l;
        breadth = b;
    }

    public Rectangle9(double s) {
        length = breadth = s;
    }

}

public class RecntangleTest {

    public static void main(String[] args) {

        Rectangle9 rectangle9 = new Rectangle9(10 ,5);


    }

}
