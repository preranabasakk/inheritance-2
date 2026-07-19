package encap2;

public class Library {
    public String libraryName;
    private int totalBooks;
    private boolean isOpen;

    public Library(String libraryName){
        this.libraryName=libraryName;
        totalBooks=0;
        isOpen=false;
    }

    public int getTotalBooks() {
        return totalBooks;
    }

    public void setTotalBooks(int totalBooks) {
        this.totalBooks = totalBooks;
    }


    public void addBooks(int count) {

        if (isOpen) {
           totalBooks= totalBooks + count;
            System.out.println(count + " books added.");
        } else {
            System.out.println("Library is closed");
        }
    }
    public void removeBooks(int count) {
        if (!isOpen) {
            System.out.println("library is closed");
        } else if (count > totalBooks) {
            System.out.println("library has less books");
        } else {
            totalBooks = totalBooks - count;
            System.out.println("no of books are " + count);
        }
    }
  public void   toggleOpenStatus(){
        isOpen=!isOpen;

  }
}
