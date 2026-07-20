package abs_payment;

public class StripeGateway extends  PaymentGateway{
    @Override
    public void validateCard() {
        super.validateCard();
    }

    public void processPayment(double amount){
        System.out.println(amount +" rupess is being is proccessed by StripeGateway");
    }
}
