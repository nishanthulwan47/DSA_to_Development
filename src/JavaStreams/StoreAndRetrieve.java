package JavaStreams;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class StoreAndRetrieve {

    public static void main(String[] args) {

        try {

            float List[] = {1.2f, 3.45f, 6.78f, 9.01f, 2.34f};

            FileOutputStream fileOutputStream = new FileOutputStream("Serial.txt");
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);

            dataOutputStream.writeInt(List.length);

            for (float f: List) {
                dataOutputStream.writeFloat(f);
            }

            dataOutputStream.close();
            fileOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream("Serial.txt");
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);

            int length = dataInputStream.readInt();

            float data;

            for (int i = 0; i < length; i++) {
                data = dataInputStream.readFloat();
                System.out.println(data);
            }

            dataInputStream.close();
            fileInputStream.close();


        } catch (Exception exception) {

            System.out.println(exception);
        }

    }
}
