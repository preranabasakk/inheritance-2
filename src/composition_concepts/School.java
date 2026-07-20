package composition_concepts;

import java.util.ArrayList;

public class School {
    String schoolName;
ArrayList<ClassRoom> classRooms= new ArrayList<>();

public School(String schoolName){
    this.schoolName=schoolName;
}

public void addClassRoom(ClassRoom classRoom){
    classRooms.add(classRoom);

}
public void showSchool(){
    System.out.println("school name is "+" "+schoolName);
    System.out.println();
    for(ClassRoom classRoom:classRooms){
        classRoom.showStudents();
    }
}
}
