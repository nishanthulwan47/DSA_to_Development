package JavaStreams;


import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class Producer extends Thread {

    OutputStream outputStream;

    public Producer(OutputStream os) {
        outputStream = os;
    }

    public void run() {

        int count  = 1;

        while (true) {

            try {
                outputStream.write(count);
                outputStream.flush();

                System.out.println("Producer " +count);
                System.out.flush();

                Thread.sleep(100);
                count++;



            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}

class Consumer extends Thread {

    InputStream inputStream;

    public Consumer(InputStream inputStream1) {
        inputStream = inputStream1;
    }

    public void run() {

        int x;

        while (true) {

            try {
                x = inputStream.read();
                System.out.println("Consumer " +x);
                System.out.flush();
                Thread.sleep(10);

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
public class PipedDemo {

    public static void main(String[] args) throws Exception {

        PipedInputStream pipedInputStream = new PipedInputStream();
        PipedOutputStream pipedOutputStream = new PipedOutputStream();

        pipedOutputStream.connect(pipedInputStream);

        Producer producer = new Producer(pipedOutputStream);
        Consumer consumer = new Consumer(pipedInputStream);

        producer.start();

        consumer.start();
    }

}
