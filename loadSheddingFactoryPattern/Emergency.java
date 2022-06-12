package loadSheddingFactoryPattern;

public class Emergency extends LoadShedding{
    @Override
    public void action() {
        System.out.println("Load shedding happening on Emergency");
        durationRate = 3;
    }
}
