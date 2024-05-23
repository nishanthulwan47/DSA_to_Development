package JavaStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadFromOneFileCopy {

    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream = new FileInputStream("/Users/nishanthulwan/Desktop/S/Source1.txt");
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/nishanthulwan/Desktop/S/Source2.txt");

            int b;

            while ((b = fileInputStream.read())!= -1) {

                if (b >= 65 && b<= 90)
                    fileOutputStream.write(b+32);
                else
                    fileOutputStream.write(b);
            }

            fileInputStream.close();
            fileOutputStream.close();


        } catch (Exception exception) {
            System.out.println(exception);
        }
    }
}
