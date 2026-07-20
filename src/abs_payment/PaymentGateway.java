package abs_payment;

abstract class PaymentGateway {
    public void validateCard(){
        System.out.println("card validated");
    }
    abstract void processPayment(double amount);
}
