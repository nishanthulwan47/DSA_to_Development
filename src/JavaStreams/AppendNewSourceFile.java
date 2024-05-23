package JavaStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class AppendNewSourceFile {

    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream = new FileInputStream("/Users/nishanthulwan/Desktop/S/Source1.txt");
            FileInputStream fileInputStream1 = new FileInputStream("/Users/nishanthulwan/Desktop/S/Source2.txt");
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/nishanthulwan/Desktop/S/Destination.txt");

            SequenceInputStream sequenceInputStream = new SequenceInputStream(fileInputStream, fileInputStream1);

            int b;

            while((b = sequenceInputStream.read()) != -1) {
                fileOutputStream.write(b);
            }

            sequenceInputStream.close();
            fileOutputStream.close();
            fileInputStream.close();
            fileInputStream1.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
