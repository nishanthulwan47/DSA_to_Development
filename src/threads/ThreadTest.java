package threads;

class MyRunnable implements Runnable {

    public void run() {

        int i = 1;
        while (true) {
            System.out.println(i+"Hello");
            i++;
        }
    }
}

public class ThreadTest {

    public static void main(String[] args) {

        MyRunnable myRunnable = new MyRunnable();

        Thread thread = new Thread(myRunnable);

        thread.start();

        int i = 1;

        while (true) {
            System.out.println(i+"World");
        }
    }


}

