package threads;


class ATM {

    public void checkBalance(String name) {

        synchronized (this) {

            System.out.print(name + " Checking");

            try {
                Thread.sleep(1000);

            } catch (Exception exception) {
                System.out.println(exception);
            }
            System.out.println("Balance");
        }
    }

    public void withdraw(String name, int amount) {

        System.out.print(name + " withdrawing ");
        try {
            Thread.sleep(1000);
        } catch (Exception exception) {
            System.out.println(exception);
        }
        System.out.println(amount);
    }
}

class Customer extends Thread {

    String name;

    int amount;

    ATM atmcode;

    Customer(String n, int amt, ATM atmCode1) {

        name = n;
        amount = amt;
        atmcode = atmCode1;
    }

    public void useATM() {

        atmcode.checkBalance(name);
        atmcode.withdraw(name, amount);

    }

    public void run() {
        useATM();
    }


}

public class ATMCode {

    public static void main(String[] args) {

        ATM atm = new ATM();
        Customer customer = new Customer("Smith", 100, atm);
        Customer customer1 = new Customer("Nishant", 20, atm);
        customer.start();
        customer1.start();
    }
}
