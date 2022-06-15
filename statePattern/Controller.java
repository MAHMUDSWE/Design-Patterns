package statePattern;

public class Controller {
    private static Accounting accounting;
    private static Sales sales;
    private static Management management;

    public Controller() {
        accounting = new Accounting();
        sales = new Sales();
        management = new Management();
    }

    public static Connection connection;

    public void setAccounting(){
        connection = accounting;
    }

    public void setSales(){
        connection = sales;
    }

    public void setManagement(){
        connection = management;
    }
}
