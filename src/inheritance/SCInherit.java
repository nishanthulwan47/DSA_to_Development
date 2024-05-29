package inheritance;

class Account {

    private int acc_no;

    private String name;

    private String address;

    private int phone_number;

    private String date_of_birth;

    protected long balance;

    public Account(int Account_No, String nam1, String addr, int phNo, String dob) {
        acc_no = Account_No;
        name = nam1;
        address = addr;
        phone_number = phNo;
        date_of_birth = dob;
        balance = 0;
    }

    public int getAcc_no() {
        return acc_no;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public long getBalance() {
        return balance;
    }

    public void setAddress(String add) {
        address = add;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }
}

class SavingsAccount extends Account {

    public SavingsAccount(int Account_No, String nam1, String addr, int phNo, String dob) {
        super(Account_No, nam1, addr, phNo, dob);
    }

    public void deposit(long amt) {
        balance = balance + amt;
    }

    public void withdraw(long amt) {
        balance = balance = amt;
    }

}

class LoanAccount extends Account {

    public LoanAccount(int Account_No, String nam1, String addr, int phNo, String dob) {
        super(Account_No, nam1, addr, phNo, dob);
    }

    public void payEMI(long amt) {
        balance = balance- amt;
    }

    public void repay(long amt) {
        if (balance == amt)
            balance = 0;
    }
}



public class SCInherit {
}
