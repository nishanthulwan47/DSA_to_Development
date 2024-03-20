public class twoSComplement {

    public static void main(String[] args) {

        //Initial Values

        int a  = 5;

        int b = 7;

        // Bitwise And

        //0101 & 0111 = 0101 = 5
        System.out.println("a&b = " + (a & b));

        //bitwise or
        // 0101 | 0111 = 0111 = 7
        System.out.println("a|b = " + (a | b));

        //bitwise XOR
        // 0101 ^ 0111 = 0010 = 2
        System.out.println("a^b = " + (a ^ b));

        //bitwise not
        // ~000000
        System.out.println("~a = " + ~a);

        //can also Combined with Assignment Operator to provide shorthand
        //Assignment
        // a = a&b
        a &= b;
        System.out.println("a= " +a);
    }
}
