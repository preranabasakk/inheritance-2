package composition_concepts;

public class Students {
    String name ;
    int rollno;

    public Students(String name , int rollno){
        this.name=name;
        this.rollno=rollno;
    }
public void showStudents(){
        System.out.println(name +" "+ rollno);
}

}
