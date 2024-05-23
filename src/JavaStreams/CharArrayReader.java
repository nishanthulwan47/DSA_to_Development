package JavaStreams;

public class CharArrayReader {

    public static void main(String[] args) throws Exception{

        char c[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};

        java.io.CharArrayReader charArrayReader = new java.io.CharArrayReader(c);

        int x;

        while ((x= charArrayReader.read())!= -1) {

            System.out.print((char)x);
        }

        charArrayReader.close();


    }
}
