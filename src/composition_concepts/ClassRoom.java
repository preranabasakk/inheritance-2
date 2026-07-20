package composition_concepts;

import java.util.ArrayList;

public class ClassRoom {
    String className;
   ArrayList <Students>students = new ArrayList<>();
    public ClassRoom(String className){
        this.className= className;
    }
    public void addStudent(Students student){
        students.add(student);
    }
    public void showStudents(){
        System.out.println("class:"+" "+className);
        for (Students student:students){
            student.showStudents();
        }
        System.out.println();
    }

}
