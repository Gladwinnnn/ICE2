
// This class is for Q9
public class BankAccount {
    private double balance;

    public BankAccount(){
        balance = 500;
    }

    public BankAccount(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public boolean withdraw(double amount){
        if(balance < amount){
            return false;
        }
        this.balance -= amount;
        return true;
    }

    public boolean transfer(double amount,BankAccount otherAccount){
        if(otherAccount.getBalance() < amount){
            return false;
        }
        this.balance -= amount;
        otherAccount.balance += amount;
        return true;
    }
}