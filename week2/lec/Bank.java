package week2.lec;

public class Bank {
    private Double balance;

    public Bank() {
        balance = 0.0;
    }

    public void deposit(Double amount) {
        balance = balance + amount;
    }

    public void withdrawMoney(Double amount) {
        balance = balance - amount;
    }

    public Double getCurrentBalance() {
        return balance;
    }
}
