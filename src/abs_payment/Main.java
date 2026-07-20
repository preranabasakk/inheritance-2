package abs_payment;

public class Main {
    public static void main (String [] args ){
        PaymentGateway pay= new RazorpayGateway();
        pay.validateCard();
        pay.processPayment(200.00);
        PaymentGateway pay2 = new StripeGateway();
        pay2.validateCard();
        pay2.processPayment(3000);
        PaymentGateway pay1= new RazorpayGateway();
        pay1.processPayment(500);
    }
}
