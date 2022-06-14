package ObserverPettern.custom;

import java.io.IOException;

public class ObserverPatternDemo {

    public static void main(String[] args) throws IOException {
        Publisher publisher = new Publisher();

        Subscriber subscriber1 = new Subscriber();
        Subscriber subscriber2 = new Subscriber();

        publisher.addSubscriber(subscriber1);
        publisher.addSubscriber(subscriber2);

        publisher.setChanged();
    }

}
