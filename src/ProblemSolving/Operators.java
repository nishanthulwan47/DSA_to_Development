package ProblemSolving;

public class Operators {

    public static void main(String[] args) {

        Person obj1 = new Person();

        Person obj2 = new Boy();

        // As Obj is of type ProblemSolving.Person, it is not an

        // instance of ProblemSolving.Boy or interface

        System.out.println("obj1 instanceoF ProblemSolving.Person: " + (obj1 instanceof Person));
        System.out.println("obj1 instanceof ProblemSolving.Boy: " + (obj1 instanceof Boy));
        System.out.println("obj1 instanceof ProblemSolving.MyInterface: " + (obj1 instanceof  MyInterface));

        System.out.println("obj2 instanceof ProblemSolving.Person: " + (obj2 instanceof  Person));
        System.out.println("obj2 instanceof ProblemSolving.Boy: " + (obj2 instanceof  Boy));
        System.out.println("obj2 instanceof ProblemSolving.MyInterface: " + (obj2 instanceof MyInterface));

    }
}

class Person {

}

class Boy extends Person implements MyInterface {

}

interface MyInterface {

}
