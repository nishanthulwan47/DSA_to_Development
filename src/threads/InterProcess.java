package threads;

class MyData1 {

    int value;

    boolean flag = true;

    synchronized public void set(int v) {

        while (flag!= true) {

            try {wait();} catch (Exception e) {}
        }
        value = v;
        flag = false;
        notify();
    }

    synchronized public int get() {
        int x = 0;

        while (flag!= false)
            try {
                wait();
            } catch(Exception e) {}
        x = value;
        flag = true;
        notify();


        return x;
    }
}

class Producer extends  Thread {
    MyData1 data;

    public Producer(MyData1 d) {
        data = d;
    }

    public void run() {

        int count  = 1;
        while (true) {
            data.set(count);
            System.out.println("Producer " +count);
            count++;
        }
    }
}

class Consumer extends Thread {



    MyData1 data;

    public Consumer(MyData1 d) {
        data = d;
    }

    public void run() {
        int value;

        while (true) {
            value = data.get();
            System.out.println("Consumer " +value);
        }
    }
}

public class InterProcess {

    public static void main(String[] args) {

        MyData1 myData1 = new MyData1();

        Producer producer = new Producer(myData1);

        Consumer consumer = new Consumer(myData1);

        producer.start();
        consumer.start();





    }
}
