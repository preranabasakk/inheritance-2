package q1_encap;

import java.util.ArrayList;

public class Library {

   ArrayList<Books> book= new ArrayList<>();

   public void addBooks(Books books){
       book.add(books);
   }
    public void displayBooks() {
        for (Books books : book) {
            books.showBook();
        }

    }

}
