package statePattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class User {
    public static void main(String[] args) throws IOException {

        Controller controller = new Controller();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter type of states: ");
        String values = br.readLine();

        if (values.equalsIgnoreCase("management")) {
            controller.setManagement();
        } else if (values.equalsIgnoreCase("sales")) {
            controller.setSales();
        } else if (values.equalsIgnoreCase("accounting")) {
            controller.setAccounting();
        }

        Controller.connection.open();
        Controller.connection.close();
        Controller.connection.log();
        Controller.connection.update();
    }
}
