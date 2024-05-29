package inheritance;

class Parent {

    public Parent() {
        System.out.println("PArent Constructor");
    }
}

class Child extends Parent {

    public Child() {
        System.out.println("Child Constructor");
    }
}

class GrandChild extends Child {

    public GrandChild() {
        System.out.println("Grand Child Constructor");
    }
}

public class InheritConst {

    public static void main(String[] args) {

        GrandChild child = new GrandChild();


    }
}
