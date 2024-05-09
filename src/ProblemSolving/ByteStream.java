package ProblemSolving;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {

    public static void main(String[] args) throws IOException {

        FileInputStream sourceStream = null;

        FileOutputStream targetStream = null;

        // Try block to check for Exceptions

        try {
            // Passing the files via local directory

            sourceStream = new FileInputStream("/Users/nishanthulwan/jbr_err_pid88825.log");
            targetStream = new FileOutputStream("/Users/nishanthulwan/jbr_err_pid88825.log");

            //Reading source file and writing content to target file byte by byte

            int temp;
            // If there is a content inside the file then read

            while((temp = sourceStream.read()) != -1) {
                targetStream.write((byte)temp);
            }
            System.out.println("Program Successfully Executed");
        } finally {
            if (sourceStream != null) {
                sourceStream.close();
            }

            if (targetStream != null) {
                targetStream.close();
            }
        }
    }
}
