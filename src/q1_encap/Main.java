package q1_encap;

public class Main {
    public static void main (String[] args){
        Books book1 = new Books("english ", " anna ");
        Books boo2 = new Books("english ", " an ");
        Library library = new Library();

        library.addBooks(book1);
        library.addBooks(boo2);

        library.displayBooks();
}
}