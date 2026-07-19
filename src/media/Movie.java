package media;

public class Movie extends Media{
     String director;

    public Movie(String title , int duration , String director) {
        super(title, duration);
        this.director = director;
    }
    public void play(){
        super.play();
        System.out.println("movie is playying");
        System.out.println(" the movie named"+" "+title+" "+"directed by "+" "+director+" "+" for duration "+" "+duration);
    }
}
