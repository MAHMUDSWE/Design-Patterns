package ObserverPettern.custom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Publisher extends Observable {

    private List<Subscriber> subscribers = new ArrayList<>();

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void setChanged() throws IOException {
        System.out.print("Enter events message: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        events = br.readLine();
        notifyAllSubscriber();
    }

    @Override
    public void notifyAllSubscriber() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(events);
        }
    }

}
