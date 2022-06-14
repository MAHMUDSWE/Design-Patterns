package chainOfResponsibilityPattern;

public class ErrorLogger extends Logger{
    public ErrorLogger(int levels) {
        this.levels = levels;
    }

    @Override
    public void displayLogInfo(String message) {
        System.out.println("Error log: " + message);
    }
}
