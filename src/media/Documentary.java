package media;

public class Documentary extends Movie{
    String subject;

    public Documentary(String title , int duration , String director , String subject){
        super(title , duration, director);
        this.subject=subject;
    }

    public void play (){
        super.play();
        System.out.println(" the documentary named"+" "+title+" "+"subject is "+" "+subject+" "+"directed by "+" "+director+" "+" for duration "+" "+duration);
    }
}
