package inheritance;

public class Main {
    public static void main (String [] args){
        Account a = new Account(500.00);
       System.out.println( a.applyMonthlyFee());
       PremiumAccount p = new PremiumAccount(1000);
       System.out.println(p.applyMonthlyFee());

        System.out.println(p.applyMonthlyFee(200));


    }
}
