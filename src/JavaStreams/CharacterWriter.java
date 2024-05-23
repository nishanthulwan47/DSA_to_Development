package JavaStreams;

import java.io.CharArrayWriter;
import java.io.IOException;

public class CharacterWriter {

    public static void main(String[] args) throws IOException {

        char[] geek = {'G', 'E', 'E', 'K'};

        String geek_str;

        CharArrayWriter charArrayWriter = new CharArrayWriter();
        CharArrayWriter charArrayWriter1 = new CharArrayWriter();
        CharArrayWriter charArrayWriter2 = new CharArrayWriter();

        for (int c = 72; c < 77; c++) {

            charArrayWriter.write(c);
        }

        //Returning Buffer Content as String

        geek_str = charArrayWriter.toString();
        System.out.println("Using Write (int char): " +geek_str);


        charArrayWriter1.write(geek_str, 2, 3);

        System.out.println(charArrayWriter1.toString());

        charArrayWriter2.write(geek, 2, 3);
        System.out.println(charArrayWriter2.toString());

        String str = charArrayWriter2.toString();

        charArrayWriter2.writeTo(charArrayWriter);

        System.out.println(charArrayWriter.toString());

        System.out.println(charArrayWriter.size());
        System.out.println(charArrayWriter1.size());
        System.out.println(charArrayWriter2.size());

    }
}
