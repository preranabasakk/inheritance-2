package inter_report;

public class Main {
    public static void main(String[] args) {
        Reportable[] items = {new SalesModule(),
                new HrModule(), new Inventory()};
        for (Reportable item : items) {
            item.generateReport();
        }
    }
}

