package composition_concepts;

public class Main {
    public static void main(String[] args){
        Students s1= new Students("amii",1);
        Students s2= new Students("ram",2);
        Students s3 = new Students("shyaam",3);
        Students s4 = new Students("ravi", 4);
        ClassRoom c1 = new ClassRoom("science");
        ClassRoom c2 = new ClassRoom("arts");
        ClassRoom c3 = new ClassRoom("commerce");

        c1.addStudent(s1);
        c1.addStudent(s2);
        c2.addStudent(s3);
        c3.addStudent(s4);

        School sc1= new School("abc academy");
        School sc2 = new School("xyz");
        sc1.addClassRoom(c1);
        sc2.addClassRoom(c2);
        sc2.addClassRoom(c3);


        sc1.showSchool();
        sc2.showSchool();
    }
}
