package overriding;

class Super {

    public void display() {
        System.out.println("Super Class Display");
    }
}

class Sub extends Super {
    public void display(int x) {
        System.out.println("Sub Class Display");
    }
}

public class Overriding {

    public static void main(String[] args) {

        Super su = new Super();

        su.display();

        Sub sub = new Sub();

        sub.display();
    }
}
