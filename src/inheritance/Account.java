package inheritance;

public class Account {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account(double balance){
        this.balance=balance;
    }
    public double applyMonthlyFee(){
       return balance -100.00;

    }
}
