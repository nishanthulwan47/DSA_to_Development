package JavaStreams;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteDemo {

    public static void main(String[] args) throws Exception {

        byte b[] = {'a', 'b', 'c', 'd', 'e', 'i', 'f'};

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(20);

       byteArrayOutputStream.writeTo(new FileOutputStream("/Users/nishanthulwan/Desktop/S/Destination.txt"));

        byteArrayOutputStream.close();
    }
}
