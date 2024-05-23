package JavaStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

class Travel {

    int booking_number;

    String trip_name;

    int train_number;

    String destination;
}

public class PrintStreamDemo1 {

    public static void main(String[] args) throws Exception {

        FileOutputStream fileOutputStream = new FileOutputStream("/Users/nishanthulwan/Desktop/S/newfile.txt");

        PrintStream printStream = new PrintStream(fileOutputStream);

        Travel travel = new Travel();

        travel.booking_number = 10;
        travel.destination = "San Jose";
        travel.train_number = 20;
        travel.trip_name = "Santa Barbara";

        printStream.println(travel.booking_number);
        printStream.println(travel.destination);
        printStream.println(travel.train_number);
        printStream.println(travel.trip_name);

        printStream.close();
        fileOutputStream.close();
    }
}
