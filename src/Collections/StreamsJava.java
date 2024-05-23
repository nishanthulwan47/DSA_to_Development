package Collections;

import java.io.FileInputStream;

public class StreamsJava {

    public static void main(String[] args) throws Exception {

        try (FileInputStream fileInputStream = new FileInputStream("/Users/nishanthulwan/Desktop/S/text.txt")) {

            byte[] data = new byte[fileInputStream.available()];

            fileInputStream.read(data);

            String str = new String(data);

            System.out.println(str);
        }

    }
}
