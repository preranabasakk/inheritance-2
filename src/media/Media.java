package media;

public class Media {
    String title;
       int duration ;

        public Media(String title , int duration){
            this.title=title;
            this.duration=duration;
        }
        public void play(){
        System.out.println("media is playying");
            System.out.println(" the media named"+" "+title+" "+" for duration "+" "+duration);
        }
}
