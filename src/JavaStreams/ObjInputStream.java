package JavaStreams;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjInputStream extends  Serializable{

    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream = new FileInputStream("/Users/nishanthulwan/Desktop/S/Serialization1.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            Nishant nishant1 = (Nishant)objectInputStream.readObject();

            System.out.print(nishant1);

        } catch (Exception exception) {
            System.out.println(exception);
        }
    }
}
