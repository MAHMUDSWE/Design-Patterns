package statePattern;

public class Accounting implements Connection {
    @Override
    public void open() {
        System.out.println("Open database for Accounting");
    }

    @Override
    public void close() {
        System.out.println("Close database for Accounting");
    }

    @Override
    public void log() {
        System.out.println("Log Activities");
    }

    @Override
    public void update() {
        System.out.println("Database have been updated");
    }
}
