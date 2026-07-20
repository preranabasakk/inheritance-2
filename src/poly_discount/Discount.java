package poly_discount;

public class Discount {
    int price ;
    boolean isMember ;
    double percentage ;

    public Discount(int price,double percentage){
        this.price=price ;
        this.percentage=percentage;
        isMember=false;
    }



    public void  applyDiscount(int price ){
    double newPrice =price-(price*0.10);
    System.out.println("the price after discount is "+" "+newPrice);
    }

    public void applyDiscount(int price ,double percentage){
        double newPrice = price-(price*percentage);
        System.out.println("Price after discount is "+newPrice);
    }

    public void applyDiscount(int price, double percentage, boolean isMember) {

        double newPrice = price - (price * percentage);

        if (isMember) {
            newPrice = newPrice - (price * 0.05);
        }

        System.out.println("Price after discount is " + newPrice);
    }
    }

