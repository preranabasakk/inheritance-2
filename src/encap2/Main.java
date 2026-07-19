package encap2;

public class Main {
    public static void main(String [] args){
        Library lib=new Library("book store");
        lib.addBooks(20);
        lib.removeBooks(5);
        lib.toggleOpenStatus();
        lib.addBooks(20);
        lib.removeBooks(10);
        lib.toggleOpenStatus();
        lib.addBooks(5);
    }
}
