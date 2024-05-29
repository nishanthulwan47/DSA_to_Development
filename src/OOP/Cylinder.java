package OOP;

class Cylinder1 {

    public double radius;

    public double height;

    public double LidArea() {
        return Math.PI*radius*radius;
    }

    public double totalSurfaceArea() {

        return 2* LidArea()+circumference()*height;
    }

    public double circumference() {
        return 2 * Math.PI*radius;
    }

    public double volume() {
        return LidArea()*height;
    }
}

public class Cylinder {

    public static void main(String[] args) {

        Cylinder1 cylinder1 = new Cylinder1();

        cylinder1.height = 10;
        cylinder1.radius = 3;

        System.out.println(cylinder1.circumference());
        System.out.println(cylinder1.LidArea());
        System.out.println(cylinder1.volume());
        System.out.println(cylinder1.totalSurfaceArea());
    }
}
