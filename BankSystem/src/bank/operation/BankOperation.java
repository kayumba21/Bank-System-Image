package bank.operation;

public interface BankOperation {
    void deposit(double amount);
    void withdraw(double amount) throws InsufficientFundsException;
}
