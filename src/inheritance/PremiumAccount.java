package inheritance;

public class PremiumAccount extends Account {
    public PremiumAccount(double balance){
        super(balance);

    }
    public double applyMonthlyFee(){
        return getBalance()-50;
    }
    public double applyMonthlyFee(double customFee){
        return getBalance()-customFee;

    }
}
