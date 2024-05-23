package Collections;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Scanner;

class Account implements Serializable {

    String accountNumber;
    String name;
    double balance;

    Account() {}

    Account(String a, String n, double b) {

        accountNumber = a;
        name = n;
        balance = b;
    }

    public String toString() {
        return "Account No:"+accountNumber+"\nName :"+name+"\nBalance :"+balance+"\n";
    }
}

public class MenuDriven {

   public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       Account account = null;

       HashMap<String, Account> hashMap = new HashMap<>();




   }



}
