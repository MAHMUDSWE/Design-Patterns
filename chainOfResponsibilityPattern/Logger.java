package chainOfResponsibilityPattern;

public abstract class Logger {
    public static int CONSOLEINFO = 1;
    public static int WARNINGINFO = 2;
    public static int ERRORINFO = 3;
    protected int levels;

    protected Logger nextLevelLogger;

    public void setNextLevelLogger(Logger nextLevelLogger) {
        this.nextLevelLogger = nextLevelLogger;
    }

    public void logMessage(int levels, String message) {
        if (this.levels <= levels) {
            displayLogInfo(message);
        }
        if (nextLevelLogger != null) {
            nextLevelLogger.logMessage(levels, message);
        }
    }

    public abstract void displayLogInfo(String message);

}
