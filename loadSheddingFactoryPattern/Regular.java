package loadSheddingFactoryPattern;

public class Regular extends LoadShedding{
    @Override
    public void action() {
        System.out.println("Load Shedding happening on regular basis.");
        durationRate = 4;
    }
}
