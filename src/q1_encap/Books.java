package q1_encap;

public class Books {
    String title ;
    String author ;

    public Books (String title , String author){
        this.title=title;
        this.author=author;
    }
    public void showBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
