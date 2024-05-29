package JavaStreams;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Customer1 implements Serializable {

    String customerId;
    String name;

    String phoneNumber;

    static int count = 0;

    Customer1() {

    }

    Customer1(String n, String p) {

        customerId = "C"+count;
        count++;
        name = n;
        phoneNumber = p;
    }

    public String toString() {

        return "Customer ID:"+customerId+"\nName : "+name+"\nPhonenumber: " +phoneNumber+"\n";
    }
}

public class Customer {

    public static void main(String[] args) throws Exception{

        Customer1 list[] = {new Customer1("Smith", "9833659986"), new Customer1("Carson", "2018731299"), new Customer1("Carly", "90876532")};

        FileOutputStream fileOutputStream = new FileOutputStream("Serial.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeInt(list.length);
        for (Customer1 customer1: list) {
            objectOutputStream.writeObject(customer1);
        }
        objectOutputStream.close();
        fileOutputStream.close();

    }


}
