package lesson8.Assignment12;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(5000, 1.5);
        CheckingAccount checkingAccount = new CheckingAccount(700, 200);

        savingsAccount.deposit(600);
        savingsAccount.calculateInterest();
        checkingAccount.deposit(200);
        checkingAccount.withdraw(500);

        System.out.println("Savings account balance: RM " + savingsAccount.getBalance());
        System.out.println("Checking account balance: RM " + checkingAccount.getBalance());

        System.out.println("Savings account history.");
        for (String transaction : savingsAccount.getTransactionHistory()) {
            System.out.println(transaction);
        }

        System.out.println("Checking account history.");
        for (String transaction : checkingAccount.getTransactionHistory()) {
            System.out.println(transaction);
        }

        savingsAccount.transfer(checkingAccount, 200);

        System.out.println("Savings account balance after transfer: RM " + savingsAccount.getBalance());
        System.out.println("Checking account balance after transfer: RM " + checkingAccount.getBalance());
    }
}