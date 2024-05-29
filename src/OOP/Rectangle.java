package OOP;

class Rectangle1 {

   public double length;

    public double breadth;

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }

    public boolean isSquare() {
        if (length == breadth) {
            return true;
        } else {
            return false;
        }
    }
}

public class Rectangle {

    public static void main(String[] args) {



        Rectangle1 r1 = new Rectangle1();

        r1.breadth = 23;
        r1.length = 21;
        System.out.println(r1.area());

        Rectangle1 r2 = new Rectangle1();
        r2.length = 21;
        r2.breadth = 20;
        System.out.println(r2.area());







    }


}
