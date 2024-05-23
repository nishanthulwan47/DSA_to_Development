package JavaStreams;

import java.io.FileOutputStream;

class Booking {

    int roll_no;
    String name;
    String dept;
}

public class DataOutputStream {

    public static void main(String[] args) {

        try {

            FileOutputStream fileOutputStream = new FileOutputStream("/Users/nishanthulwan/Desktop/S/Serialization.txt");
            java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(fileOutputStream);

            Booking booking = new Booking();

            booking.roll_no = 50;
            booking.dept = "Name";
            booking.name = "What";

            dataOutputStream.writeInt(booking.roll_no);
            dataOutputStream.writeUTF(booking.dept);
            dataOutputStream.writeUTF(booking.name);

            fileOutputStream.close();
            dataOutputStream.close();


        } catch (Exception exception) {
            System.out.println(exception);
        }
    }
}
