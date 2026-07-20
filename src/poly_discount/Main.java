package poly_discount;

public class Main {
    public static void main(String [] args){
        Discount discountt = new Discount(400,20);
        discountt.applyDiscount(500);
        discountt.applyDiscount(500,0.20);
        discountt.applyDiscount(1000,0.20,false);
        discountt.applyDiscount(1000,0.20,true);
    }
}
