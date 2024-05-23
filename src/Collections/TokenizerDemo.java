package Collections;

import java.util.StringTokenizer;

public class TokenizerDemo {

    public static void main(String[] args) {

        String data = "name=Vijay;address=delhi;country=india;dept=cse";

        StringTokenizer stringTokenizer = new StringTokenizer(data, "=;");

        String s;

        while (stringTokenizer.hasMoreTokens()) {
            s = stringTokenizer.nextToken();
            System.out.println(s);
        }


    }
}
