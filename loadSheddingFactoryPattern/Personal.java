package loadSheddingFactoryPattern;

public class Personal extends LoadShedding{
    @Override
    public void action() {
        System.out.println("Load shedding happening for Personal.");
        durationRate = 1;
    }
}
