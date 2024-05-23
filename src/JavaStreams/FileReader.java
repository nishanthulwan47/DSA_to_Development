package JavaStreams;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

class Student1 {

    int roll_no;
    String name;
    String dept_no;
}

public class FileReader {

    public static void main(String[] args) throws Exception {



        FileInputStream fileInputStream = new FileInputStream("/Users/nishanthulwan/Desktop/S/text.txt");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));

        Student1 student = new Student1();

        student.roll_no = Integer.parseInt(bufferedReader.readLine());

        student.name = bufferedReader.readLine();

        student.dept_no = bufferedReader.readLine();

        System.out.println("Roll No" + student.roll_no);
        System.out.println("Name " + student.name);
        System.out.println("Dept " + student.dept_no);



    }
}
