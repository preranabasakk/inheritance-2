package poly_emp;

public class FullTime extends Employee{
    @Override
    public void getBenifits() {
        super.getBenifits();
        System.out.println("Fulltime benifits");
    }
}
