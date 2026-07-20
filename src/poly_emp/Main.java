package poly_emp;

public class Main {
    public static void main (String[]args){
        Employee e = new FullTime();
        e.getBenifits();
        Employee e2= new Intern();
        e2.getBenifits();
        Employee e3 = new Employee();
        e3.getBenifits();
    }
}
