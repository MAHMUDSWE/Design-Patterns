package loadSheddingFactoryPattern;

public class Urgent extends LoadShedding{
    @Override
    public void action() {
        System.out.println("Load shedding happening Urgent.");
        durationRate = 2;
    }
}
