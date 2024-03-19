import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        String user = "geek";

        String pwd = "geek";

        Scanner sc = new Scanner(System.in);

        String iu = sc.next();

        String ip = sc.next();

        if (user.equals(iu) && pwd.equals(ip)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Try Again later");
        }
    }
}
