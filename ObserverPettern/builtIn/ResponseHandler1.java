package ObserverPettern.builtIn;

import java.util.Observable;
import java.util.Observer;

public class ResponseHandler1 implements Observer {
    private String res;

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof String) {
            res = (String) arg;
            System.out.println("\nReceived Response: " + res);
        }
    }
}
