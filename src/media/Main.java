package media;

public class Main {
    public static void main (String [] args){
        Documentary doc= new Documentary(" natGeo",3,"abc","animals");
        doc.play();
        Movie movie = new Movie("sherlock homes",4,"xyz");
        movie.play();
        Media media = new Media("hahah",2);
        media.play();


    }
}
