package threads;

class Library {

    public  void checkIfBookisAvailable(String bookName) {

        synchronized (this) {

            System.out.print(bookName + " Checking");

            try {
                Thread.sleep(100);

            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Book is Available for Pickup");
        }

    }
}

class Customer1 extends Thread{

    String name;

    int BookId;

    Library libraryCard;

    Customer1(String n, int b, Library library) {

        name = n;

        BookId = b;

        libraryCard = library;
    }

    public void useLibrary() {

        libraryCard.checkIfBookisAvailable(name);


    }

    public void run() {
        useLibrary();
    }

}

public class IibrarySituation {

    public static void main(String[] args) {

        Library library = new Library();

        Customer1 customer1 = new Customer1("Lizzy", 23, library);
        Customer1 customer11 = new Customer1("Chris", 25, library);

        customer1.start();
        customer11.start();
    }
}
