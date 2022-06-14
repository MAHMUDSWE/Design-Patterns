package chainOfResponsibilityPattern;

public class WarningLogger extends Logger {
    public WarningLogger(int levels) {
        this.levels = levels;
    }

    @Override
    public void displayLogInfo(String message) {
        System.out.println("Warning Log: " + message);
    }
}
