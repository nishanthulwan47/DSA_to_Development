package Collections;

import java.io.FileOutputStream;
import java.util.Properties;

public class PropertyDemo {

    public static void main(String[] args) throws Exception {

        Properties properties = new Properties();

        properties.setProperty("Madie", "Grandview");
        properties.setProperty("Stanfill", "Boi");
        properties.setProperty("Gym", "Workout");

        System.out.println(properties);

        properties.store(new FileOutputStream("/Users/nishanthulwan/Desktop/S/Untitled.xml"), "Laptop");
    }
}
