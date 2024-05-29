package threads;

public class Threads extends Thread {

    public void run() {

        int i = 1;

        while (true) {
            System.out.println(i +" Hello ");
            i++;
        }
    }

    public static void main(String[] args) {

        Threads threads = new Threads();
        Thread th = new Thread(threads);

        th.start();

        //threads.start();

        int i = 1;

        while (true) {

            System.out.println(i +" World");
        }

    }

}
