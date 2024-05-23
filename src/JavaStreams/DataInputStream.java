package JavaStreams;


import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.OutputStream;

public class DataInputStream extends DataOutputStream {
    /**
     * Creates a new data output stream to write data to the specified
     * underlying output stream. The counter {@code written} is
     * set to zero.
     *
     * @param out the underlying output stream, to be saved for later
     *            use.
     * @see FilterOutputStream#out
     */
    public DataInputStream(OutputStream out) {
        super(out);
    }

    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream = new FileInputStream("/Users/nishanthulwan/Desktop/S/Serialization.txt");
            java.io.DataInputStream dataInputStream = new java.io.DataInputStream(fileInputStream);

            Booking booking1 = new Booking();

            booking1.roll_no = dataInputStream.readInt();
            booking1.name = dataInputStream.readUTF();
            booking1.dept = dataInputStream.readUTF();

            System.out.println("Roll no " + booking1.roll_no);
            System.out.println("Name " + booking1.name);
            System.out.println("Dept " + booking1.dept);

            dataInputStream.close();
            fileInputStream.close();

        } catch (Exception exception) {
            System.out.println(exception);
        }
    }
}
