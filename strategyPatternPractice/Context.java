package strategyPatternPractice;

public class Context {
    private Method method;

    public Context(Method method) {
        this.method = method;
    }

    public float executeMethod(float a, float b){
        return method.calculation(a, b);
    }
}
