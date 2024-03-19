import java.io.FileReader;
import java.io.IOException;

public class GFG {

    public static void main(String[] args) throws IOException {

        // Initially assigning null since we have not read anything

        FileReader sourceStream = null;

        // Try block to check for Exceptions

        try {
            // Reading from file

            sourceStream = new FileReader("/Users/nishanthulwan/output.json");

            //Reading from sourcefile and writing content to target file character by character

            int temp;

            //if there is content inside the file then read the file

            while((temp = sourceStream.read()) != -1) {
                System.out.print((char) temp);
            }
            System.out.print("Program Successfully Executed");
        } finally {
            // Closing Stream as no longer in use

            if (sourceStream != null) {
                sourceStream.close();
            }
        }
    }
}
