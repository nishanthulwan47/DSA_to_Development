package threads;

public class RunnableInterface implements Runnable{


    @Override
    public void run() {
        int i = 1;

        while (true) {
            System.out.println(i+" Hello");
            i++;
        }
    }

    public static void main(String[] args) {

        RunnableInterface runnableInterface = new RunnableInterface();


    }
}
