package overriding;

class Super1 {

    public void meth1() {
        System.out.println("Super Meth1");
    }

    public void meth2() {
        System.out.println("Super Meth2");
    }

}

class Sub1 extends Super1 {

    public void meth2() {
        System.out.println("Sub Meth2");
    }

    public void meth3() {
        System.out.println("Sub Meth3");
    }
}

public class DynamicDispatch {

    public static void main(String[] args) {

        Super1 super1 = new Super1();

        Sub1 sub1 = new Sub1();


    }
}
