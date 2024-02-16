package lesson8.Assignment12;

import java.util.List;

public interface BankAccount {
    void deposit(double amount); // add amount to account balance
    void withdraw(double amount); // substract amount from account balance
    double getBalance(); // return current balance in account
    void transfer(BankAccount toAccount, double amount); // transfer fund to another account
    List<String> getTransactionHistory();
}
