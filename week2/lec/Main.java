package week2.lec;

public class Main
{
    public static void main(String[] args)
    {
        Bank bank = new Bank();

        bank.deposit(1000.00);
        bank.withdrawMoney(500.00);
        System.out.println("Current balance: " + bank.getCurrentBalance());
    }
}
