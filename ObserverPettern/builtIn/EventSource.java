package ObserverPettern.builtIn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Observable;

public class EventSource extends Observable implements Runnable {
    @Override
    public void run() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 1;
        while (count>0){
            try {
                System.out.print("Set Response: ");
                String res = br.readLine();
                setChanged();
                notifyObservers(res);
                count = count - 1;

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
