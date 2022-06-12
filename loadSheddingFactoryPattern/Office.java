package loadSheddingFactoryPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Office {

    public static void main(String[] args) throws IOException {
        GetLoadShedding getLoadShedding = new GetLoadShedding();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the type of load shedding that you want to occur: ");

        String loadSheddingName = br.readLine();

        LoadShedding loadShedding = getLoadShedding.getType(loadSheddingName);

        System.out.print("Enter minutes: ");
        int minutes = Integer.parseInt(br.readLine());

        loadShedding.action();

        int totalTime = loadShedding.totalTime(minutes);

        System.out.println("Total time of Load Shedding: "+ totalTime + " minutes");
    }

}
