package strategyPatternPractice;

public class Addition implements Method{
    @Override
    public float calculation(float a, float b) {
        return a+b;
    }
}
