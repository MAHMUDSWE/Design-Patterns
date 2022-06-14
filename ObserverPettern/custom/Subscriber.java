package ObserverPettern.custom;

public class Subscriber implements Observer {
    @Override
    public void update(Object res) {
        if (res instanceof String) {
            String response = (String) res;

            System.out.println("Response: " + response);
        }
    }
}
