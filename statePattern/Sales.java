package statePattern;

public class Sales implements Connection {
    @Override
    public void open() {
        System.out.println("Open database for Sales");
    }

    @Override
    public void close() {
        System.out.println("Close database for Sales");
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
