package loadSheddingFactoryPattern;

public abstract class LoadShedding {

    protected int durationRate; //

    abstract void action();

    public int totalTime(int minutes){
        return durationRate * minutes;
    }
}
