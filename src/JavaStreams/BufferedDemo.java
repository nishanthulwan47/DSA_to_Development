package JavaStreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedDemo {

    public static void main(String[] args) throws Exception{

        FileInputStream fileInputStream = new FileInputStream("/Users/nishanthulwan/Desktop/S/text.txt");

        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        System.out.println("IS mark Supported on File Input Stream?? " +fileInputStream.markSupported());

        System.out.println("Is Mark Supported on Buffered Input Stream?? " +bufferedInputStream.markSupported());

    }
}
