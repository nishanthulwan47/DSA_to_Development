package inheritance;

class Circle {

    private double radius;

    public Circle() {
        radius = 4.0;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {

        return 2 * Math.PI*radius;
    }

    public double circumference() {
        return perimeter();
    }
}

class Cylinder extends Circle {

    private double height;

    public Cylinder() {
        height = 0.0;
    }

    public double volume() {
        return area()*height;
    }
}

public class Test {

    public static void main(String[] args) {

        Circle circle = new Circle();

        Cylinder cylinder = new Cylinder();

        System.out.println(circle.area());
        //cylinder.perimeter();
    }
}
