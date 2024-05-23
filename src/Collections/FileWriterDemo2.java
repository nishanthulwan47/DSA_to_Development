package Collections;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo2 {

    public static void main(String[] args) {

        String str = "Welcome to Nishant";

        try {

            FileWriter fileWriter = new FileWriter("/Users/nishanthulwan/Desktop/S/text.txt");

            for (int i = 0; i < str.length(); i++) {
                fileWriter.write(str.charAt(i));
            }

            System.out.println("Seuccesfully Written");

            fileWriter.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
