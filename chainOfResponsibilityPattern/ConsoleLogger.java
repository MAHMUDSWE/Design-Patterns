package chainOfResponsibilityPattern;

public class ConsoleLogger extends Logger {
    public ConsoleLogger(int levels) {
        this.levels = levels;
    }

    @Override
    public void displayLogInfo(String message) {
        System.out.println("Console log: " + message);
    }
}
