package JavaStreams;

import java.io.FileOutputStream;
import java.io.PrintStream;

class Student {

    int roll_no;
    String name;

    String dept;
}

public class PrintStreamDemo {

    public static void main(String[] args) throws Exception {

        FileOutputStream fileOutputStream = new FileOutputStream("/Users/nishanthulwan/Desktop/S/text.txt");

        PrintStream printStream = new PrintStream(fileOutputStream);

        Student student = new Student();

        student.roll_no = 10;
        student.name = "Nishant";
        student.dept = "CSE";

        printStream.println(student.roll_no);
        printStream.println(student.name);
        printStream.println(student.dept);

        printStream.close();
        fileOutputStream.close();

    }
}
