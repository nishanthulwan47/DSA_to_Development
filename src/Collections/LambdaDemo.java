package Collections;

@FunctionalInterface
interface MyLambda {
    public void display();

}

class Nishant implements MyLambda {

    public void display() {
        System.out.println("Hello World!");
    }
}

public class LambdaDemo {

    public static void main(String[] args) {

        MyLambda myLambda = ()-> {
                    System.out.println("Hello World");
        };
        myLambda.display();
    }
}
