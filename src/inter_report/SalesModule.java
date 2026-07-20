package inter_report;

public class SalesModule implements Reportable{
    @Override
    public void generateReport() {
        System.out.println("report of Sales Module ");
    }
}
