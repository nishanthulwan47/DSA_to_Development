package threads;

class MyThread extends Thread {

    public MyThread(String name) {

        super(name);
    }

    public void run() {

        int count = 1;

        while(true) {
            System.out.println(count++);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException exception) {
                System.out.println(exception);
            }
        }
    }
}

public class ConstructorsOFThreadClass {

    public static void main(String[] args) throws Exception {

    MyThread myThread = new MyThread("My Thread");

        System.out.println(myThread.getId());
        System.out.println(myThread.getName());
        myThread.start();
        System.out.println(myThread.getPriority());
        System.out.println(myThread.getState());
        System.out.println(myThread.isAlive());
        System.out.println(myThread.isInterrupted());




    }
}
