package ObserverPettern.custom;

import java.io.IOException;

public abstract class Observable {
    protected String events;

    public abstract void setChanged() throws IOException;

    public abstract void notifyAllSubscriber();
}
