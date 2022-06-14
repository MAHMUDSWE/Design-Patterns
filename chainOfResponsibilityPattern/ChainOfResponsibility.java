package chainOfResponsibilityPattern;

public class ChainOfResponsibility {
    private static Logger doChaining(){
        Logger consoleLogger = new ConsoleLogger(Logger.CONSOLEINFO);
        Logger warningLogger = new WarningLogger(Logger.WARNINGINFO);
        Logger ErrorLogger = new ErrorLogger(Logger.ERRORINFO);

        consoleLogger.setNextLevelLogger(warningLogger);
        warningLogger.setNextLevelLogger(ErrorLogger);

        return consoleLogger;
    }

    public static void main(String[] args) {
        Logger chainLogger = doChaining();

        chainLogger.logMessage(Logger.CONSOLEINFO, "Logger message from console. " +
                "Enter number: ");
        chainLogger.logMessage(Logger.WARNINGINFO, "Logger message from warning. " +
                "Variable may throw null pointer exception.");
        chainLogger.logMessage(Logger.ERRORINFO, "Logger message from Error. " +
                "An error has occurred.");
    }

}
