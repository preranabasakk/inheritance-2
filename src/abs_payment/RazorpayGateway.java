package abs_payment;

public class RazorpayGateway extends PaymentGateway{
    public void validateCard(){
        super.validateCard();
    }
    public void processPayment(double amount){
        super.validateCard();
        System.out.println(amount+"rupess is being proccesed  by razorpayGateway");
    }
}
