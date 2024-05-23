package Collections;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Streams {

    public static void main(String[] args) throws Exception {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/nishanthulwan/Desktop/S/text.txt");
            String str = "LEarn Java Programming";

            byte b[] = str.getBytes();

            fileOutputStream.write(b, 6, str.length()-6);


            fileOutputStream.close();
        } catch (IOException exception) {
            System.out.println(exception);
        }

    }


}
