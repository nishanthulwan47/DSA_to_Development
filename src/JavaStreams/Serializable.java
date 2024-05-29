package JavaStreams;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class Nishant implements java.io.Serializable {

    private int rollno;
    private String name;
    private float avg;
    private String dept;

    public static int Data = 10;

    public transient int t;

    public Nishant(int r, String n, float a, String d) {
        rollno = r;
        name = n;
        avg = a;
        dept = d;
        Data = 500;
        t = 500;
    }

    public String toString() {

        return "\nStudent Details\n" +
                "\nRoll " +rollno+
                "\nName " +name+
                "\nAverage " +avg+
                "\nAverage " +avg+
                "\nDept "+dept+
                "\nData "+Data+
                "\nTransient " +t+"\n";
    }


}

public class Serializable {

    public static void main(String[] args) {

        try {

            FileOutputStream fileOutputStream = new FileOutputStream("/Users/nishanthulwan/Desktop/S/Serialization1.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            Nishant nishant = new Nishant(10, "John", 89.9f, "CSE");

            objectOutputStream.writeObject(nishant);

            fileOutputStream.close();
            objectOutputStream.close();


        } catch (Exception exception) {
            System.out.println(exception);
        }

    }


}
